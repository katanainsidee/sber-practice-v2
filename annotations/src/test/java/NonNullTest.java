import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import AnnotationsPackage.*;

public class NonNullTest {

    @Test
    public void testNonNullMethod1ChildClass1() {
        ChildClass1 child = new ChildClass1();
        assertThrows(NullPointerException.class, () -> {
            child.method1(null);
        });
    }

    @Test
    public void testNonNullMethod2ChildClass1() {
        ChildClass1 child = new ChildClass1();
        assertThrows(NullPointerException.class, () -> {
            child.method2(null);
        });
    }

    @Test
    public void testNonNullMethod1ChildClass2() {
        ChildClass2 child = new ChildClass2();
        assertThrows(NullPointerException.class, () -> {
            child.method1(null);
        });
    }

    @Test
    public void testNonNullMethod2ChildClass2() {
        ChildClass2 child = new ChildClass2();
        assertThrows(NullPointerException.class, () -> {
            child.method2(null);
        });
    }
}
