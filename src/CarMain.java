public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Roadster", "Tesla", 2027, 250000, "White", 5);

        System.out.println("Original car:");
        System.out.println(car);

        car.sell();

        System.out.println("\nModel: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setPrice(300000);
        car.setColor("Black");
        car.delivery();

        System.out.println("\nUpdated car:");
        System.out.println(car);
    }
}