package chapter10.Lesson10;

public class Employees {
    public String name1 = "Fred Smith";
    public String name2= "San Smith";
    int age = 50;

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same.");
        }else {
            System.out.println("Names are different");
        }
    }

    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.areNamesEqual();
        if (emp.age <12 || emp.name1.startsWith("F")) {
            System.out.println("Found Him!");
        }else {
            System.out.println("can't find him");
        }
    }

}
