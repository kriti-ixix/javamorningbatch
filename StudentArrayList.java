import java.util.*;

class StudentArrayList 
{
    public static void main(String[] args)
    {
        ArrayList<String> stdList = new ArrayList<>();
        //System.out.println(stdList);
        stdList.add("ABC");
        stdList.add("PQR");
        stdList.add("XYZ");
        System.out.println(stdList);
        System.out.println(stdList.get(1));
        stdList.remove("ABC");
        System.out.println(stdList.size());
        
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1); ints.add(2); ints.add(3);
        int sum = MathUtils.sum(ints);
        System.out.println(sum);
    }
}
