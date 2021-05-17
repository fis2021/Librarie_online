package Client;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Admin.Meniu_Admin;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Feedback extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private PrintFeedbackInfo pf=new PrintFeedbackInfo();
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	public Feedback(final String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1650, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100,100, 300,400);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titlu", "Feedback"
			}
		));
		pf.print(table);
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("Lista comenzi");
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.BOLD, 30));
		lblNewLabel_1.setBounds(599, 34, 258, 29);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientPageInterface cpi=new ClientPageInterface(username);
				cpi.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(10, 677, 89, 23);
		contentPane.add(btnNewButton);
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Meniu_Admin.class.getResource("/old_book.jpg")));
		lblNewLabel.setBounds(0, 0, 1650,750);
		contentPane.add(lblNewLabel);
		
		
	}
}