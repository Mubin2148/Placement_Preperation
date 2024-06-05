public class Problem6 {
    public static int getChanger(int n, int m) {
        int number = n ^ m;
        System.out.println(number);
        int count = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                count++;
            }
            number /= 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 18;
        int m = 10;
        System.out.println(getChanger(n, m));
    }
}