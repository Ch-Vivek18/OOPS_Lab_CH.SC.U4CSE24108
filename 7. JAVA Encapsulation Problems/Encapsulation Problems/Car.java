class Car {
    private int speed = 0;
    private final int MAX_SPEED = 200;

    public void accelerate(int increment) {
        if (speed + increment <= MAX_SPEED)
            speed += increment;
        else
            System.out.println("Speed limit exceeded!");
    }

    public void brake(int decrement) {
        if (speed - decrement >= 0)
            speed -= decrement;
        else
            speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate(50);
        c.brake(20);
        System.out.println("Current Speed: " + c.getSpeed() + " km/h");
    }
}
