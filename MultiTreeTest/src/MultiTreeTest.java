import ISharp.MultiTree;

public class MultiTreeTest
{
    public static void main(String[] args)
    {
        MultiTree<Integer, T> multitree = new MultiTree<Integer, T>(new KTComparator());
        
        multitree.add( new T(1, 1.5) );
        multitree.add( new T(1, 2.5) );
        multitree.add( new T(1, 3.5) );
        multitree.add( new T(3, 3.5) );
        multitree.add( new T(3, 4.5) );
        multitree.add( new T(4, 4.5) );
        
        System.out.println(multitree);
        
        System.out.println("Key Range 1 == " + multitree.findKey(1));
    }
}
