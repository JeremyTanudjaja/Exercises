package Calculator;

public class Calculator {
    float result = 0f;
    float input = 0f;

    public Calculator(float initial_value){
        //initiate the calculator object
        //we input an initial value to add, substract, multiply, divide
        //with another value later, for now we store it in the result variable
        result = initial_value;
    }

    public float addition(float input){
        //add our initial value
         result = result + input;
         return result;
    }
    //TODO 1 Create the Substraction Function, don't forget the return value
    //public float substraction(float input){}

    //TODO 2 Create the Multiplication Function, don't forget the return value
    //public float multiplication(float input){}

    //TODO 3 Create the Division Function, don't forget the return value,
    // might need to round it
    //public float division(float input){}
}
