package pr8;

public class T1 {
    public static String recursion(int n, String res, int i){
        if (res.length() >= n) {
            return res;
        } else if (res.length() + String.valueOf(i).length() * i > n) {
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                if ((n - res.length()) % String.valueOf(i).length() == j){
                    return res + String.valueOf(i).repeat((n - res.length()) / String.valueOf(i).length()) + String.valueOf(i).substring(0, j);
                }
            }
            return null;
        } else {
            res += String.valueOf(i).repeat(i);
            return recursion(n, res, i + 1);
        }
    }

    public static void main(String[] args) {
        String rs = recursion(2000000, "", 0);
        System.out.println(rs);
        System.out.println(rs.length());
    }
}
