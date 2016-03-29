import ISharp.MultiDictionary;

public class MultiDictionaryTest
{
        public static void main(String[] args)
        {
        try
        {
            MultiDictionary<Integer,String> D = new MultiDictionary<>();
                      
            D.add(10,"ten");
            D.add(10,"fifty");
            D.add(10,"sixty");
            D.add(20,"twenty");
            D.add(30,"thirty");            
            D.add(40,"fourty");            
            
            System.out.println(D);
            System.out.println(D.range(10));
            System.out.println(D.key(10));
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
}
