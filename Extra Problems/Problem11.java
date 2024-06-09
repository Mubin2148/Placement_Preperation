import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unit = sc.nextDouble();
        System.out.println(calculateBill(unit));
    }
    public static double calculateBill(double unit){
        double bill=100;
        if(unit<=200){
            bill += unit*0.8;
        }
        else if(unit<=300){
            bill += (unit-200)*0.9+(200*0.8);
        }
        else{
            bill += (unit-300)*1+(100*0.9)+(200*0.8);
        }
        if(bill>300){
            bill += (bill*12.36)/100;
        }
        return bill;
    }
}
