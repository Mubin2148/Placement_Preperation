/**
 * Problem1 :- Largest from 3 numbers using conditional operator
 */ 
public class Problem1 {

    public static void main(String[] args) {
        System.out.println(Largest(8,5,4));
    }
    public static int Largest(int num1,int num2,int num3) {

        int res = num1>num2?num1>num3?num1:num3:num2>num3?num2:num3;
        return res;
    }
}