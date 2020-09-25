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
        if( name != null){
            sb.append(radioButton.appendName(name));
        }
        if(cssClass != null){
            sb.append(radioButton.appendCssClass(cssClass));
        }
        if( id != null){
            sb.append(radioButton.appendId(id));
        }
        if(value != null){
            sb.append("value=\"");
            sb.append(value);
            sb.append("\"");
        }
        sb.append('>');
        if(label != null && id != null);
        sb.append("\n<label for=\"");
        sb.append(id);
        sb.append("\">");
        sb.append(label);
        sb.append("</label>");
        return sb.toString();
    }
}
