package project;

public class Complaint {
    private int complaintId;
    private String description;
    private String status;

    public Complaint(int complaintId, String description) {
        this.complaintId = complaintId;
        this.description = description;
        this.status = "Pending";
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayDetails() {
        System.out.println("Complaint ID: " + complaintId);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
    }
}
