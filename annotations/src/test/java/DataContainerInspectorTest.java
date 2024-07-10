import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import AnnotationsPackage.*;
import org.junit.jupiter.api.Test;

public class DataContainerInspectorTest {

    @Test
    public void testInspectDataContainer() {
        DataContainer data = new DataContainer(2, "test", true);

        DataContainerInspector.inspectDataContainer(data);

        assertEquals(2, data.getIntField());
        assertEquals("test", data.getStringField());
        assertTrue(data.isBooleanField());
    }
}
