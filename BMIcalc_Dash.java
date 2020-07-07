
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class BMIcalc_Dash extends javax.swing.JFrame implements ActionListener
{
    private JFrame frame;
    private JLabel heightLabel;
    private JLabel weightLabel;
    private JTextField heightText;
    private JTextField weightText;
    private JTextArea showBMI;
    private JButton btnCalculate;
    private JPanel panel_1;


    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BMIcalc_Dash window = new BMIcalc_Dash();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/
    public BMIcalc_Dash()
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    initialize();
                    showBMI.setVisible(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void initialize()
    {
        frame = new JFrame("BMI Calculator Emulator");
        //frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);




        heightLabel = new JLabel("Height(cm): ", JLabel.LEFT);
        weightLabel = new JLabel("Weight(kg): ", JLabel.LEFT);
        heightText = new JTextField(16);
        weightText = new JTextField(16);
        btnCalculate =  new JButton("Calculate BMI");
        btnCalculate.setOpaque(true);
        showBMI = new JTextArea();

        btnCalculate.addActionListener(this);

        panel_1 = new JPanel();


        panel_1.add(heightLabel);
        panel_1.add(heightText);
        panel_1.add(weightLabel);
        panel_1.add(weightText);
        panel_1.add(btnCalculate);
        panel_1.add(showBMI);


        frame.add(panel_1);
        frame.setBounds(100, 100, 250, 250);
        int frameWidth = 250;
        int frameHeight = 250;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        panel_1.setBounds((int) screenSize.getWidth() - frameWidth, 0, frameWidth, frameHeight);

    }

    public void actionPerformed(ActionEvent e)
    {
        String h = heightText.getText();
        String w = weightText.getText();
        BMI_Calculator BC = new BMI_Calculator(h, w);
        String emulator_result = BC.BMI_Calculate();
        showBMI.setVisible(true);
        showBMI.setText("");
        showBMI.setText("BMI: "+emulator_result);



    }

}