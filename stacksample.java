import java.util.*;

public class stacksample {
    public static void main(String args[]) {
        Stack<Character> st = new Stack<>();

        Scanner s = new Scanner(System.in);

        String sc = s.nextLine();
        int n = sc.length();

        for (int i = 0; i < n; i++) {
            char c = sc.charAt(i);
            st.push(c);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(st.peek());
            st.pop();
        }
        s.close();
    }
}
