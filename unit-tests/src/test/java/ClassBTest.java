import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import SomeClasses.ClassB;
import SomeClasses.ClassC;

public class ClassBTest {

    @Test
    public void testMethodBWithException() throws Exception {
        ClassC mockClassC = mock(ClassC.class);

        when(mockClassC.methodC()).thenThrow(new Exception("Exception in methodC"));

        ClassB classB = new ClassB(mockClassC);

        Exception exception = assertThrows(Exception.class, classB::methodB, "Expected exception was not thrown");

        assertEquals("Exception in methodC", exception.getMessage());

        verify(mockClassC, times(1)).methodC();
    }
}


