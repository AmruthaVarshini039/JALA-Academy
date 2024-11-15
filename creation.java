public class creation {
    // Defining a class named 'Car'
    static class Car {
        String color;
        String model;
        int year;

        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }
        public void displayInfo() {
            System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
        }
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2022);
        
        // Accessing methods and fields
        myCar.displayInfo(); 
    }
}