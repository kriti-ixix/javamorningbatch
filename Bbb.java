class Bbb
{
    public int x = 5;
    int y = 10;

    void printHello(String a, int b, int c)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Bbb example = new Bbb();
        String ex = "Hi"; int ex2 = 8; int ex3 = 10;
        example.printHello( ex, ex2 , ex3);
        //example.printHello(ex2);
    }
}

class X1
{
    static void printOut()
    {
        //Bbb example = new Bbb();
        //example.x = 20;
        //System.out.print(example.x);
        System.out.println("Printing");
    }
}

class X2
{

}