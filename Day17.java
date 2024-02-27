//String Subsequences
import java.util.*;
public class Day17{
    //recursive helper function
    public static List<String> recursion(String s, int i, List<String> str, StringBuilder sb) {
        if (str.size() == s.length() * s.length()) {
            return str;
        }
        if (sb.length() > 0 && i >= s.length()) {
            String temp = sb.toString();
            str.add(temp);
            return str;
        } else if (i < s.length()) {
            sb.append(s.charAt(i));
            recursion(s, i + 1, str, sb);
            sb.delete(sb.length() - 1, sb.length());
            recursion(s, i + 1, str, sb);
        }
        return str;
    }

    public static List<String> AllPossibleStrings(String s) {
        List<String> str = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        List<String> ans = recursion(s, 0, str, sb);
        Collections.sort(ans);
        return ans;

    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(AllPossibleStrings(s));
    }
}
