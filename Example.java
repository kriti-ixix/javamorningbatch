import java.util.Scanner;

class Example 
{
    void addTwo(int x, int y)
    {
        System.out.println("Two parameters");
    }

    void addTwo(int x, int y, int z)
    {
        System.out.println("Three parameters");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your number:");
        //int number = scanner.nextInt();

        Example example = new Example();
        example.addTwo(5, 10);
        example.addTwo(5, 10, 15);

        //System.out.println("My name is " + name);

        /*
        if ((number%2 == 0) || (number%10 == 0))
        {
            System.out.println("Even and divisible by 10");
        }
        else 
        {
            System.out.println("Odd");
        }*/
    }
}

class XYZ 
{
}