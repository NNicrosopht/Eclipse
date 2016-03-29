public class T
{
    public Integer Key;
    public String Data;
    
    public T(int KeyIn)
    {
       Key = KeyIn;
       Data = "String" + Key.toString();
    }
    
    public int hashCode()
    {
        return Key;
    }
 
    public boolean equals(T toTest)
    {
        if (!Key.equals(toTest.Key)) return false;
        
        if (!Data.equals(toTest.Data)) return false;
        
        return true;
    }
    
    public String toString()
    {return "(" + Key.toString() + "," + Data + ")";}
}
