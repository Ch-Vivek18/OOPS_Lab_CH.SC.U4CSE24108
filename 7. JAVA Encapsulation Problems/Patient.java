class Patient {
    private int age;
    private double temperature;

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Invalid age!");
    }

    public void setTemperature(double temperature) {
        if (temperature >= 95 && temperature <= 108)
            this.temperature = temperature;
        else
            System.out.println("Temperature out of range!");
    }

    public int getAge() {
        return age;
    }

    public double getTemperature() {
        return temperature;
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.setAge(25);
        p.setTemperature(98.6);
        System.out.println("Age: " + p.getAge() + ", Temperature: " + p.getTemperature() + "°F");
    }
}
