public class RandomNumbersArray {

    public static float getAvg(int[] arr) {
        float sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.printf("Максимальное число в массиве: %s\nСреднее арифмитическое чисел в массиве: %s", findMax(array), getAvg(array));
    }
}
