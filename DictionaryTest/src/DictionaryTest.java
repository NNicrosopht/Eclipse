import ISharp.Dictionary;

public class DictionaryTest
{
        public static void main(String[] args)
        {
        try
        {
            Dictionary<Integer,String> D = new Dictionary<>();
                      
            D.add(10,"ten");
            D.add(20,"twenty");
            D.add(30,"thirty");            
            D.add(40,"fourty");            
            
            System.out.println(D); 
            
            D.sort();
            
            System.out.println(D);            
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
