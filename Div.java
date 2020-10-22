package HtmlApi;

public class Div extends HtmlElement{
    public Div(String name, String cssClass, String id) {
        super(name, cssClass, id);
    }

    public String makeDiv(Div div){
        StringBuilder sb = new StringBuilder();
        sb.append("<div");
        if( getName() != null){
            sb.append(div.appendName(getName()));
        }
        if(getCssClass() != null){
            sb.append(div.appendCssClass(getCssClass()));
        }
        if( getId() != null){
            sb.append(div.appendId(getId()));
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
