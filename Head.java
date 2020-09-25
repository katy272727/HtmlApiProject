package HtmlApi;

public class Head {
    private String title;
    private String charSet;
    private String script;
    private String style;

    public Head(String title, String charSet, String script, String style) {
        this.title = title;
        this.charSet = charSet;
        this.script = script;
        this.style = style;
    }

    public static String makeHead(Head head){
        StringBuilder sb = new StringBuilder();
        sb.append("<head>");
        if (head.title != null){
            sb.append("\n<title>");
            sb.append(head);
            sb.append("</title>");
        }
        if(head.charSet != null){
            sb.append("\n<meta charset=");
            sb.append('"');
            sb.append(head);
            sb.append("\">");
        }
        if(head.script != null){
            sb.append("\n<script src=");
            sb.append('"');
            sb.append(head);
            sb.append("\">");
        }
        if(head.style != null){
            sb.append("\n<style id=");
            sb.append('"');
            sb.append(head);
            sb.append("\">");
        }
        sb.append("\n</head>\n");
        return sb.toString();
    }
}
