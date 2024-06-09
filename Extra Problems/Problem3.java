public class Problem3 {
    public static void main(String[] args){
        System.out.println(isPalindrom(123));
    }
    public static boolean isPalindrom(int number){
        int rev=0;
        int temp =number;
        while(number>0){
            int rem = number%10;
            rev =(rev*10)+rem;
            number /= 10;

        }
        System.out.println(rev);
          if(temp==rev){
            return true;
          }else{
            return false;
          }
    }
  
}
