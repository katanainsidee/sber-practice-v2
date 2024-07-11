import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import SomeClasses.ClassA;
import SomeClasses.ClassB;
import SomeClasses.ClassC;
import org.junit.Test;

import java.lang.reflect.Method;

public class ClassATest {

    @Test
    public void testMethodAWithException() throws Exception {
        ClassC mockClassC = mock(ClassC.class);

        ClassB mockClassB = new ClassB(mockClassC);

        when(mockClassC.methodC()).thenThrow(new Exception("Exception in methodC"));

        ClassA classA = new ClassA(mockClassB);

        String result = classA.methodA();
        assertEquals("Exception caught in methodA", result);

        verify(mockClassC, times(1)).methodC();
    }

    @Test
    public void testPrivateMethodA() throws Exception {
        ClassB mockClassB = mock(ClassB.class);

        ClassA classA = new ClassA(mockClassB);

        Method privateMethodA = ClassA.class.getDeclaredMethod("privateMethodA");
        privateMethodA.setAccessible(true);
        String result = (String) privateMethodA.invoke(classA);

        assertEquals("privateA", result);
    }
}
