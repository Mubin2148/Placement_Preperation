import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = (n^1)==(n+1)?"Even":"Odd";
        System.out.println(s);
    }
}
