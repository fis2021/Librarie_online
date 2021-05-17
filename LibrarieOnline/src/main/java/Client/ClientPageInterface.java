         package Client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import BorrowExceptions.NoBooksAdded;

public class ClientPageInterface extends JFrame {

	private JPanel contentPane;
	ClientPageMenu client=new ClientPageMenu();
	private String username;
	private JButton btnNewButton_2;
	private boolean button1=false;
	private JButton btnNewButton;
	private boolean button2=false;
	private JButton btnNewButton_1;
	private boolean button3=false;
	
	public ClientPageInterface(final String username) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.username=username;
		
		btnNewButton = new JButton("          Carti");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				client.books(username);
				setVisible(false);
				button2=true;
			}
		}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(ClientPageInterface.class.getResource("/carti.png")));
		btnNewButton.setBounds(78, 200, 212, 58);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("  Cos cumparaturi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					button3=true;
					client.BorrowList(username);
				}
				catch(NoBooksAdded e1) {
					ClientPageInterface cp=new ClientPageInterface(username);
					cp.setVisible(true);
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(ClientPageInterface.class.getResource("/lista_imprumut.png")));
		btnNewButton_1.setBounds(78, 369, 212, 58);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Comenzi plasate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				button1=true;
				client.feedback(username);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon(ClientPageInterface.class.getResource("/feedback.png")));
		btnNewButton_2.setBounds(78, 538, 212, 58);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Pagina Cient");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(725, 200, 337, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(ClientPageInterface.class.getResource("/back_carti.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1650, 1080);
		contentPane.add(lblNewLabel_1);
	}
	public JButton get_button1() {
		return btnNewButton_2;
	}
	public boolean get_bool_button1() {
		return button1;
	}
	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}
	public boolean isButton3() {
		return button3;
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public boolean isButton2() {
		return button2;
	}
}
	
	
