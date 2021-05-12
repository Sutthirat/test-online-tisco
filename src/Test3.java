import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Hexadecimal value: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String[] charArray = str.split(" ");
        for (String c : charArray) {
            char ch = (char) Integer.parseInt(c, 16);
            result.append(ch);
        }
        System.out.println(result);
    }
}
