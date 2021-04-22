class ThrowEx 
{
    public static void main(String[] args)
    {
        try 
        {
            for (int i = 0; i <=10; i++)
            {
                if (i==5)
                {
                    throw new ArithmeticException();
                }
                System.out.println(i);
            }    
        }

        catch (ArithmeticException e) 
            {
                e.printStackTrace();
            }
    }    
}
