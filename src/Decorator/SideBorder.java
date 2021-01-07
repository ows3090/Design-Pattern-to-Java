package Decorator;

public class SideBorder extends Border {

    public SideBorder(Widget widget) {
        super(widget);
    }

    @Override
    public int getColumns() {
        return widget.getColumns()+2;
    }

    @Override
    public int getRows() {
        return widget.getRows();
    }

    @Override
    public String getRowText(int row) {
        return "("+widget.getRowText(row)+")";
    }
}
