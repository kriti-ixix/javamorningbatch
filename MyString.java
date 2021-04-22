class MyString 
{
    public static void main(String[] args)
    {
        String name = "ABCDE";
        String n = "XYZ";

        char x = name.charAt(2);

        name = name + "FGH";
        name.concat("IJK");

        int num = 123;

        name = name + String.valueOf(num);

        int num2 = Integer.parseInt("123");
        //Double.parseDouble
        //Float.parseFloat

        if (name.equals(n))
        {
            
        }

        name.equalsIgnoreCase(n);

        int l = name.length();

        //System.out.println(name.toUpperCase());
        //System.out.println(name.toLowerCase());

        String fullString = "ABCDEFG";
        //System.out.println(fullString.substring(2, 4));

        String sen = "Hello my name is XYZ";
        String[] chars = sen.split(" ");
        System.out.println(java.util.Arrays.toString(chars));
    }    
}
