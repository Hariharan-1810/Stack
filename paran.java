import java.util.*;
public class paran
{
    static Stack<Character> st = new Stack<>();

    public static boolean find(Stack<Character> st, String s, int i)
    {
        if(i == s.length() && st.size() == 0)
        {
            return true;
        }
        if(i == s.length() && st.size() != 0)
        {
            return false;
        }

        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
        {
            st.push(s.charAt(i));
        }
        else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')
        {
            if(st.isEmpty())
            {
                return false;
            }
            else if(s.charAt(i) == ')' && st.peek() != '(')
            {
                return false;
            }
            else if(s.charAt(i) == ']' && st.peek()!= '[')
            {
                return false;
            }
            else if(s.charAt(i) == '}' && st.peek()!= '{')
            {
                return false;
            }
            st.pop();
        }
        return find(st, s, i+1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(find(st, s, 0));
        sc.close();
    }
}
