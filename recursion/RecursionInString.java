package recursion;

public class RecursionInString {
    // remove the occurrences of a char in a string

    public static String removeOccurrences(String s, char ch, int idx) {
        String ans = new String();
        if (idx == s.length())
            return " ";
        if (ch != s.charAt(idx))
            ans += s.charAt(idx);
        return ans + removeOccurrences(s, ch, idx + 1);

    }

    public static String removeOccurrences1(String s, char ch, int idx) {
        // without using extra space

        if (idx == s.length())
            return " ";
        String smallArray = removeOccurrences1(s, ch, idx + 1);
        if (ch != s.charAt(idx))
            return s.charAt(idx) + smallArray;
        else
            return smallArray;

    }

    public static String removeOccurrences2(String s) {
        // without using idx

        if (s.length() == 0)
            return " ";
        String smallArray = removeOccurrences2(s.substring(1));
        if ('u' != s.charAt(0))
            return s.charAt(0) + smallArray;
        else
            return smallArray;

    }

    public static String reverse(String s) {
        // without using idx

        if (s.length() == 1)
            return s.substring(0);

        String smallArray = reverse(s.substring(1));

        return smallArray + s.charAt(0);

    }

    public static boolean isPalindrome(String s, int l, int r) {

        if (l >= r) {
            return true;
        }

        if (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1))
            return true;

        else
            return false;

    }

    public static void removeX_addAtEnd(String s, int idx, int count) {
        // base case
        if (idx == s.length()) {
            return;
        }
        // self work
        if (s.charAt(idx) != 'x') {
            System.out.print(s.charAt(idx));
        } else {
            count++;
        }
        // recursive call
        removeX_addAtEnd(s, idx + 1, count);

        if (idx == s.length() - 1) {

            for (int i = 0; i < count; i++)
                System.out.print('x');

        }

    }

    public static String removeDuplicate(String s, int idx) {
        if (idx == -1)
            return " ";
        String smallArray = removeDuplicate(s, idx-1);
        System.out.println(smallArray);
        
        if (smallArray.contains(""+s.charAt(idx)))
            return  smallArray;
        else
            return smallArray+s.charAt(idx);

    }

    public static void main(String[] args) {

        // System.out.println(removeOccurrences("sumit", 'u', 0));
        // System.out.println(removeOccurrences1("sumit", 'u', 0));
        // System.out.println(removeOccurrences2("sumit"));

        // System.out.println(reverse("sumit"));

        // System.out.println(isPalindrome("level", 0, 4));
        String s = "abbbaacc";

        // // To remove X and add At End
        // removeX_addAtEnd(s, 0, 0);

        // To remove duplicate elements
        System.out.println(removeDuplicate(s, s.length()-1));
    }

}
