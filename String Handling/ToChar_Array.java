public class ToChar_Array {
    public static void main(String[] args) {
        // Length of the String.
        String s1 = "HelloWorld";
        int x = s1.length();
        System.out.println(x);

        // CharAt
        char ch = s1.charAt(0);
        System.out.println(ch);

        // To CharArray
        char arr[] = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(i);
        }
        for (char c : arr) {
            System.out.println(c);
        }

        // Get Bytes Code of String.
        String s2 = "Hello World";
        byte[] array = s2.getBytes();
        for (Byte b : array) {
            System.out.println(b);
        }

        // Index of.
        String s3 = "Hello World";
        int S = s1.indexOf('1');
        System.out.println(S);
        S = -1;
        while (true) {
            S = s3.indexOf('1', x + 1);
            System.out.println(S);
            if (S == -1) {
                break;
            }
        }

        // Last index of
        S = s3.lastIndexOf('1');
        System.out.println(S);
    }
}