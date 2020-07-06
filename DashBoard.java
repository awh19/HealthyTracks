import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;

public class DashBoard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard window = new DashBoard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 434, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 428, 290);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		
		JButton btnTimerStopwatch = new JButton("Timer & Stopwatch");
		btnTimerStopwatch.setBackground(Color.RED);
		btnTimerStopwatch.setOpaque(true);
		panel_1.add(btnTimerStopwatch, BorderLayout.CENTER);
		
		JButton btnExerciseLog = new JButton("Exercise Log");
		btnExerciseLog.setBackground(Color.RED);
		btnExerciseLog.setOpaque(true);
		panel_1.add(btnExerciseLog, BorderLayout.WEST);
		
		JLabel lblHealhyTracks = new JLabel("Healthy Tracks");
		lblHealhyTracks.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealhyTracks.setFont(new Font("Lucida Grande", Font.PLAIN, 34));
		lblHealhyTracks.setBackground(Color.RED);
		lblHealhyTracks.setOpaque(true);
		panel_1.add(lblHealhyTracks, BorderLayout.NORTH);
		
		JButton btnUserProfile = new JButton("User Profile");
		btnUserProfile.setBackground(Color.BLACK);
		btnUserProfile.setOpaque(true);
		panel_1.add(btnUserProfile, BorderLayout.SOUTH);
	}
}
