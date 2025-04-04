interface CarOrder {
    void placeOrder();
    void trackOrder();
    void cancelOrder();
}

class Car implements CarOrder {
    public void placeOrder() {
        System.out.println("Car order placed.");
    }

    public void trackOrder() {
        System.out.println("Tracking car order.");
    }

    public void cancelOrder() {
        System.out.println("Car order canceled.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.placeOrder();
        myCar.trackOrder();
        myCar.cancelOrder();
    }
}
