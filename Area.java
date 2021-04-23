interface CalArea
{
    void area();
    void perimeter();
}

class Rectangle implements CalArea
{
    @Override
    public void area()
    {
        int l = 5, b = 10;
        int a = l*b;
        System.out.println("Area: " + String.valueOf(a));
    }

    @Override
    public void perimeter()
    {
        int l = 5, b = 10;
        int p = 2 * (l+b);
        System.out.println("Perimeter: " + String.valueOf(p));
    }
}

class Square implements CalArea
{
    @Override
    public void area()
    {
        int s = 10;
        int a = s*4;
        System.out.println("Area: " + String.valueOf(a));
    }

    @Override
    public void perimeter()
    {
        int s = 5;
        int p = 2 * s;
        System.out.println("Perimeter: " + String.valueOf(p));
    }
}

class Area 
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        Square square = new Square();

        rect.area();
        square.area();
    }
}
