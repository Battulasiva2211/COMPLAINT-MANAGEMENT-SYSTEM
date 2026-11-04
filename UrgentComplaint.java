package project;

public class UrgentComplaint extends Complaint {

    public UrgentComplaint(int id, String description) {
        super(id, description);
    }

    @Override
    public void displayDetails() {
        System.out.println("URGENT COMPLAINT");
        super.displayDetails();
        System.out.println("Priority: High");
    }
}

