package HtmlApi;

public class RadioButton extends HtmlElement {
    private String type;
    private String value;
    private String label;

    public RadioButton(String name, String cssClass, String id, String value, String label) {
        super(name, cssClass, id);
        this.type = "radio";
        this.value = value;
        this.label = label;
    }

    public String makeRadioButton(RadioButton radioButton){
        StringBuilder sb = new StringBuilder();
        sb.append("<input type=\"");
        sb.append(type);
        sb.append("\" ");
        if( getName() != null){
            sb.append(radioButton.appendName(getName()));
        }
        if(getCssClass() != null){
            sb.append(radioButton.appendCssClass(getCssClass()));
        }
        if( getId() != null){
            sb.append(radioButton.appendId(getId()));
        }
        if(value != null){
            sb.append("value=\"");
            sb.append(value);
            sb.append("\"");
        }
        sb.append('>');
        if(label != null && getId() != null);
        sb.append("\n<label for=\"");
        sb.append(getId());
        sb.append("\">");
        sb.append(label);
        sb.append("</label>");
        return sb.toString();
    }
}
