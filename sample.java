import java.util.Stack;

public class sample {
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);

        s.insertElementAt(5, 0);

        System.out.println(s);
    }
}
