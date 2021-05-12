public class Test5 {
    public static void main(String[] args) {
        String str = "    /\\\n" +
                " /\\/  \\\n" +
                "/      \\\n";
        String str1 = "     /\\    \n" +
                "  /\\/  \\  /\\\n" +
                " /      \\/  \\/\\\n" +
                "/              \\";
        String str2 = "                  /\\\n" +
                "       /\\        /  \\  /\\            /\\\n" +
                "  /\\  /  \\      /    \\/  \\  /\\      /  \\\n" +
                " /  \\/    \\  /\\/          \\/  \\    /    \\\n" +
                "/          \\/                  \\/\\/      \\";
        String[] split = str.split("");
        boolean check = Boolean.TRUE;
        int count = 0;
        for (String s : split) {
            if (s.equals("/") && check) {
                check = Boolean.FALSE;
            } else if (s.equals("\\") && !check) {
                check = Boolean.TRUE;
                count++;
            } else {
                check = Boolean.TRUE;
            }
        }
        System.out.println(count);
    }
}
