class Student //Parent class
{
    String name = ""; int rollno; String subject = "JAVA";

    void getStudentName()
    {
        System.out.println("Student: " + name);
    }

}

class Marks extends Student //Child class
{
    int marks; String subject = "English";

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