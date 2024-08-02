public class Main {

    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 7;
        Arithmetic Program = new Arithmetic(firstNumber, secondNumber);
        print("Задание 1:");
        print("Сумма чисел = ", Program.sum());
        print("Произведение чисел = ",Program.multiply());
        print("Максимальное число = ", Program.maxNumber());
        print("Минимальное число = ", Program.minNumber());
    }

    public static void print(String text){
        System.out.println(text);
    }
    public static void print(String text, int num){
        System.out.println(text + num);
    }


}
