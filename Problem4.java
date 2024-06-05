public class Problem4 {
    public static int getDigit(int n) {
        StringBuilder str = new StringBuilder();
        int i = 1;
        while (str.length() < n) {
            str.append(i);
            i++;
        }
        System.out.println(str);
        return Integer.parseInt(str.charAt(n - 1) + "");
    }

    public static void main(String[] args) {
        System.out.println(getDigit(11));
    }
}