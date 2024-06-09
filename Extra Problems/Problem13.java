import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the number 3 :");
        int num3 = sc.nextInt();

        int res = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
        int res2 = num1<num2?num1<num3?num1:num3:num2<num3?num2:num3;
        int res3 = (num1>res2 && num1<res)?num1:(num2>res2 && num2<res)?num2:(num3>res2 && num3<res)?num3:num1;
        System.out.println(res2+" "+res3+" "+res);

}
}
