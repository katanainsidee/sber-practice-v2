package Homework1;

public class Main {
    static private void runMultipleOfSeven(){
        System.out.println("Тестирование MultipleOfSeven:");
        MultipleOfSeven.printMultipleOfSeven();
    }

    static private void runPrimeNumbers(){
        System.out.println("Тестирование PrimeNumbers:");
        PrimeNumbers.printPrimeNumbers();
    }

    static private void runPrintStars(){
        System.out.println("Тестирование PrintStars");
        PrintStars.printStars();
    }

    static private void runRandomNumbersArray(){
        System.out.println("Тестирование RandomNumbersArray:");
        RandomNumbersArray.printMaxAndAvgNumbers();
    }

    public static void main(String[] args) {
        runMultipleOfSeven();
        runPrintStars();
        runRandomNumbersArray();
        runPrimeNumbers();
    }
}
