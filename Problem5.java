public class Problem5 {
    public static void main(String[] args) {
        binaryToDecimal("101.110");
    }

    public static void binaryToDecimal(String binary) {
        String[] Sp = binary.split("\\.");
        System.out.println(Sp[0] + " " + Sp[1]);
        int intPart = Integer.parseInt(Sp[0]);
        int FractionPart = Integer.parseInt(Sp[1]);
        double sum = 0;

        for (int i = 0; i < Sp[0].length(); i++) {
            int rem = intPart % 10;
            sum = sum + (rem * Math.pow(2, i));
            intPart /= 10;
        }
        System.out.println(sum);

        for (int i = Sp[1].length(); i >= 0; i--) {
            int rem = FractionPart % 10;
            sum = sum + (rem * Math.pow(2, -i));
            FractionPart /= 10;
        }
        System.out.println(sum);
    }
}
