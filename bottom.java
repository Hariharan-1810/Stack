import java.util.Stack;

public class bottom
{
    public static Stack<Integer> find(Stack<Integer> s, int data)
    {
        if(s.isEmpty() == true)
        {
            s.push(data);
        }
        else
        {
            int temp = s.pop();
            find(s, data);
            s.push(temp);
        }
        return s;
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(find(s, 5));
    }
}
