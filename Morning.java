//Making our class
class Morning 
{
    //Attributes or variables of a class
    int x = 5; int y = 10;
    //int is the datatype of the attributes

    //Default method of a class
    //Takes no arguments aka the brackets are empty
    //void means the function returns nothing
    void printOut()
    {
        //Code to print out on a console
        System.out.println("Hello");
        //Function returns nothing
    }

    //Parameterised function
    void printName(String name)
    {
        System.out.println(name);
    }

    int addNumbers(int a, int b)
    {
        c = a+b;
        return c;
    }
    
    //Main function of the project aka the entry point
    /*Public: It's members be accessed by any class in the project
    Static: Memory is automatically assigned to it without creating an object
    Void: It returns nothing
    Main is not a part of the class but simply situated in the class
    String[] args: To accept any inputs from the user
    */
    public static void main(String[] args)
    {
        //Creating an object of the class Morning to assign memory to it
        //and use it's attributes and methods
        Morning m = new Morning();
        //m is an object/instance of the Morning class
        //Using the printOut function of the class 
        m.printOut();

        //Creating a variable name and printing it using function
        String name = "XYZ";
        m.printName(name);

        //Creating a new object of the Morning class
        Morning m2 = new Morning();
        m2.printName("ABC");

        //Getting the int value returned from the function and storing it in z
        int z = m2.addNumbers(10, 20);
        System.out.println(z);
        
        //Storing the values of variables of Morning class here
        int p = m2.x; int q = m2.y;
        
        //No need to use this function via objects here because the function is static
        addition();
    }

    static addition()
    {
        System.out.println(p+q);
    }
}
