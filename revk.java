// reverse stack at k

import java.util.*;

public class revk
{
    static Queue<Integer> q = new LinkedList<>();
    static Stack<Integer> s = new Stack<>();

    public static void find(int k)
    {
        int i = 0;
        int n = q.size();

        while(i < k)
        {
            s.push(q.remove());
            i++;
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        i = 0;

        while(i < n - k)
        {
            q.add(q.remove());
            i++;
        }
    }

    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            q.add(i);
        }
        int k = 3;

        find(k);
        System.out.println(q);
    }
    
}
