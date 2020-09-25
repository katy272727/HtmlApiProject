package HtmlApi;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


class HtmlDocumentTest {

    @Test
    public void testGenerateHtmlDocument(){
HtmlDocument document = new HtmlDocument();
assertThat(document.generateHtmlDocument("<head>\n" +
        "<meta charset=\"UTF-8\">\n" +
        "</head>", "<body>\n" +
        "</body>"), equalTo("<!DOCTYPE html>\n" +
        "<html>\n" +
        "<head>\n" +
        "<meta charset=\"UTF-8\">\n" +
        "</head>\n" +
        "<body>\n" +
        "</body>\n" +
        "</html>"));
    }

}