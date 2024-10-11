package Book3.chapter6;
//using the clone to create a shallow copy
// the clone method manually creates a copy of the origi-
//nal object and returns it

//To call the clone method from your own clone method, just specify super.
//clone()

//the super.clone() method won’t make a complete copy of the
//object
class Employee implements Cloneable
{
    // Fields and methods omitted...
    public Object clone()
    {
        Employee emp;
        try
        {
            emp = (Employee) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return null; // will never happen
        }
        return emp;
    }
}