package HtmlApi;

public class HtmlDocument {
    public String generateHtmlDocument(String head, String body) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        if (head == null) {
            Head hd = new Head(null, null, null, null);
            head = Head.makeHead(hd);
        }
        sb.append(head);
        if (body == null) {
            Body bd = new Body();
            body = bd.makeBody();
        }
        sb.append(body);
        sb.append("</html>");
        return sb.toString();
    }
}
