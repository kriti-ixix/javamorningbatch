class MyLoops
{
    public static void main(String[] args)
    {
        
        for (int i=11 ; i<0 ; i-=1)
        {
            if (i==5)
            {
                continue;
            }
            System.out.println(i);
        }

        /*
        int i = 0;

        while(i<=10)
        {
            System.out.println(i);
            i++;
        }*/

        /*
        do 
        {
            System.out.println(i);
        }while(i<=10);*/
    }
}