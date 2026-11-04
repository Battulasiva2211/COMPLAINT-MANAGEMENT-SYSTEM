package project;
public class Customer extends User {
    private String phone;

    public Customer(int userId, String name,
                    String email, String phone) {
        super(userId, name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Phone: " + phone);
    }
}
