abstract class MyAbClass
{
    abstract void addition();
    abstract void subtraction();
}

class ArithmeticCal extends MyAbClass
{
    @Override
    void addition()
    {
        int x = 5 + 10;
        System.out.println(x);
    }
}

class Calculator
{
    public static void main(String[] args)
    {
        ArithmeticCal cal = new ArithmeticCal();
        //cal.addition();
        cal.addition();
    }
}
