package guru.springframework;

/**
 * @author ileanaoneata on 16.02.2022
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    public Expression plus(Expression addend);

    Expression times(int multiplier);
}
