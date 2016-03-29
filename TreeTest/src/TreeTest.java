import ISharp.Tree;

public class TreeTest {

    public static void main(String[] args)
    {
       try
        {
            Tree<Integer, T> tree = new Tree<Integer, T>(new KeyComparator()) {};
            
            tree.add(new T(1, 1.5));
            tree.add(new T(2, 2.5));
            tree.add(new T(3, 3.5));
            tree.add(new T(4, 4.5));
            tree.add(new T(5, 5.5));

            System.out.println("*** Enumerating Tree ***");            

            for (T t : tree)
                System.out.println(t);            

            System.out.println("*** Searching for 3 ***");            

            System.out.println("Found == " + tree.findKey(3));            
        }
        catch (Exception e) { System.out.println(e); }
    }
}