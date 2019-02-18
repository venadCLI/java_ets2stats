import java.awt.Component;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ProgressCellRenderer extends JProgressBar
        implements TableCellRenderer {

    /**
     * Creates a JProgressBar with the range 0,100.
     */
    public ProgressCellRenderer(int max) {
        super(0, max);
        setValue(0);
        setString("0%");
        setStringPainted(true);
    }

    public Component getTableCellRendererComponent(
            JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {

        int p = 0;
        try {
            p = Integer.parseInt(value.toString());
        } catch (NumberFormatException e) {
        }
        setValue(p);

        double calc = (float) p / (float) super.getMaximum();
        
        String toOutput = String.valueOf(String.format("%.1f", calc*100));
        setString(toOutput + " %");

        return this;
    }
}
