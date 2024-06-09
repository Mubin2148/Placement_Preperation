public class Problem5 {
 public static void main(String[] args) {
    series(5);
 }  
 public static void series(int n){
    int j=0;
    for(int i=1;i<=n;i++){
        j = j+i;
        System.out.print(j+",");
    }
    
 } 
}
