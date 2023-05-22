package Home_Work_OOP_6.task2;

public class ReportItem {

    private String description;
    private float amount;

    public ReportItem(String description, float amount) {
        this.description = description;
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
