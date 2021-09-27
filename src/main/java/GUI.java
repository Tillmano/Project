import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private String ts = "", td= "";
    int source = 0, dest = 0;
    private JTextField stextfield;
    private JLabel spromptlabel;
    private JTextField dtextfield;
    private JLabel dpromptlabel;

    public GUI() {
        setLayout(new FlowLayout());
        spromptlabel = new JLabel("What is the source of the edge?");
        add(spromptlabel);
        System.out.println("Check");
        stextfield = new JTextField(5);
        add(stextfield);
        ts = (stextfield.getText());
        dpromptlabel = new JLabel("What is the destination of the edge?");
        add(dpromptlabel);
        dtextfield = new JTextField(5);
        add(dtextfield);
        td = (dtextfield.getText());
    }
}

