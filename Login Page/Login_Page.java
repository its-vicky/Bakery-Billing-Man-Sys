package Login_pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

import CustomerBilling.CustomerBilling;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Page {

	private JFrame frame;
	private JTextField jtxtUsername;
	private JPasswordField jtxtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page window = new Login_Page();
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
	public Login_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 99, 71));
		frame.setBounds(100, 100, 766, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin_System = new JLabel("LOGIN_SYSTEM");
		lblLogin_System.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin_System.setFont(new Font("Perpetua", Font.BOLD, 24));
		lblLogin_System.setBounds(246, 29, 257, 29);
		frame.getContentPane().add(lblLogin_System);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsername.setBounds(164, 136, 126, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(164, 199, 126, 29);
		frame.getContentPane().add(lblPassword);
		
		jtxtUsername = new JTextField();
		jtxtUsername.setBounds(295, 134, 232, 38);
		frame.getContentPane().add(jtxtUsername);
		jtxtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password=jtxtPassword.getText();
				String username=jtxtUsername.getText();
				
				if(username.contains("VIKAS") && password.contains("itsvicky"))
				{
					jtxtPassword.setText(null);
					jtxtUsername.setText(null);
					
					CustomerBilling cb=new CustomerBilling();
					CustomerBilling.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					jtxtPassword.setText(null);
					jtxtUsername.setText(null);
				}
			}
		});
		btnLogin.setBackground(new Color(255, 165, 0));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(49, 296, 110, 45);
		frame.getContentPane().add(btnLogin);
		
		jtxtPassword = new JPasswordField();
		jtxtPassword.setBounds(295, 197, 232, 38);
		frame.getContentPane().add(jtxtPassword);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtUsername.setText(null);
				jtxtPassword.setText(null);
			}
		});
		btnReset.setBackground(new Color(255, 140, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(293, 296, 110, 45);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if youu want to exit","Login Systems",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBackground(new Color(255, 140, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(543, 296, 110, 45);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(46, 268, 607, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(49, 96, 607, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Created by VIKAS CHOUDHARI");
		lblNewLabel.setBounds(316, 366, 167, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
