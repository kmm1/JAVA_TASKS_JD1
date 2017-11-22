package les6OOP.ATM;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tom on 22.11.2017.
 */
public class ATMMachine implements ATMMethods {
    Map<Currency, Integer> atm = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATMMachine that = (ATMMachine) o;
        return atm != null ? atm.equals(that.atm) : that.atm == null;
    }

    @Override
    public int hashCode() {
        return atm != null ? atm.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ATMMachine{" +
                "atm=" + atm +
                '}';
    }

    @Override
    public void inputCurrencyIntoATM(Currency currencyInput) {
        switch (currencyInput) {
            case TWENTY:
                Integer countTwenty = atm.get(Currency.TWENTY);
                atm.put(Currency.TWENTY, countTwenty == null ? 1 : ++countTwenty);
                break;
            case FIFTY:
                Integer countFifty = atm.get(Currency.FIFTY);
                atm.put(Currency.FIFTY, countFifty == null ? 1 : ++countFifty);
                break;
            case HUNDRED:
                Integer countHundred = atm.get(Currency.HUNDRED);
                atm.put(Currency.HUNDRED, countHundred == null ? 1 : ++countHundred);
                break;
        }
    }

    @Override
    public void outputCurrencyIntoATM(Integer enteredSumm) {
        if (moneyEnough(enteredSumm)) {
            Integer hundredsOutputToTheCustumer = enteredSumm / 100;
            atm.put(Currency.HUNDRED, atm.get(Currency.HUNDRED) - hundredsOutputToTheCustumer);
            Integer summ = enteredSumm % 100;
            Integer fiftyOutputToTheCustumer = summ / 50;
            atm.put(Currency.FIFTY, atm.get(Currency.FIFTY) - fiftyOutputToTheCustumer);
            summ = enteredSumm % 50;
            Integer twentyOutputToTheCustumer = summ / 20;
            atm.put(Currency.TWENTY, atm.get(Currency.TWENTY) - twentyOutputToTheCustumer);
            summ = enteredSumm % 20;
            System.out.println("вам было выдано " + enteredSumm + " руб.");
        } else System.out.println("недостаточно денег для выдачи");
    }

    @Override
    public Integer summInATMMashine() {
        Integer summInATMMashine = 0;
        Integer twenty = atm.get(Currency.TWENTY);
        if (twenty != null) {
            summInATMMashine = twenty * 20;
        }
        Integer fifty = atm.get(Currency.FIFTY);
        if (fifty != null) {
            summInATMMashine += fifty * 50;
        }
        Integer hundred = atm.get(Currency.HUNDRED);
        if (hundred != null) {
            summInATMMashine += hundred * 100;
        }
        return summInATMMashine;
    }

    @Override
    public boolean moneyEnough(Integer enteredSumm) {
        if (summInATMMashine() >= enteredSumm) {
            return true;
        }
        return false;
    }


}
