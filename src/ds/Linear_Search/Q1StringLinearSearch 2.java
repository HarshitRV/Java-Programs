// Question: Find if the target char exists in the given string or not.

package src.ds.Linear_Search;

public class Q1StringLinearSearch {
    public static void main(String[] args) {
        String s = "Hello";
        char target = 'l';

        System.out.println(linearSearch(s, target));
    }

    static int linearSearch(String s, char target) {
        if (s.length() == 0) {
            return -1;
        } 
        for(char c : s.toCharArray()) {
            if (c == target) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
