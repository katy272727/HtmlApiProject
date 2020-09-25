package HtmlApi;

public class Button extends HtmlElement {
    private String onClickEvent;
    private boolean autofocus;
    private boolean disabled;
    private String form;
    private String type;
    private String text;

    public Button(String text, String name, String cssClass, String id, String onClickEvent, boolean autofocus, boolean disabled, String form,  String type) {
        super(name, cssClass, id);
        this.text = text;
        this.onClickEvent = onClickEvent;
        this.autofocus = autofocus;
        this.disabled = disabled;
        this.form = form;

        if(type == null){
            this.type = "button";
        }
        else{
            this.type = type;
        }

    }

    public String makeButton(Button button){
        StringBuilder sb = new StringBuilder();
        sb.append("<button");
        if(button.onClickEvent != null){
            sb.append(" onclick=\"");
            sb.append(onClickEvent);
            sb.append('"');
        }
        if(button.autofocus == true){
            sb.append(" autofocus");
        }
        if(button.disabled == true){
            sb.append(" disabled");
        }
        if(button.form != null){
            sb.append(" form=\"");
            sb.append(form);
            sb.append('"');
        }
        if( name != null){
            sb.append(button.appendName(name));
        }
        if(cssClass != null){
            sb.append(button.appendCssClass(cssClass));
        }
        if( id != null){
            sb.append(button.appendId(id));
        }
        sb.append(" type=\"");
        sb.append(type);
        sb.append("\"");
        sb.append('>');
        sb.append(text);
        sb.append("</button>");
        return sb.toString();
    }
}
