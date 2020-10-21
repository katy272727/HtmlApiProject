package HtmlApi;

public class Div extends HtmlElement{
    public Div(String name, String cssClass, String id) {
        super(name, cssClass, id);
    }

    public String makeDiv(Div div){
        StringBuilder sb = new StringBuilder();
        sb.append("<div");
        if( name != null){
            sb.append(div.appendName(name));
        }
        if(cssClass != null){
            sb.append(div.appendCssClass(cssClass));
        }
        if( id != null){
            sb.append(div.appendId(id));
        }
        sb.append('>');
        sb.append("\n</div>");
        return sb.toString();
    }

    public String insertAnotherElement(String div, String otherElement){
        int index = div.indexOf('>') + 1;
        StringBuilder sb = new StringBuilder(div);
        sb.insert(index, "\n");
        sb.insert(index + 1, otherElement );
        return sb.toString();
    }
}
