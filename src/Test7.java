import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Block: ");
        String block = sc.nextLine();
        System.out.println("Enter input Sentence: ");
        String sentence = sc.nextLine();
        int number = Integer.parseInt(block);
        String[] sentenceArray1 = new String[number];
        StringBuilder result = new StringBuilder();
        char ch;
        for (int i = 0; i < sentence.length(); ) {
            for (int j = 0; j < number; j++) {
                if (i < sentence.length()) {
                    ch = sentence.charAt(i);
                    if (sentenceArray1[j] == null) {
                        sentenceArray1[j] = "" + ch;
                    } else {
                        sentenceArray1[j] += ch;
                    }
                    i++;
                } else {
                    sentenceArray1[j] += "x";
                }
            }
        }
        for (int i = 0; i < number; i++) {
            result.append(sentenceArray1[i]).append(" ");
        }
        System.out.println(result);
    }
}
