//Objective : My Third lab
//Name : Nayeon Kim 
//Student no : 7432471
//File name : NayeonKim_Lab_3.java
//Declaration : This is my own work and I did not violate uow's plagiarism rules.

import java.util.Scanner;
class PetrolPurchase {

    //Declare non-static variables (instance variables)
    private String station;
    private double quantity;
    private String type;
    private double price;
    private int discount;

    //default constructor
    public PetrolPurchase() {
        //do nothing
    }

    //other constructor
    public PetrolPurchase(String station, double quantity, String type,
     double price, int discount) {
         this.station = station;
         this.quantity = quantity;
         this.type = type;
         this.price = price;
         this.discount = discount;

    }

    //copy constructor
    public PetrolPurchase(PetrolPurchase p) {
        this(p.station, p.quantity, p.type, p.price, p.discount);
    }

    //accessor methods
    public String getStation() {
        return station;
    }

    public String getType() {
        return type;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    //mutator methods
    public void setStation(String station) {
        this.station = station;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setInfo(String s, double q, String t, double p, int d) {
        this.station = s;
        this.quantity = q;
        this.type = t;
        this.price = p;
        this.discount = d;
    }

    //non static public methods
    public double computePayment() {
        double payment = price * quantity;
        return payment;
    }

    public double getPayment()  {
        return computePayment();
    }

    //access instance variables inside the class
    public void printInfo() {
        System.out.printf("Station: %s%n", station);
        System.out.printf("Total liter: %.2f%n", quantity);
        System.out.printf("Petrol type: %s%n", type);
        System.out.printf("Price per liter: %.2f%n", price);
        System.out.printf("Actual cost: %.2f%n", getPayment());
        System.out.printf("Discount (%d%s): %.2f%n", discount, "%", (getPayment() * discount) / 100);
        System.out.printf("Amount to pay: %.2f%n", getPayment() - (getPayment() * discount) / 100);
    }
    

 }


class Lab_3 {
    public static void main (String[] args) {

        //construct a scanner class object
        Scanner input = new Scanner(System.in);

        //Declare variables
        String station;
        double quantity;
        String petrolType;
        double price;
        int discount;
    
        //read in the information
        System.out.printf("Enter the station: ");
        station = input.nextLine();

        System.out.printf("Enter quantity in liter: ");
        quantity = input.nextDouble();

        input.nextLine();

        System.out.printf("Enter type of petrol: ");
        petrolType = input.nextLine();

        System.lineSeparator();

        System.out.printf("Enter price of petrol: ");
        price = input.nextDouble();

        System.out.printf("Enter discount: ");
        discount = input.nextInt();

        //create PetrolPurchase object
        PetrolPurchase p = new PetrolPurchase(station, quantity, petrolType, price, discount);
        
        //display the information
        System.out.printf("%nSummary of your purchase%n");
        p.printInfo();

        System.out.printf("%nEnter additional quantity of petrol: ");
        double addedQuantity = input.nextDouble();
        double newQuantity = addedQuantity + quantity;
        
        //create object with additional quantity
        PetrolPurchase p2 = new PetrolPurchase(station, newQuantity, petrolType, price, discount);

        System.out.printf("%nYour new purchased price%n");
        p2.printInfo();

        //duplicate object
        PetrolPurchase dupPetrol = new PetrolPurchase(p2);

        System.out.printf("%nDuplicate the same object%n");
        dupPetrol.printInfo();


        input.close();

    }
}
