import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;
import AnnotationsPackage.*;
import org.junit.jupiter.api.Test;

public class MethodInvokerTest {

    @Test
    public void testInvokeMethodsInOrder() {
        DataContainer data = new DataContainer(1, "initial", false);
        ChildClass1 child1 = new ChildClass1();
        ChildClass2 child2 = new ChildClass2();

        List<Object> instances = new ArrayList<>();
        instances.add(child1);
        instances.add(child2);

        assertDoesNotThrow(() -> MethodInvoker.invokeMethodsInOrder(instances, data));
    }
}
