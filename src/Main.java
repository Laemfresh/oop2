public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "nissan";
        car.model = "r34";
        car.power = 1350;
        car.weight = 1;
        car.creat = 2005;

        Car car1 = new Car();
        car1.brand = "toyuta";
        car1.model = "supra mk4";
        car1.power = 1400;
        car1.weight = 1;
        car1.creat = 2005;

        Car car2 = new Car();
        car2.brand = "mazda";
        car2.model = "rx7";
        car2.power = 1350;
        car2.weight = 1;
        car2.creat = 2004;

        System.out.println(car2.brand + " " + car2.model + " " + car2.power + " " + car2.weight + " " + car2.creat);
        System.out.println(car1.brand + " " + car1.model + " " + car1.power + " " + car1.weight + " " + car1.creat);
        System.out.println(car.brand + " " + car.model + " " + car.power + " " + car.weight + " " + car.creat);
    }
}
