import java.util.Stack;

public class midstack
{
    static Stack<Integer> s = new Stack<>();

    public static void find(int n)
    {
        if (s.isEmpty())
        {
            return;
        }

        if (s.size() == n)
        {
            s.pop();
            return;
        }
        else
        {
            int temp = s.pop();
            find(n);
            s.push(temp);
        }
    }

    public static void main(String[] args)
    {
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int n = s.size();
        find((n / 2) + 1);
        
        System.out.println(s);
    }
}