import ISharp.MultiSet;

public class MultiSetTest
{
    public static void main(String[] args)
    {
        MultiSet<T> multiset = new MultiSet<>();
        
        multiset.add( new T(1, 1.5) );
        multiset.add( new T(1, 2.5) );
        multiset.add( new T(1, 3.5) );
        multiset.add( new T(3, 3.5) );
        multiset.add( new T(3, 4.5) );
        multiset.add( new T(4, 4.5) );
        
        System.out.println(multiset);
        
        System.out.println("Key Range 1 == " + multiset.find(new T(1)));
    }
}
