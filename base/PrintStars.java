import java.util.Arrays;

public class PrintStars {

    public static void main(String[] args) {
        int height = 3;
        int length = 5;
        String[] heightArray = new String[height];
        for (int i = 0; i < height; i++) {
            String[] lengthArray = new String[length];
            Arrays.fill(lengthArray, "*");
            heightArray[i] = String.join(" ", lengthArray);
        }
        System.out.println(String.join("\n", heightArray));
    }

}
