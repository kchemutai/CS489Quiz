package miu.edu.cse.model;

public class Label {
    private String textLabel;

    public Label() {}
    public Label(String textLabel) {
        this.textLabel = textLabel;
    }
    public String getTextLabel() {
        return textLabel;
    }
    public void setTextLabel(String textLabel) {
        this.textLabel = textLabel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Label{");
        sb.append("textLabel='").append(textLabel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
