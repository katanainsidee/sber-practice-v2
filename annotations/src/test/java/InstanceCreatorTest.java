import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AnnotationsPackage.*;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

public class InstanceCreatorTest {

    @Test
    public void testCreateInstancesForMonday() {
        LocalDateTime monday = LocalDateTime.of(2023, 7, 10, 0, 0); // Monday
        DataContainer data = new DataContainer();

        List<Object> instances = InstanceCreator.createInstances(monday, data);

        assertEquals(1, instances.size());
        assertTrue(instances.get(0) instanceof ChildClass1);
    }

    @Test
    public void testCreateInstancesForWednesday() {
        LocalDateTime wednesday = LocalDateTime.of(2023, 7, 12, 0, 0); // Wednesday
        DataContainer data = new DataContainer();

        List<Object> instances = InstanceCreator.createInstances(wednesday, data);

        assertEquals(1, instances.size());
        assertTrue(instances.get(0) instanceof ChildClass2);
    }

    @Test
    public void testCreateInstancesForOtherDays() {
        LocalDateTime friday = LocalDateTime.of(2023, 7, 14, 0, 0); // Friday
        DataContainer data = new DataContainer();

        List<Object> instances = InstanceCreator.createInstances(friday, data);

        assertEquals(0, instances.size());
    }
}
