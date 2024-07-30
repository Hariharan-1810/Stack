import java.util.*;

public class pf
{
    public static int find(String arr[])
    {
        Stack<Integer> s = new Stack<>();

        for (String str : arr)
        {
            if (str.matches("\\d+"))
            {
                s.push(Integer.parseInt(str));
            }
            else
            {
                int b = s.pop();
                int a = s.pop();

                switch (str)
                {
                    case "+":
                        s.push(a + b);
                        break;
                    case "-":
                        s.push(a - b);
                        break;
                    case "*":
                        s.push(a * b);
                        break;
                    case "/":
                        s.push(a / b);
                        break;
                }
                
            }
        }
        return s.pop();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String a[] = {"2", "1", "+", "3", "*"};

        System.out.println(find(a));
        sc.close();
    }
}