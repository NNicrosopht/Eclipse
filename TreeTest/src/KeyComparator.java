
import ISharp.IComparator;

class KeyComparator implements IComparator<Integer, T>
{
    public int compare(Integer i, T t) { return i.compareTo(t.i); }
}
