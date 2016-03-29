import ISharp.Set;
import ISharp.Stack;

public class StackTest
{
        public static void main(String[] args)
        {
        try
        {
            Stack<String> S = new Stack<>("ten",
                                          "twenty",
                                          "thirty",
                                          "fourty",
                                          "fifty",
                                          "sixty");
   
            System.out.println(S);
   
            Set<String> Set = new Set<>(S);
   
            System.out.println(Set);            
   
            S.sort();
   
            System.out.println(S);
   
            System.out.println("Length == " + S.length());
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
