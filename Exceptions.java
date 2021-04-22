class Exceptions 
{
    public static void main(String[] args)
    {
        try
        {
            int[] num = {3, 5, 6, 1, 2};
            System.out.println(num[10]);
        }

        catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Index doesn't exist");
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

        finally 
        {
            System.out.println("Execution completed");
        }
    }     
}
