import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            new GameMenuSwing().setVisible(true);
        });
    }
}