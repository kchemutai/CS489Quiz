package miu.edu.cse.model;

public class EmailAddress {
    private String email;
    private Label label;

    public EmailAddress() {}

    public EmailAddress(String email, Label label) {
        this.email = email;
        this.label = label;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmailAddress{");
        sb.append("email='").append(email).append('\'');
        sb.append(", label=").append(label);
        sb.append('}');
        return sb.toString();
    }
}
