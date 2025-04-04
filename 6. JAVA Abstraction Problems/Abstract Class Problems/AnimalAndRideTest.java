abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    public void sound() {
        System.out.println("Tiger growls");
    }
}

abstract class RapidoBooking {
    String pickupLocation;
    String dropLocation;

    public RapidoBooking(String pickupLocation, String dropLocation) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    abstract void bookRide();
}

class BikeRide extends RapidoBooking {
    public BikeRide(String pickupLocation, String dropLocation) {
        super(pickupLocation, dropLocation);
    }

    public void bookRide() {
        System.out.println("Bike ride booked from " + pickupLocation + " to " + dropLocation);
    }
}

public class AnimalAndRideTest {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();

        RapidoBooking ride = new BikeRide("Ameerpet", "Madhapur");
        ride.bookRide();
    }
}
