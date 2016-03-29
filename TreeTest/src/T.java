class T implements Comparable<T>
{
    public Integer i;
    public Double d;

    public T(Integer ii, Double dd) { i = ii; d = dd; }

    public String toString()
    { return "(" + i.toString() + "," + d.toString() + ")"; }

    public int compareTo(T t) { return i.compareTo(t.i); }
}