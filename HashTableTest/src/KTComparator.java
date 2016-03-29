import ISharp.EqualityComparator;

public class KTComparator implements EqualityComparator<Integer,T>
{

    public boolean equals(Integer key, T type)
    {
        return type.Key.equals(key);
    }

    public int hashCode(Integer key)
    {
        return key;
    }
  
}
