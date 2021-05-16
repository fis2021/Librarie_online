package Login;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ExceptionsLogin.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
public class LoginInterface extends JFrame {
	protected static LoginInterface frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	private boolean but1=false;
	private JButton btnNewButton;
	private boolean but2=false;
	public LoginInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 btnNewButton = new JButton("Login");
		btnNewButton.setBounds(41, 196, 100, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=textField.getText();
				but2=true;
				String password=passwordField.getText();
				LoginController logincontrol=new LoginController(name,password);
				if(logincontrol.get_flag()==1) {
					setVisible(false);
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Librarie online");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(123, 0, 168, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(172, 61, 85, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(95, 108, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(95, 137, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField(10);
		textField.setBounds(186, 105, 143, 20);
		contentPane.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 134, 143, 20);
		contentPane.add(passwordField);
		
	    btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				but1=true;
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(288, 196, 100, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		System.out.println(LoginInterface.class.getResource("/logback.jpg"));
		lblNewLabel_4.setIcon(new ImageIcon(LoginInterface.class.getResource("/logback.jpg")));
		lblNewLabel_4.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_4);
		
	}
	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}
	public boolean isBut1() {
		return but1;
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public boolean isBut2() {
		return but2;
	}
	
}
