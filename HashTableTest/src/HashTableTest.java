import ISharp.HashTable;

public class HashTableTest
{
    public static void main(String[] args)
    {
        try
        {
            HashTable<Integer,T> ht = new HashTable<Integer,T>(new KTComparator());
            
            ht.add(new T(1));
            ht.add(new T(2));
            ht.add(new T(3));
            ht.add(new T(4));
            ht.add(new T(5));
            
            System.out.println("Hash Table == " + ht);
            
            System.out.println("Finding 3");
            
            System.out.println("Found: " + ht.findKey(3));
            
            System.out.println("Hash Table Depth: " + ht.depth());
        }
        catch(Exception E)
        {
            System.out.println(E);
        }
    }
    
}
