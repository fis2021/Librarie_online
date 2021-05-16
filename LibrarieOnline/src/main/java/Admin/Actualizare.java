package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actualizare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Actualizare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Actualizare");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel.setBounds(377, 183, 304, 60);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Editare carte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Editare_carte edit=new Editare_carte();
				edit.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(35, 391, 157, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stergere carte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Stergere_carte frame = new Stergere_carte();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(35, 438, 157, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Adaugare carte noua");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Adaugare_carte frame = new Adaugare_carte();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(35, 485, 157, 36);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Back meniu Admin");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_Admin frame = new Meniu_Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(35, 532, 157, 36);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Actualizare.class.getResource("/actualizare.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1362, 1033);
		contentPane.add(lblNewLabel_1);
	}
}
