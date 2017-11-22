package les6OOP.ATM;

/**
 * Created by Tom on 22.11.2017.
 */
public interface ATMMethods {
    void inputCurrencyIntoATM(Currency currencyInput);

    void outputCurrencyIntoATM(Integer enteredSumm);

    Integer summInATMMashine();

    boolean moneyEnough (Integer enteredSumm);



}
