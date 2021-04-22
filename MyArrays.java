class MyArrays 
{
    int[] myArr2 = {2, 10, 20};

    public static void main(String[] args)
    {
        int[] myArr = new int[5];
        int[][] twoD = new int[4][5];

        //myArr[0] = 5;

        /*for (int i=0; i<myArr.length; i++)
        {
            myArr[i] = i;
        }

        for (int i=0; i<myArr.length; i++)
        {
            for (int j=0; j<twoD[i].length; j++)
            {
                twoD[i][j] = i*j;
            }
        }*/

        //myArr[10] = 100;

        //System.out.println(java.util.Arrays.toString(twoD));

        B b = new B();
        System.out.println(b.x);
        //b.printOut();
    }    
}

class B
{
    MyArrays myArr = new MyArrays();
    int x;

    B()
    {
        x = 5;
    }

    void printOut()
    {
        System.out.println(java.util.Arrays.toString(myArr.myArr2));
    }
}
