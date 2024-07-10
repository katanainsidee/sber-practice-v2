import static org.junit.Assert.*;
import org.junit.Test;

public class BankOnlineTest {

    private final BankOnline bankOnline = new BankOnline();

    @Test(expected = NullArgumentException.class)
    public void testSend_NullCardNumber() throws BankOnlineException {
        bankOnline.send(null, 1000.0);
    }

    @Test(expected = NullArgumentException.class)
    public void testSend_NullAmount() throws BankOnlineException {
        bankOnline.send("1234567890123456", null);
    }

    @Test(expected = InvalidCardNumberException.class)
    public void testSend_InvalidCardNumber() throws BankOnlineException {
        bankOnline.send("1234", 1000.0);
    }

    @Test(expected = BlockedCardException.class)
    public void testSend_BlockedCard() throws BankOnlineException {
        bankOnline.send("1111111111111111", 1000.0);
    }

    @Test(expected = NegativeAmountException.class)
    public void testSend_NegativeAmount() throws BankOnlineException {
        bankOnline.send("1234567890123456", -1000.0);
    }

    @Test(expected = ExceedLimitException.class)
    public void testSend_ExceedLimit() throws BankOnlineException {
        bankOnline.send("1234567890123456", 60000.0);
    }

    @Test
    public void testSend_ValidTransaction() {
        try {
            bankOnline.send("1234567890123456", 1000.0);
        } catch (BankOnlineException e) {
            fail("Exception should not be thrown for valid transaction");
        }
    }
}
