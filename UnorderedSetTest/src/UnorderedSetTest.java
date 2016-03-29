import ISharp.SetOperation;
import ISharp.UnorderedSet;

public class UnorderedSetTest
{
        public static void main(String[] args)
        {
        try
        {
            UnorderedSet<String> A = new UnorderedSet<>("A","B","C","D");
            UnorderedSet<String> B = new UnorderedSet<>("C","D","E","F");
                    
            UnorderedSet<String> C = new UnorderedSet<>(A,B,SetOperation.Union);
            UnorderedSet<String> D = new UnorderedSet<>(A,B,SetOperation.Intersection);
            
            System.out.println(A + " | " + B + " == " + C);
            System.out.println(A + " & " + B + " == " + D);
            
            if (A.isSubset(C))
                System.out.println(A + " < " + C);
            else
                System.out.println(A + " !< " + C);                
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
