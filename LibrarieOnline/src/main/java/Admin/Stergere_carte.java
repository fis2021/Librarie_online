package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Stergere_carte extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;	
	private JTextField textField_3;
	private JButton btnNewButton = new JButton();
	private JButton btnBack = new JButton();
	private boolean btn=false;
	private boolean btn1=false;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Stergere_carte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stergere carte");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(525, 205, 504, 51);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(529, 336, 226, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(529, 385, 226, 38);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(448, 333, 139, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Titlu carte:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(411, 385, 139, 38);
		contentPane.add(lblNewLabel_1_2);
		
		btnNewButton = new JButton("Stergere carte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cartea a fost stearsa cu succes!");
				ArrayList <String> adaug=new ArrayList<String>();
				String aut1,t1;//pentru cartea existenta
				aut1=textField_2.getText();
				btn=true;
				t1=textField_3.getText();
				CitireJsonCarti fisier=new CitireJsonCarti();
				fisier.get_nr_titluri();
				int nr=fisier.get_nr();
				int aux=0;
				while(aux!=nr)
				{	
					aux++;
					fisier.get_titlu(aux);
					if(fisier.get_t().equals(t1)!=true && fisier.get_aut().equals(aut1)!=true)
					{
						adaug.add(fisier.get_d());
					adaug.add(fisier.get_aut());
					adaug.add(fisier.get_t());
					adaug.add(fisier.get_a());
					adaug.add(fisier.get_g());
					adaug.add(fisier.get_p());
					}
				}
				CreareJsonCarti_pentru_Carte_noua carte_noua=new CreareJsonCarti_pentru_Carte_noua();
				carte_noua.creare(adaug,"src/main/resources/Books.json");
				
			
			}
			});
		btnNewButton.setBounds(376, 477, 125, 38);
		contentPane.add(btnNewButton);
		
		 btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Actualizare actual=new Actualizare();
				actual.setVisible(true);
				btn1=true;
				dispose();
			}
		});
		btnBack.setBounds(760, 477, 125, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Editare_carte.class.getResource("/stergere.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1362, 1033);
		contentPane.add(lblNewLabel_1);
	}
	public JButton get_but()
	{
		return  btnNewButton;
	}
	public boolean get_bol_but()
	{
		return btn;
	}
	public JButton get_but1()
	{
		return   btnBack;
	}
	public boolean get_bol_but1()
	{
		return btn1;
	}
}
