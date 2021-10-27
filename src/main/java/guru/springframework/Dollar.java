package guru.springframework;

/**
 * @author ileanaoneata
 */

public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
