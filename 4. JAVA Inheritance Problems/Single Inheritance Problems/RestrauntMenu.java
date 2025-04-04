import java.util.Scanner;

class RestrauntMenu {
    public void defaultMenu() {
        System.out.println("-----------####----------");
        System.out.println("Here is our menu card");
        System.out.println("Biryani");
        System.out.println("Kadhai Paneer");
        System.out.println("Butter Chicken");
        System.out.println("Nans");
        System.out.println("Sweets");
        System.out.println("Juices");
        System.out.println("Ice Creams");
        System.out.println("--------------------------");
    }
}

class PaymentBill extends RestrauntMenu {
    String biryani, curry, icecreams;

    PaymentBill(String biryani, String curry, String icecreams) {
        this.biryani = biryani;
        this.curry = curry;
        this.icecreams = icecreams;
    }

    public void yourBill() {
        System.out.println("-----------####----------");
        System.out.println("Here is our bill card");
        System.out.println(biryani);
        System.out.println(curry);
        System.out.println(icecreams);
        System.out.println("--------------------------");
    }
}

public class Restraunt {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Biryani:");
        String biryani = obj.nextLine();
        System.out.println("Enter any Curry:");
        String curry = obj.nextLine();
        System.out.println("Enter any Ice Creams:");
        String icecreams = obj.nextLine();

        RestrauntMenu myRes = new RestrauntMenu();
        myRes.defaultMenu();

        PaymentBill myObj = new PaymentBill(biryani, curry, icecreams);
        myObj.yourBill();

        obj.close();
    }
}
