public class ReverseString {

    public static void reverseString(char[] s) {

        int n = s.length;

        for (int i = 0; i < n / 2; i++) {

            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {

        char[] name = { 'g', 'o', 'w', 't', 'h', 'a', 'm' };

        reverseString(name);

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

    }
}
