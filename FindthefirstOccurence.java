public class FindthefirstOccurence {

    public static int strStr(String haystack, String needle) {

        int tvk = haystack.length();
        int dmk = needle.length();
        int j = 0;

        for (int i = 0; i <= tvk - dmk; i++) {

            for (j = 0; j < dmk; j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

            }
            if (j == dmk) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        System.out.print("the first occurence is " + strStr("butsad", "sad"));
    }

}
