import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number value: ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        Integer[] intArray = new Integer[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            int number = Integer.parseInt(strArray[i]);
            intArray[i] = number;
        }
        Arrays.sort(intArray);
        System.out.println(intArray[0] + intArray[intArray.length - 1]);
    }
}
