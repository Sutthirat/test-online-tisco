import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
    static List<Integer> resultTest6 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number value: ");
        int startNum = sc.nextInt();
        resultTest6.add(startNum);
        findSyracuse(startNum);
        System.out.println(resultTest6);
    }

    private static void findSyracuse(int num) {
        if (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            resultTest6.add(num);
            findSyracuse(num);
        }
    }
}
