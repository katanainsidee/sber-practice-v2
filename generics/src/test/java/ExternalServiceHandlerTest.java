import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExternalServiceHandlerTest {

    @Test
    public void testServiceAHandler() {
        ServiceARequest request = new ServiceARequest();
        ServiceAHandler handler = new ServiceAHandler();
        try {
            ServiceAResponse response = handler.handleRequest(request);
            assertTrue(response.isValid());
        } catch (IllegalArgumentException e) {
            fail("Validation failed: " + e.getMessage());
        }
    }

    @Test
    public void testServiceBHandler() {
        ServiceBRequest request = new ServiceBRequest();
        ServiceBHandler handler = new ServiceBHandler();
        try {
            ServiceBResponse response = handler.handleRequest(request);
            assertTrue(response.isValid());
        } catch (IllegalArgumentException e) {
            fail("Validation failed: " + e.getMessage());
        }
    }
}
