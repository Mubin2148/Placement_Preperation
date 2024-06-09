import java.util.Scanner;

public class Problem15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String : ");
    String s = sc.nextLine();
    char[] array = s.toCharArray();
    for(int i=0;i<array.length;i++){
        for(int j=0;j<=i;j++){
            System.out.print(array[j]);
        }
        System.out.println();
    }
}
}
