package less9Exceptions;


import java.util.ArrayList;
import java.util.List;

import static sun.misc.PostVMInitHook.run;

/**
 * Created by Tom on 24.11.2017.
 */
class L{
    public static void main(String[] args) throws FactorialException {
        System.out.println( getFactorial(-5));
    }

    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("Число не может быть меньше 1", num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}