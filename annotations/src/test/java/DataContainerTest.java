import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import AnnotationsPackage.*;
public class DataContainerTest {

    @Test
    public void testNoArgsConstructor() {
        DataContainer dataContainer = new DataContainer();
        assertEquals(0, dataContainer.getIntField());
        assertEquals(null, dataContainer.getStringField());
        assertEquals(false, dataContainer.isBooleanField());
    }

    @Test
    public void testAllArgsConstructor() {
        DataContainer dataContainer = new DataContainer(1, "test", true);
        assertEquals(1, dataContainer.getIntField());
        assertEquals("test", dataContainer.getStringField());
        assertEquals(true, dataContainer.isBooleanField());
    }

    @Test
    public void testSettersAndGetters() {
        DataContainer dataContainer = new DataContainer();
        dataContainer.setIntField(1);
        dataContainer.setStringField("test");
        dataContainer.setBooleanField(true);

        assertEquals(1, dataContainer.getIntField());
        assertEquals("test", dataContainer.getStringField());
        assertEquals(true, dataContainer.isBooleanField());
    }
}
