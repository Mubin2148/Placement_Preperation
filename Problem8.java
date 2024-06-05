public class Problem8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -000042"));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        boolean isSign = true;
        boolean isPoint = true;
        boolean isLoop = true;
        String str = "";
        for (int i = 0; i < s.length() && isLoop; i++) {
            if ((s.charAt(i) == '-' || s.charAt(i) == '+')) {
                if (isSign == true) {
                    isSign = false;
                } else {
                    break;
                }
                if (s.charAt(i) == '-') {
                    str += "-";
                }
            } else if (isPoint && s.charAt(i) == '.') {
                isPoint = false;
                str += ".";
            } else if (Character.isDigit(s.charAt(i))) {
                isSign = false;
                str += s.charAt(i);
            } else {
                isLoop = false;
            }
        }
        if (str.equals("") || str.equals("+") || str.equals("-")) {
            return 0;
        }
        double n = Double.parseDouble(str);
        return (int) n;
    }
}