package HtmlApi;

public class Body {
    public  String makeBody(){
        StringBuilder sb = new StringBuilder();
        sb.append("<body>\n</body>\n");
        return sb.toString();
    }

    public String insertAnotherElement(String body, String otherElement){
        int index = body.indexOf('>') + 1;
        StringBuilder sb = new StringBuilder(body);
        sb.insert(index, "\n");
        sb.insert(index + 1, otherElement );
        return sb.toString();
    }
}
