package HtmlApi;

public class HtmlElement {
    protected String name;
    protected String cssClass;
    protected String id;

    public HtmlElement(String name, String cssClass, String id) {
        this.name = name;
        this.cssClass = cssClass;
        this.id = id;
    }

    public String appendName(String name){
        StringBuilder sb = new StringBuilder();
        sb.append(" name=\"");
        sb.append(name);
        sb.append("\"");
        return sb.toString();
    }

    public String appendCssClass(String cssClass){
        StringBuilder sb = new StringBuilder();
        sb.append(" class=\"");
        sb.append(cssClass);
        sb.append("\"");
        return sb.toString();
    }

    public String appendId(String id){
        StringBuilder sb = new StringBuilder();
        sb.append(" id=\"");
        sb.append(id);
        sb.append("\"");
        return sb.toString();
    }
}
