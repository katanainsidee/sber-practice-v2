import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ClassBTest {
    @Test
    public void testMethodBWithException() {
        ClassC mockClassC = mock(ClassC.class);

        try {
            when(mockClassC.methodC()).thenThrow(new Exception("Exception in methodC"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        ClassB classB = new ClassB(mockClassC);

        try {
            classB.methodB();
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            assertEquals("Exception in methodC", e.getMessage());
        }

        try {
            verify(mockClassC, times(1)).methodC();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
