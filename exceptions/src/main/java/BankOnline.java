import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BankOnline {
    private static final Set<String> BLOCKED_CARDS = new HashSet<>(Arrays.asList(
            "1111111111111111",
            "2222222222222222",
            "3333333333333333"
    ));
    private static final double LIMIT = 50000.0;

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new NullArgumentException("Card number and amount cannot be null");
        }

        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidCardNumberException("Card number must contain exactly 16 digits");
        }

        if (BLOCKED_CARDS.contains(cardNumber)) {
            throw new BlockedCardException("The card is blocked");
        }

        if (money < 0) {
            throw new NegativeAmountException("The amount cannot be negative");
        }

        if (money > LIMIT) {
            throw new ExceedLimitException("The amount exceeds the limit of " + LIMIT);
        }

        System.out.println("Transfer of " + money + " to card " + cardNumber + " is successful.");
    }
}
