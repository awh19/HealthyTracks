import javax.swing.*;

public class WorkoutLogGUI extends JFrame {
    private JPanel mainPanel;
    private JList exerciseList;
    private JScrollPane exerciseListContainer;
    private JTextArea textFieldSets;
    private JButton SAVEButton;
    private JButton CANCELButton;
    private JPanel jPanelSets;
    private JLabel jLabelSets;
    private JLabel jLabelReps;
    private JLabel jLabelWeight;
    private JTextArea textFieldReps;
    private JTextArea textFieldWeight;

    public WorkoutLogGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new WorkoutLogGUI("Your Workout Log");
        frame.setVisible(true);
    }
}
