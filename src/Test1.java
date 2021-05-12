import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input A: ");
        String a = sc.nextLine();
        System.out.println("Enter input B: ");
        String b = sc.nextLine();
        String[] aArray = a.split("");
        String[] bArray = b.split("");
        String status = "Valid";
        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i].equals(bArray[i])) {
                status = "Invalid";
                break;
            }
        }
        System.out.println(status);
    }
}
