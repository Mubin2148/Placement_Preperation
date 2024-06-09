public class Problem6 {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,7};
        oddEvenSum(array);
    }
    public static void oddEvenSum(int[] array){
        int oddSum = 0,evenSum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenSum += array[i];
            }
            else{
             oddSum += array[i];
            }
        }
        System.out.println("The sum of odd number is : "+oddSum);
        System.out.println("The sum of even number is : "+evenSum);
    }
}
