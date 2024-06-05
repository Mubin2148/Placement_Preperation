import java.util.ArrayList;

public class Problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        // Add in list-1
        l1.add(1);
        l1.add(2);
        l1.add(4);
        l1.add(3);

        // Add in list-2
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println(listAdd(l1, l2));
    }

    public static ArrayList<Integer> listAdd(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        System.out.println(list1);
        System.out.println(list2);
        int div = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = list1.size() - 1, j = list2.size() - 1; i >= 0 && j >= 0; i--, j--) {
            int temp = list1.get(i) + list2.get(j) + div;
            if (temp > 9) {
                int rem = temp % 10;
                div = temp / 10;
                result.add(rem);
            } else {
                result.add(temp);
            }
        }
        return result;
    }

}
