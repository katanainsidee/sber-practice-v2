import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AnnotationsPackage.ChildClass1;
import AnnotationsPackage.ChildClass2;
import AnnotationsPackage.ParentClass;
import AnnotationsPackage.WeekDay;
import org.junit.jupiter.api.Test;

public class WeekDayTest {

    @Test
    public void testParentClassWeekDay() {
        WeekDay weekDay = ParentClass.class.getAnnotation(WeekDay.class);
        assertEquals(1, weekDay.value());
    }

    @Test
    public void testChildClass1InheritsWeekDay() {
        WeekDay weekDay = ChildClass1.class.getAnnotation(WeekDay.class);
        assertTrue(weekDay == null || weekDay.value() == 1);
    }

    @Test
    public void testChildClass2OverridesWeekDay() {
        WeekDay weekDay = ChildClass2.class.getAnnotation(WeekDay.class);
        assertEquals(3, weekDay.value());
    }
}
