package Book3.chapter7;
//A static inner class is similar to an inner class but doesn’t require an instance of the
//outer class.

//a static inner class can’t access any nonstatic fields or meth-
//ods in its outer class. It can access static fields or methods,

public class outerClassNam {
    private static class innerClassNam {
        //body of inner class
    }
}
