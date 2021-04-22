import java.util.Scanner;

class DaySwitch 
{
    public static void main(String[] args)
    {
        //int day = 10;
        //char c = 'a';

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        switch(c)
        {
            //day == 1
            case 'a':
            System.out.println("Monday");
            break; 

            case 2:
            System.out.println("Tuesday");
            break; 

            case 3:
            System.out.println("Wednesday");
            break;

            default:
            System.out.println("Invalid");
        }
    }    
}
