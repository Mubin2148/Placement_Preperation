import java.util.Scanner;

class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt(); 
        if((n^1)==(n+1)){
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+" is a odd number");
        }
    }
}