package HtmlApi;

public class Table extends HtmlElement {
    private int columns;
    private int rows;
    private String style;
    private String caption;

    public Table(String name, String cssClass, String id, int columns, int rows, String style, String caption) {
        super(name, cssClass, id);
        this.columns = columns;
        this.rows = rows;
        this.style = style;
        this.caption = caption;
    }

    public String makeTable(Table table){
        StringBuilder sb = new StringBuilder();
        sb.append("<table ");
        if(id != null){
            sb.append(table.appendId(id));
        }
        if(name != null){
            sb.append(table.appendName(name));
        }
        if(cssClass != null){
            sb.append(table.appendCssClass(cssClass));
        }
        if (style != null){
            sb.append("style=\"");
            sb.append(style);
            sb.append('"');
        }
        sb.append(">\n");
        if(caption != null){
            sb.append("<caption>");
            sb.append(caption);
            sb.append("</caption>\n");
        }
        if(rows > 0 && columns > 0){
            int colCounter = columns;
            sb.append("<tr>\n");
            while(colCounter > 0){
                sb.append("<th></th>\n");
                colCounter--;
            }
            sb.append("</tr>\n");
            if(rows > 1){
                int rowCounter = rows;
                colCounter = columns;
                while (rowCounter > 1){
                    sb.append("<tr>\n");
                    while (colCounter>0){
                        sb.append("<td></td>\n");
                        colCounter--;
                    }
                    colCounter = columns;
                    sb.append("</tr>\n");
                    rowCounter--;
                }
            }
        }
        sb.append("</table>\n");
        return sb.toString();
    }

    public String insertRows(String table, int columns, int newRows){
        int index = table.lastIndexOf("</tr>") + 6;
        StringBuilder sb = new StringBuilder(table);
        int rowCounter = newRows;

        while(rowCounter > 0) {

            StringBuilder newRow = new StringBuilder();
            newRow.append("<tr>\n");
            int colCounter = columns;
            while (colCounter > 0) {
                newRow.append("<td></td>\n");
                colCounter--;
            }
            newRow.append("</tr>\n");

            sb.insert(index, newRow);
            rowCounter--;
        }
        return sb.toString();
    }
}
