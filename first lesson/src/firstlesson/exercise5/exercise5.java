package firstlesson.exercise5;

public class exercise5 {
    public static void main(String[] args) {
    int a = 10;
        System.out.println(Factorial(a));
    }
    public static int Factorial(int f) {
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        return res;
    }
}
