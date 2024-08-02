public class Arithmetic {
    int firstNumber;
    int secondNumber;
    public Arithmetic(int number1, int number2){
        firstNumber = number1;
        secondNumber = number2;
    }
    public int sum(){
        return firstNumber + secondNumber;
    }
    public int multiply(){
        return firstNumber * secondNumber;
    }
    public int maxNumber(){
        if (firstNumber > secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    public int minNumber(){
        if (firstNumber < secondNumber){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
