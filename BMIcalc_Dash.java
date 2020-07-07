
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
    private JLabel close;
    private JPanel panel_2;
    private JLabel minimize;


    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BMIcalc_Dash B = new BMIcalc_Dash();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public BMIcalc_Dash()
    {
        initialize();
        showBMI.setVisible(false);
        frame.setVisible(true);
        /*EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    initialize();
                    showBMI.setVisible(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/

    }

    private void initialize()
    {
        frame = new JFrame("BMI Calculator Emulator");
        frame.setLocationRelativeTo(null);

        frame.setUndecorated(true);
        //frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);




        heightLabel = new JLabel("Height(cm): ", JLabel.LEFT);
        heightLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        heightLabel.setForeground(new java.awt.Color(255, 255, 255));

        weightLabel = new JLabel("Weight(kg): ", JLabel.LEFT);
        weightLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        weightLabel.setForeground(new java.awt.Color(255, 255, 255));

        heightText = new JTextField(16);
        heightText.setBackground(new java.awt.Color(108, 122, 137));
        heightText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        heightText.setForeground(new java.awt.Color(228, 241, 254));

        weightText = new JTextField(16);
        weightText.setBackground(new java.awt.Color(108, 122, 137));
        weightText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        weightText.setForeground(new java.awt.Color(228, 241, 254));

        btnCalculate =  new JButton("Calculate BMI");
        btnCalculate.setBackground(new java.awt.Color(192, 57, 43));
        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 255));

        close = new JLabel("X");
        close.setBackground(Color.RED);
        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.exit(0);
            }
        });

        minimize = new JLabel("<<");
        minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                DashBoard DB = new DashBoard();

            }
        });

        panel_2 = new JPanel(new BorderLayout());
        panel_2.setBackground(new java.awt.Color(248, 148, 6));

        panel_2.add(minimize, BorderLayout.LINE_START);
        panel_2.add(close,BorderLayout.AFTER_LINE_ENDS);




        showBMI = new JTextArea();
        showBMI.setBackground(new java.awt.Color(108, 122, 137));
        showBMI.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        showBMI.setForeground(new java.awt.Color(228, 241, 254));

        btnCalculate.addActionListener(this);




        panel_1 = new JPanel();
        panel_1.setBackground(new java.awt.Color(248, 148, 6));















        frame.add(panel_2, BorderLayout.NORTH);


        panel_1.add(heightLabel);
        panel_1.add(heightText);
        panel_1.add(weightLabel);
        panel_1.add(weightText);
        panel_1.add(btnCalculate);
        panel_1.add(showBMI);




        frame.add(panel_1, BorderLayout.CENTER);




        frame.setBounds(100, 100, 350, 350);


        pack();

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