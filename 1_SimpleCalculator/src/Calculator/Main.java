package Calculator;
import java.util.Scanner;

public class Main {
    Calculator calc;
    static Scanner sc;
    public static void main(String[]args){
        sc = new Scanner(System.in);

        // TODO 0 Initiate the Calculator Object in Main Class
        // Start Code Here Only 1 line necessary, you may also use
        // the Scanner sc to make the initial input to Calculator by user input

        // End of Code

        // TODO 0 Extra, this function call results in an error
        //  Debug it and fix it
        // run();
    }

    public void run(){
        System.out.println("What do you want to do with the numbers?");
        System.out.println("+");
        System.out.println("-");
        System.out.println(":");
        System.out.println("*");
        String choose = sc.nextLine();
        System.out.println("Input the Number: ");
        float number2 = sc.nextFloat();
        switch(choose){
            case "+":
                //float add_result = [class_name].addition(number2);
                //System.out.println(add_result);
                break;
            case "-":
                //float substraction_result = [class_name].substraction(number2);
                //System.out.println(substraction_result);
                break;
            case ":":
                //float division_result = [class_name].division(number2);
                //System.out.println(division_result);
                break;
            case "*":
                //float multiplication_result = [class_name].multiplication(number2);
                //System.out.println(multiplication_result);
                break;
        }

    }
}
