class Student //Parent class
{
    String name = ""; int rollno; String subject = "JAVA";

    Student()
    {
        System.out.println("Student class");
    }

    void getStudentName()
    {
        System.out.println("Student: " + name);
    }

}

class Marks extends Student //Child class
{
    int marks; String subject = "English";

    Marks()
    {
        super();
        System.out.println("Marks class");
    }

    void getStudentName()
    {
        super.getStudentName();
        System.out.println("Marks: " + name + " " + marks);
    }

    void printSubject()
    {
        System.out.println(subject);
        System.out.println(super.subject);
    }

    public static void main(String[] args)
    {
        Marks std = new Marks();
        std.name = "ABC";
        std.marks = 45;
        std.rollno = 1;
        //std.subject = "English";

        //std.getStudentName();
        std.printSubject();

        //System.out.println(std.name);
    }

}