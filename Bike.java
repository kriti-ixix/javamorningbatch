class Bike 
{
    int speed; int gear;

    Bike()
    {
        speed = 10; gear=2;
    }

    public static void main(String[] args)
    {
        Bike bike = new Bike();
        //System.out.println(bike.speed);

        Bike bike2 = new Bike();
        //System.out.println(bike2.speed);

        bike2.speed = 11;
        bike2.gear = 3;

        //System.out.println(bike2.speed);

        Car car1 = new Car(100);
        System.out.println(car1.speed);

        Car car2 = new Car(200);
        System.out.println(car2.speed);
    }    
}

class Car
{
    int speed;

    Car()
    {
        speed = 100;
    }

    Car(int x)
    {
        speed = x;
    }
}
