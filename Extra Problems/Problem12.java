import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        System.out.println("The sum of the last digits is : "+lastSum(num1, num2));
    }
    public static int lastSum(int n1,int n2){
        return (n1%10)+(n2%10);
    }
}
