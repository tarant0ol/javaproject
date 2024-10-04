package pr8;


public class T5 {

    public static int recursion(int n, int sum) {
        if (n < 10) { return sum + n; }
        else { return recursion(n / 10, sum + n % 10); }
    }

    public static int recursion(int n) {
        System.out.println(n);
        return recursion(n, 0);
    }


    public static void main(String[] args) {
        System.out.println(recursion(123));
        System.out.println(recursion(321213));
        System.out.println(recursion(99901));
        System.out.println(recursion(101010));
    }

}

