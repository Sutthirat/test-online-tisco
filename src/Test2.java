import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    static List<Integer> list = new ArrayList<>();
    static int oriNumber;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input");
        oriNumber = Integer.parseInt(input.nextLine());
        findDivideEvenly(1);
        int summary = list.stream().reduce(0, Integer::sum);
        System.out.println(summary < oriNumber ? "deficient" : summary > oriNumber ? "abundant" : "perfect");
    }

    private static void findDivideEvenly(int startNum) {
        if (startNum != oriNumber) {
            if (oriNumber % startNum == 0) {
                list.add(startNum);
            }
            startNum++;
            findDivideEvenly(startNum);
        }
    }
}
