import java.util.HashSet;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        printArray(removeDuplicate());
    }
    public static int[] removeDuplicate(){
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the number : ");
            set.add(sc.nextInt());
        }
        int[] arr = new int[set.size()];
        int i=0;
        for(int num:set){
            arr[i] = num;
            i++;
        }
        return arr;
    }
    public static void printArray(int[] arr){
        int n=arr.length;
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
