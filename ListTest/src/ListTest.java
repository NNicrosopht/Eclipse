import ISharp.Set;
import ISharp.List;

public class ListTest
{
        public static void main(String[] args)
        {
        try
        {
            List<String> L = new List<>("ten",
                                        "twenty",
                                        "thirty",
                                        "fourty",
                                        "fifty",
                                        "sixty");
   
            System.out.println(L.toString());
            
            Set<String> Set = new Set<>(L);
            
            System.out.println(Set);            
            
            L.sort();
            
            System.out.println(L);
            
            System.out.println("Length == " + L.length());
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
