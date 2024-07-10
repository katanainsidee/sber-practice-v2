import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import AnnotationsPackage.*;
import java.lang.reflect.Method;

public class ScheduleTest {

    @Test
    public void testChildClass1Method1Schedules() throws NoSuchMethodException {
        Method method = ChildClass1.class.getMethod("method1", DataContainer.class);
        Schedule[] schedules = method.getAnnotationsByType(Schedule.class);

        int[] expectedHours = {1, 13};
        int[] expectedPriorities = {1, 2};
        String[] expectedDescriptions = {"Morning task", "Afternoon task"};

        for (int i = 0; i < schedules.length; i++) {
            assertEquals(expectedHours[i], schedules[i].hours());
            assertEquals(expectedPriorities[i], schedules[i].priority());
            assertEquals(expectedDescriptions[i], schedules[i].description());
        }
    }

    @Test
    public void testChildClass1Method2Schedule() throws NoSuchMethodException {
        Method method = ChildClass1.class.getMethod("method2", DataContainer.class);
        Schedule schedule = method.getAnnotation(Schedule.class);

        assertEquals(17, schedule.hours());
        assertEquals(3, schedule.priority());
        assertEquals("Evening task", schedule.description());
    }

    @Test
    public void testChildClass2Method1Schedule() throws NoSuchMethodException {
        Method method = ChildClass2.class.getMethod("method1", DataContainer.class);
        Schedule schedule = method.getAnnotation(Schedule.class);

        assertEquals(10, schedule.hours());
        assertEquals(1, schedule.priority());
        assertEquals("Late morning task", schedule.description());
    }

    @Test
    public void testChildClass2Method2Schedule() throws NoSuchMethodException {
        Method method = ChildClass2.class.getMethod("method2", DataContainer.class);
        Schedule schedule = method.getAnnotation(Schedule.class);

        assertEquals(20, schedule.hours());
        assertEquals(2, schedule.priority());
        assertEquals("Night task", schedule.description());
    }
}
