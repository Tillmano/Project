import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton button;
    private JTextField sourceTextfield, destTextfield, IdTextfield;
    private JLabel sourcePromptlabel, destPromptlabel, IdPromptLabel;
    private Graph<Integer> myGraph;

    public GUI(Graph<Integer> myGraph_) {
        myGraph = myGraph_;
        setLayout(new FlowLayout());
        IdPromptLabel = new JLabel("Enter the component's ID");
        add(IdPromptLabel);
        IdTextfield = new JTextField(5);
        add(IdTextfield);
        sourcePromptlabel = new JLabel("Enter the source node");
        add(sourcePromptlabel);
        sourceTextfield = new JTextField(5);
        add(sourceTextfield);
        destPromptlabel = new JLabel("Enter the destination node");
        add(destPromptlabel);
        destTextfield = new JTextField(5);
        add(destTextfield);
        button = new JButton("Enter");
        add(button);
        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                int sourceNode = (int) (Double.parseDouble(sourceTextfield.getText()));
                int destNode = (int) (Double.parseDouble(sourceTextfield.getText()));
                int ID = (int) (Double.parseDouble(sourceTextfield.getText()));
                myGraph.addComponent(sourceNode, destNode, true);
        }
    }
}


