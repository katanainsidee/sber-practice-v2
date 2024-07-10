import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.Method;

public class ClassATest {
    @Test
    public void testMethodAWithException() {
        ClassB mockClassB = mock(ClassB.class);

        try {
            when(mockClassB.methodB()).thenThrow(new Exception("Exception in methodB"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClassA classA = new ClassA(mockClassB);

        String result = classA.methodA();

        assertEquals("Exception caught in methodA", result);

        try {
            verify(mockClassB, times(1)).methodB();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
