public class Problem7 {
    public static void main(String[] args) {
        for(int i=150;i<=450;i++){
            if(i%2!=0 && i%7==0 && i%3!=0){
                System.out.print(i+",");
            }
        }
    }
}
