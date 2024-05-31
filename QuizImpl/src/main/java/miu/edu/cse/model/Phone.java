package miu.edu.cse.model;

public class Phone {
    private String phoneNumber;
    private Label label;

    public Phone() {}
    public Phone(String phoneNumber, Label label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", label=").append(label);
        sb.append('}');
        return sb.toString();
    }
}
