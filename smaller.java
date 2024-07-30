//next smaller

import java.util.*;

public class smaller
{
    public static void find(int a[])
    {
        int n = a.length;
        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i >= 0; i--)
        {
            int temp = a[i];
            while(s.isEmpty() != true)
            {
                if(a[i] > s.peek())
                {
                    a[i] = s.peek();
                    break;
                }
                else
                {
                    s.pop();
                }
            }
            
            if(s.isEmpty())
            {
                a[i] = -1;
            }
            s.push(temp);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        find(arr);

        sc.close();
    }
}