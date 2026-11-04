package project;

public class Main {
    public static void main(String[] args) {

        Customer c = new Customer(
            101, "Siva", "siva@gmail.com", "9876543210"
        );

        System.out.println("CUSTOMER DETAILS");
        c.displayDetails();

        System.out.println("\nNORMAL COMPLAINT");
        Complaint c1 = new Complaint(
            201, "Water problem"
        );
        c1.displayDetails();

        System.out.println("\nURGENT COMPLAINT");
        UrgentComplaint c2 = new UrgentComplaint(
            202, "Electricity problem"
        );
        c2.displayDetails();
    }
}
