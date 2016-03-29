class T implements Comparable<T>
{
    public Integer i;
    public Double d;

    public T(int ii) { i = ii; d = 0.0; }
    
    public T(int ii, double dd) { i = ii; d = dd; }

    public String toString()
    { return "(" + i.toString() + "," + d.toString() + ")"; }

    public int compareTo(T t) { return i.compareTo(t.i); }
}
