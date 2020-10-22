package HtmlApi;

public class HtmlElement {
    private String name;
    private String cssClass;
    private String id;

    public String getName() {
        return name;
    }

    public String getCssClass() {
        return cssClass;
    }

    public String getId() {
        return id;
    }

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
