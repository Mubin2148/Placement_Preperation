import java.util.ArrayList;

class Problem2 {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(5);
        ms.push(2);
        ms.push(1);
        System.out.println(ms.li);
        ms.pop();
        System.out.println("pop :" + ms.li);
        ms.getMin();
        System.out.println("getMin :" + ms.li);
        ms.top();
        System.out.println("Top :" + ms.li);
    }
}

class MinStack {
    ArrayList<Integer> li = new ArrayList<>();
    int minimum;

    public MinStack() {

    }

    public void findMinimum() {
        if (li.isEmpty()) {
            minimum = -1;
            return;
        }
        int n = li.size();
        int x = li.get(0);
        for (int i = 1; i < n; i++) {
            int curr = li.get(i);
            if (curr < x) {
                x = curr;
            }
        }
        this.minimum = x;
    }

    public void push(int val) {
        if (li.isEmpty()) {
            minimum = val;
        } else if (this.minimum > val) {
            minimum = val;
        }
        li.add(val);
    }

    public void pop() {
        if (li.isEmpty()) {
            return;
        }
        int x = li.remove(li.size() - 1);
        if (x == minimum) {
            findMinimum();
        }
    }

    public int top() {
        return li.get(li.size() - 1);
    }

    public int getMin() {
        return minimum;
    }
};