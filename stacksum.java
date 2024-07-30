import java.util.*;

public class stacksum
{
    static Stack<Integer> stack = new Stack<>();

    static void find(String s)
    {
        if(s.equals("+"))
        {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b);
            stack.push(a);
            stack.push(a + b);
        }
        else if(s.equals("-"))
        {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b - a);
        }
        else if(s.equals("D"))
        {
            int a = stack.peek();
            stack.push(a * 2);
        }
        else if(s.equals("/"))
        {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b / a);
        }
        else if(s.equals("C"))
        {
            stack.pop();
        }
        else
        {
            stack.push(Integer.parseInt(s));
        }
    }

    public static int display()
    {
        int sum = 0;
        while(!stack.isEmpty())
        {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args)
    {
        String op[] = {"5", "2", "C", "D", "+"};

        for(String s : op)
        {
            find(s);
        }

        System.out.println(display());
    }
}
