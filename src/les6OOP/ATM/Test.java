package les6OOP.ATM;

/**
 * Created by Tom on 22.11.2017.
 */
public class Test {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.inputCurrencyIntoATM(Currency.HUNDRED);
        atmMachine.inputCurrencyIntoATM(Currency.FIFTY);
        atmMachine.inputCurrencyIntoATM(Currency.TWENTY);
        atmMachine.inputCurrencyIntoATM(Currency.TWENTY);
        atmMachine.inputCurrencyIntoATM(Currency.TWENTY);

        System.out.println(atmMachine);
        System.out.println(atmMachine.summInATMMashine());
        atmMachine.outputCurrencyIntoATM(150);

        System.out.println(atmMachine.summInATMMashine());


    }


}
