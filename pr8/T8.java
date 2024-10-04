package pr8;

public class T8 {

    public static boolean recursion(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return recursion(word.substring(1, word.length() - 1));
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(recursion("asdsa"));
        System.out.println(recursion("as d sa"));
        System.out.println(recursion("as ds a"));
        System.out.println(recursion("123321 "));
        System.out.println(recursion("4121111111111"));
        System.out.println(recursion("asdfghjkl;;lkjhgfdsa"));
    }
}
