import ISharp.IComparator;

public class KTComparator implements IComparator<Integer,T>
{
    public int compare(Integer key, T type)
    {
        return key.compareTo(type.i);
    }
}
