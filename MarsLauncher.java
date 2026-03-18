import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import java.awt.Color;

public class MarsLauncher {
    public static void main(String[] args) {
        try {
            FlatDarkLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to load dark theme, falling back to default look and feel.");
        }

        // Override remaining Swing component defaults for full dark mode
        Color bg = new Color(30, 30, 30);
        Color fg = new Color(212, 212, 212);
        Color bgAlt = new Color(37, 37, 38);
        Color selection = new Color(38, 79, 120);

        UIManager.put("Table.background", bg);
        UIManager.put("Table.foreground", fg);
        UIManager.put("Table.selectionBackground", selection);
        UIManager.put("Table.selectionForeground", fg);
        UIManager.put("Table.gridColor", new Color(60, 60, 60));
        UIManager.put("Table.alternateRowColor", bgAlt);
        UIManager.put("TableHeader.background", new Color(45, 45, 45));
        UIManager.put("TableHeader.foreground", fg);

        UIManager.put("TextArea.background", bg);
        UIManager.put("TextArea.foreground", fg);
        UIManager.put("TextArea.caretForeground", Color.WHITE);
        UIManager.put("TextField.background", new Color(45, 45, 45));
        UIManager.put("TextField.foreground", fg);
        UIManager.put("TextPane.background", bg);
        UIManager.put("TextPane.foreground", fg);

        UIManager.put("Panel.background", new Color(37, 37, 38));
        UIManager.put("Label.foreground", fg);

        UIManager.put("TabbedPane.background", new Color(37, 37, 38));
        UIManager.put("ToolBar.background", new Color(37, 37, 38));
        UIManager.put("MenuBar.background", new Color(37, 37, 38));
        UIManager.put("ScrollPane.background", bg);
        UIManager.put("SplitPane.background", new Color(37, 37, 38));

        Mars.main(args);
    }
}
