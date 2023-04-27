package CustomerBilling;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.text.*;
import java.util.Calendar;
import java.awt.print.*;
import javax.swing.DefaultComboBoxModel;

public class CustomerBilling extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtFirstName;
	private JTextField jtxtLastName;
	private JTextField jtxtPostCode;
	private JTextField jtxtMobile;
	private JTextField jtxtDateOfBirth;
	private JTextField jtxtKim;
	private JTextField jtxtKerry;
	private JTextField jtxtCoffee;
	private JTextField jtxtSwidon;
	private JTextField jtxtYork;
	private JTextField jtxtIshan;
	private JTextField jtxtLagos;
	private JTextField jtxtKenya;
	private JTextField jtxtCariton;
	private JTextField jtxtQueen;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtAddress;
	private JTextField jtxtEmail;
	private JTextField jtxtCustomerRef;
	private JFrame frame;
	
	String iTax,iSubTotal,iTotal;
	double [] itemcost=new double[20];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBilling frame = new CustomerBilling();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerBilling() {
		addWindowListener((WindowListener) new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEnabled(false);
				int refs= 5015 + (int) (Math.random()*17238);
				String cRef="";
				cRef+=refs+1560;
				
				jtxtCustomerRef.setText(cRef);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(29, 36, 1304, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(628, 37, 1, 1);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 21, 390, 498);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_2.setBackground(new Color(95, 158, 160));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setBounds(178, 57, 179, 33);
		panel_2.add(jtxtFirstName);
		jtxtFirstName.setColumns(10);
		
		Label labCustomerRef = new Label("Customer Ref");
		labCustomerRef.setFont(new Font("Tahoma", Font.BOLD, 20));
		labCustomerRef.setBounds(22, 28, 139, 22);
		panel_2.add(labCustomerRef);
		
		Label labFirstName = new Label("First Name");
		labFirstName.setFont(new Font("Tahoma", Font.BOLD, 20));
		labFirstName.setBounds(22, 68, 139, 22);
		panel_2.add(labFirstName);
		
		jtxtLastName = new JTextField();
		jtxtLastName.setColumns(10);
		jtxtLastName.setBounds(178, 96, 179, 33);
		panel_2.add(jtxtLastName);
		
		jtxtPostCode = new JTextField();
		jtxtPostCode.setColumns(10);
		jtxtPostCode.setBounds(178, 175, 179, 33);
		panel_2.add(jtxtPostCode);
		
		Label labAddress = new Label("Address");
		labAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		labAddress.setBounds(22, 147, 139, 22);
		panel_2.add(labAddress);
		
		Label labLastName = new Label("Last Name");
		labLastName.setFont(new Font("Tahoma", Font.BOLD, 20));
		labLastName.setBounds(22, 107, 139, 22);
		panel_2.add(labLastName);
		
		Label labPostCode = new Label("Post Code");
		labPostCode.setFont(new Font("Tahoma", Font.BOLD, 20));
		labPostCode.setBounds(22, 186, 139, 22);
		panel_2.add(labPostCode);
		
		Label labMobile = new Label("Mobile");
		labMobile.setFont(new Font("Tahoma", Font.BOLD, 20));
		labMobile.setBounds(22, 225, 139, 22);
		panel_2.add(labMobile);
		
		Label labEmail = new Label("Email");
		labEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		labEmail.setBounds(22, 264, 139, 22);
		panel_2.add(labEmail);
		
		Label labNationality = new Label("Nationality");
		labNationality.setFont(new Font("Tahoma", Font.BOLD, 20));
		labNationality.setBounds(22, 303, 139, 22);
		panel_2.add(labNationality);
		
		Label labDateofBirth = new Label("Date of Birth");
		labDateofBirth.setFont(new Font("Tahoma", Font.BOLD, 20));
		labDateofBirth.setBounds(22, 342, 139, 22);
		panel_2.add(labDateofBirth);
		
		Label labTypes = new Label("Types of ID");
		labTypes.setFont(new Font("Tahoma", Font.BOLD, 20));
		labTypes.setBounds(22, 380, 139, 22);
		panel_2.add(labTypes);
		
		Label labGender = new Label("Gender");
		labGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		labGender.setBounds(22, 420, 139, 22);
		panel_2.add(labGender);
		
		Label labRoom = new Label("Room Type");
		labRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
		labRoom.setBounds(22, 459, 139, 22);
		panel_2.add(labRoom);
		
		jtxtMobile = new JTextField();
		jtxtMobile.setColumns(10);
		jtxtMobile.setBounds(178, 214, 179, 33);
		panel_2.add(jtxtMobile);
		
		jtxtDateOfBirth = new JTextField();
		jtxtDateOfBirth.setColumns(10);
		jtxtDateOfBirth.setBounds(178, 331, 179, 33);
		panel_2.add(jtxtDateOfBirth);
		
		JComboBox jcomNationality = new JComboBox();
		jcomNationality.setModel(new DefaultComboBoxModel(new String[] {"India", "England", "Russia", "America", "Japan"}));
		jcomNationality.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcomNationality.setBounds(178, 292, 179, 33);
		panel_2.add(jcomNationality);
		
		JComboBox jcomGender = new JComboBox();
		jcomGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Other"}));
		jcomGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcomGender.setBounds(178, 409, 179, 33);
		panel_2.add(jcomGender);
		
		JComboBox jcomRoom = new JComboBox();
		jcomRoom.setModel(new DefaultComboBoxModel(new String[] {"Single", "Double"}));
		jcomRoom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcomRoom.setBounds(178, 448, 179, 33);
		panel_2.add(jcomRoom);
		
		JComboBox jcomType = new JComboBox();
		jcomType.setModel(new DefaultComboBoxModel(new String[] {"Student", "Pilot", "Driving License", "Passport"}));
		jcomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jcomType.setBounds(178, 370, 179, 33);
		panel_2.add(jcomType);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setColumns(10);
		jtxtAddress.setBounds(178, 136, 179, 33);
		panel_2.add(jtxtAddress);
		
		jtxtEmail = new JTextField();
		jtxtEmail.setColumns(10);
		jtxtEmail.setBounds(178, 253, 179, 33);
		panel_2.add(jtxtEmail);
		
		jtxtCustomerRef = new JTextField();
		jtxtCustomerRef.setColumns(10);
		jtxtCustomerRef.setBounds(178, 17, 179, 33);
		panel_2.add(jtxtCustomerRef);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_2_1.setBackground(new Color(176, 224, 230));
		panel_2_1.setBounds(425, 11, 425, 662);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		jtxtKim = new JTextField();
		jtxtKim.setText("0");
		jtxtKim.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtKim.setColumns(10);
		jtxtKim.setBounds(298, 25, 79, 27);
		panel_2_1.add(jtxtKim);
		
		JCheckBox chkCoffeeCake = new JCheckBox("Coffee Cake");
		chkCoffeeCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkCoffeeCake.isSelected())
				{
					jtxtCoffee.setEnabled(true);
					jtxtCoffee.setText("");
					jtxtCoffee.requestFocus();
				}
				else
				{
					jtxtCoffee.setEnabled(false);
					jtxtCoffee.setText("0");
				}
			}
		});
		chkCoffeeCake.setBackground(new Color(176, 224, 230));
		chkCoffeeCake.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkCoffeeCake.setBounds(22, 104, 163, 27);
		panel_2_1.add(chkCoffeeCake);
		
		JCheckBox chkSwidon = new JCheckBox("Swindon Cake");
		chkSwidon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkSwidon.isSelected())
				{
					jtxtSwidon.setEnabled(true);
					jtxtSwidon.setText("");
					jtxtSwidon.requestFocus();
				}
				else
				{
					jtxtSwidon.setEnabled(false);
					jtxtSwidon.setText("0");
				}
			}
		});
		chkSwidon.setBackground(new Color(176, 224, 230));
		chkSwidon.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkSwidon.setBounds(22, 147, 163, 27);
		panel_2_1.add(chkSwidon);
		
		JCheckBox chkYork = new JCheckBox("York Cream Cake");
		chkYork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkYork.isSelected())
				{
					jtxtYork.setEnabled(true);
					jtxtYork.setText("");
					jtxtYork.requestFocus();
				}
				else
				{
					jtxtYork.setEnabled(false);
					jtxtYork.setText("0");
				}
			}
		});
		chkYork.setBackground(new Color(176, 224, 230));
		chkYork.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkYork.setBounds(22, 189, 181, 27);
		panel_2_1.add(chkYork);
		
		JCheckBox chkIshan = new JCheckBox("Ishan Cream Cake");
		chkIshan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkIshan.isSelected())
				{
					jtxtIshan.setEnabled(true);
					jtxtIshan.setText("");
					jtxtIshan.requestFocus();
				}
				else
				{
					jtxtIshan.setEnabled(false);
					jtxtIshan.setText("0");
				}
			}
		});
		chkIshan.setBackground(new Color(176, 224, 230));
		chkIshan.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkIshan.setBounds(22, 232, 212, 27);
		panel_2_1.add(chkIshan);
		
		JCheckBox chkLagos = new JCheckBox("Lagos Chocolate Cake");
		chkLagos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkLagos.isSelected())
				{
					jtxtLagos.setEnabled(true);
					jtxtLagos.setText("");
					jtxtLagos.requestFocus();
				}
				else
				{
					jtxtLagos.setEnabled(false);
					jtxtLagos.setText("0");
				}
			}
		});
		chkLagos.setBackground(new Color(176, 224, 230));
		chkLagos.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkLagos.setBounds(22, 276, 229, 27);
		panel_2_1.add(chkLagos);
		
		JCheckBox chkKenya = new JCheckBox("Kenya Chocolate Cake");
		chkKenya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkKenya.isSelected())
				{
					jtxtKenya.setEnabled(true);
					jtxtKenya.setText("");
					jtxtKenya.requestFocus();
				}
				else
				{
					jtxtKenya.setEnabled(false);
					jtxtKenya.setText("0");
				}
			}
		});
		chkKenya.setBackground(new Color(176, 224, 230));
		chkKenya.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkKenya.setBounds(22, 317, 269, 27);
		panel_2_1.add(chkKenya);
		
		JCheckBox chkCariton = new JCheckBox("Cariton Hill Chocolate Cake");
		chkCariton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkCariton.isSelected())
				{
					jtxtCariton.setEnabled(true);
					jtxtCariton.setText("");
					jtxtCariton.requestFocus();
				}
				else
				{
					jtxtCariton.setEnabled(false);
					jtxtCariton.setText("0");
				}
			}
		});
		chkCariton.setBackground(new Color(176, 224, 230));
		chkCariton.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkCariton.setBounds(22, 357, 277, 27);
		panel_2_1.add(chkCariton);
		
		JCheckBox chkQueen = new JCheckBox("Queen's Park Chocolate Cake");
		chkQueen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkQueen.isSelected())
				{
					jtxtQueen.setEnabled(true);
					jtxtQueen.setText("");
					jtxtQueen.requestFocus();
				}
				else
				{
					jtxtQueen.setEnabled(false);
					jtxtQueen.setText("0");
				}
			}
		});
		chkQueen.setBackground(new Color(176, 224, 230));
		chkQueen.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkQueen.setBounds(22, 398, 277, 27);
		panel_2_1.add(chkQueen);
		
		jtxtKerry = new JTextField();
		jtxtKerry.setBackground(new Color(255, 255, 255));
		jtxtKerry.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtKerry.setText("0");
		jtxtKerry.setColumns(10);
		jtxtKerry.setBounds(298, 65, 79, 27);
		panel_2_1.add(jtxtKerry);
		
		jtxtCoffee = new JTextField();
		jtxtCoffee.setBackground(new Color(255, 255, 255));
		jtxtCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtCoffee.setText("0");
		jtxtCoffee.setColumns(10);
		jtxtCoffee.setBounds(298, 107, 79, 27);
		panel_2_1.add(jtxtCoffee);
		
		jtxtSwidon = new JTextField();
		jtxtSwidon.setBackground(new Color(255, 255, 255));
		jtxtSwidon.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtSwidon.setText("0");
		jtxtSwidon.setColumns(10);
		jtxtSwidon.setBounds(298, 150, 79, 27);
		panel_2_1.add(jtxtSwidon);
		
		jtxtYork = new JTextField();
		jtxtYork.setBackground(new Color(255, 255, 255));
		jtxtYork.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtYork.setText("0");
		jtxtYork.setColumns(10);
		jtxtYork.setBounds(298, 192, 79, 27);
		panel_2_1.add(jtxtYork);
		
		jtxtIshan = new JTextField();
		jtxtIshan.setBackground(new Color(255, 255, 255));
		jtxtIshan.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtIshan.setText("0");
		jtxtIshan.setColumns(10);
		jtxtIshan.setBounds(298, 235, 79, 27);
		panel_2_1.add(jtxtIshan);
		
		jtxtLagos = new JTextField();
		jtxtLagos.setBackground(new Color(255, 255, 255));
		jtxtLagos.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtLagos.setText("0");
		jtxtLagos.setColumns(10);
		jtxtLagos.setBounds(298, 279, 79, 27);
		panel_2_1.add(jtxtLagos);
		
		jtxtKenya = new JTextField();
		jtxtKenya.setBackground(new Color(255, 255, 255));
		jtxtKenya.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtKenya.setText("0");
		jtxtKenya.setColumns(10);
		jtxtKenya.setBounds(298, 320, 79, 27);
		panel_2_1.add(jtxtKenya);
		
		jtxtCariton = new JTextField();
		jtxtCariton.setBackground(new Color(255, 255, 255));
		jtxtCariton.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtCariton.setText("0");
		jtxtCariton.setColumns(10);
		jtxtCariton.setBounds(298, 360, 79, 27);
		panel_2_1.add(jtxtCariton);
		
		jtxtQueen = new JTextField();
		jtxtQueen.setBackground(new Color(255, 255, 255));
		jtxtQueen.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtQueen.setText("0");
		jtxtQueen.setColumns(10);
		jtxtQueen.setBounds(298, 401, 79, 27);
		panel_2_1.add(jtxtQueen);
		
		JCheckBox chkKimCake = new JCheckBox("Kim's Cake");
		chkKimCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chkKimCake.isSelected())
				{
					jtxtKim.setEnabled(true);
					jtxtKim.setText("");
					jtxtKim.requestFocus();
				}
				else
				{
					jtxtKim.setEnabled(false);
					jtxtKim.setText("0");
				}
			}
		});
		chkKimCake.setBackground(new Color(176, 224, 230));
		chkKimCake.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkKimCake.setBounds(22, 26, 163, 23);
		panel_2_1.add(chkKimCake);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		panel_3.setBounds(22, 483, 377, 155);
		panel_2_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel jlblTax = new JLabel("Tax");
		jlblTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlblTax.setBounds(10, 18, 73, 26);
		panel_3.add(jlblTax);
		
		JLabel jlblSubtotal = new JLabel("SubTotal");
		jlblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlblSubtotal.setBounds(10, 53, 101, 26);
		panel_3.add(jlblSubtotal);
		
		JLabel jlblTotal = new JLabel("Total");
		jlblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		jlblTotal.setBounds(10, 90, 73, 26);
		panel_3.add(jlblTotal);
		
		jtxtTax = new JTextField();
		jtxtTax.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtTax.setColumns(10);
		jtxtTax.setBounds(152, 17, 179, 27);
		panel_3.add(jtxtTax);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setText("\r\n");
		jtxtSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(152, 52, 179, 27);
		panel_3.add(jtxtSubTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(152, 89, 179, 27);
		panel_3.add(jtxtTotal);
		
		JCheckBox chkKerrysCake = new JCheckBox("Kerry's Cake");
		chkKerrysCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chkKerrysCake.isSelected())
				{
					jtxtKerry.setEnabled(true);
					jtxtKerry.setText("");
					jtxtKerry.requestFocus();
				}
				else
				{
					jtxtKerry.setEnabled(false);
					jtxtKerry.setText("0");
				}
			}
		});
		chkKerrysCake.setFont(new Font("Tahoma", Font.BOLD, 17));
		chkKerrysCake.setBackground(new Color(176, 224, 230));
		chkKerrysCake.setBounds(22, 63, 163, 27);
		panel_2_1.add(chkKerrysCake);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_2_3.setBackground(new Color(95, 158, 160));
		panel_2_3.setBounds(868, 508, 412, 148);
		panel.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_2_2.setBackground(new Color(95, 158, 160));
		panel_2_2.setBounds(868, 21, 412, 498);
		panel.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(21, 24, 365, 451);
		panel_2_2.add(jtxtReceipt);
		
		JPanel panel_2_3_1 = new JPanel();
		panel_2_3_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_2_3_1.setBackground(new Color(95, 158, 160));
		panel_2_3_1.setBounds(25, 508, 390, 153);
		panel.add(panel_2_3_1);
		panel_2_3_1.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtKim.setEnabled(false);
				jtxtKerry.setEnabled(false);
				jtxtCoffee.setEnabled(false);
				jtxtSwidon.setEnabled(false);
				jtxtKenya.setEnabled(false);
				jtxtIshan.setEnabled(false);
				jtxtCariton.setEnabled(false);
				jtxtLagos.setEnabled(false);
				jtxtYork.setEnabled(false);
				jtxtQueen.setEnabled(false);
				jtxtReceipt.setEnabled(false);
				
				jtxtKim.setText("0");
				jtxtKerry.setText("0");
				jtxtCoffee.setText("0");
				jtxtSwidon.setText("0");
				jtxtKenya.setText("0");
				jtxtIshan.setText("0");
				jtxtCariton.setText("0");
				jtxtLagos.setText("0");
				jtxtYork.setText("0");
				jtxtQueen.setText("0");
				
				chkKimCake.setSelected(false);
				chkKerrysCake.setSelected(false);
				chkCoffeeCake.setSelected(false);
				chkSwidon.setSelected(false);
				chkKenya.setSelected(false);
				chkIshan.setSelected(false);
				chkCariton.setSelected(false);
				chkLagos.setSelected(false);
				chkYork.setSelected(false);
				chkQueen.setSelected(false);
				
				jtxtCustomerRef.setText(null);
				jtxtCustomerRef.setEnabled(false);
				int refs= 5015 + (int) (Math.random()*17238);
				String cRef="";
				cRef+=refs+1560;
				
				jtxtCustomerRef.setText(cRef);
				jtxtFirstName.setText(null);
				jtxtLastName.setText(null);
				jtxtAddress.setText(null);
				jtxtPostCode.setText(null);
				jtxtMobile.setText(null);
				jtxtEmail.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				jtxtDateOfBirth.setText(null);
				jtxtReceipt.setText(null);
				jcomNationality.setSelectedIndex(0);
				jcomType.setSelectedIndex(0);
				jcomGender.setSelectedIndex(0);
				jcomRoom.setSelectedIndex(0);
				
			}
		});
		btnReset.setBounds(45, 43, 110, 50);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel_2_3.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirme if you want to exit","Customer Billing Systems",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(229, 43, 110, 50);
		panel_2_3.add(btnExit);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				itemcost[0]=Double.parseDouble(jtxtKim.getText())*500;
				itemcost[1]=Double.parseDouble(jtxtKerry.getText())*430;
				itemcost[2]=Double.parseDouble(jtxtCoffee.getText())*455;
				itemcost[3]=Double.parseDouble(jtxtSwidon.getText())*640;
				itemcost[4]=Double.parseDouble(jtxtYork.getText())*280;
				itemcost[5]=Double.parseDouble(jtxtIshan.getText())*350;
				itemcost[6]=Double.parseDouble(jtxtLagos.getText())*460;
				itemcost[7]=Double.parseDouble(jtxtKenya.getText())*900;
				itemcost[8]=Double.parseDouble(jtxtCariton.getText())*700;
				itemcost[9]=Double.parseDouble(jtxtQueen.getText())*650;
				
				itemcost[10] = itemcost[0]+ itemcost[1]+ itemcost[2]+ itemcost[3]+ itemcost[4];
				itemcost[11] = itemcost[5]+ itemcost[6]+ itemcost[7]+ itemcost[8]+ itemcost[9];
				
				itemcost[12]=itemcost[10]+ itemcost[11];
				
				iTax=String.format("INR %.2f", itemcost[12]/100);
				iSubTotal=String.format("INR %.2f", itemcost[12]);
				iTotal=String.format("INR %.2f", itemcost[12]+(itemcost[12]/100));
				
				jtxtTax.setText(iTax);
				jtxtSubTotal.setText(iSubTotal);
				jtxtTotal.setText(iTotal);
				
				//=============================================================================
				jtxtReceipt.setEnabled(true);
				//=============================================================================
				int refs=1325 +(int) (Math.random()*4238);
				
				//=============================================================================
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate=new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				//=============================================================================
				jtxtReceipt.append("\tCustomer Billing Systems\n"+"Reference:\t\t\t"+refs+
						"\n=============================================================\t" +
						"\n=============================================================\t" +
						"\nCustomer Ref:\t\t\t" + jtxtCustomerRef.getText() +
				"\nFirst Name:\t\t\t"+jtxtFirstName.getText() +
				"\nLast Name:\t\t\t"+jtxtLastName.getText() +
				"\nKim's Cake:\t\t\t"+jtxtKim.getText() +
				"\nKerry's Cake:\t\t\t"+jtxtKerry.getText() +
				"\nCoffee Cake:\t\t\t"+ jtxtCoffee.getText() +
				
				"\nSwidon Cake:\t\t\t"+ jtxtSwidon.getText() +
				"\nYork Cake:\t\t\t"+ jtxtYork.getText() +
				"\nBlack Forest Cake:\t\t"+jtxtIshan.getText() +
				"\nLagos Cake:\t\t\t"+jtxtLagos.getText() +
				"\nKilburn Cake:\t\t\t"+jtxtKenya.getText() +
				"\nCarlton:\t\t\t"+jtxtCariton.getText() +
				"\nQueen's :\t\t\t"+ jtxtQueen.getText() +
				
					"\n=================================================================\t" +
					
					"\nTax:\t\t\t"+iTax +
					"\nSub Total:\t\t\t"+iSubTotal +
					"\nTotal:\t\t\t"+iTotal +
					"\n=================================================================\t" +
					"\nDate: "+Tdate.format(timer.getTime()) +
					"\t\tTime: "+tTime.format(timer.getTime()) +
					"\n\n\t<< Thank You For Shopping at JAVA SHOP >>\n" + 
					"\n\n\tCREATED BY VIKAS CHOUDHARI..!!");
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTotal.setBounds(210, 45, 125, 52);
		panel_2_3_1.add(btnTotal);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					//JTextComponent jtxtReceipt = null;
					jtxtReceipt.print();
				}
				catch(java.awt.print.PrinterException e1)
				{
					System.err.format("No Printer found", e1.getMessage());
				}
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPrint.setBounds(34, 45, 125, 52);
		panel_2_3_1.add(btnPrint);
	}
}
