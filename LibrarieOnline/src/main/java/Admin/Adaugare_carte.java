package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Adaugare_carte extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
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
	public Adaugare_carte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adaugare carte noua");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(613, 45, 286, 54);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(681, 150, 226, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(681, 199, 226, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(681, 248, 226, 38);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(681, 297, 226, 38);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(681, 346, 226, 38);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(681, 395, 226, 38);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("Descriere:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(570, 150, 139, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(607, 199, 139, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Titlu carte:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(570, 248, 139, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("An aparitie:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(570, 297, 139, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Genul:");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(607, 346, 139, 38);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Nume poza:");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(570, 395, 139, 38);
		contentPane.add(lblNewLabel_1_5);
		
		 btnNewButton = new JButton("Adaugare carte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList <String> adaug=new ArrayList<String>();
				adaug.add(textField_1.getText());
				btn=true;
				adaug.add(textField_2.getText());
				adaug.add(textField_3.getText());
				adaug.add(textField_4.getText());
				adaug.add(textField_5.getText());
				adaug.add(textField_6.getText());
				CitireJsonCarti fisier=new CitireJsonCarti();
				fisier.get_nr_titluri();
				int nr=fisier.get_nr();
				int aux=0;
			while(aux!=nr)
			{
				aux++;
				fisier.get_titlu(aux);
				adaug.add(fisier.get_d());
				adaug.add(fisier.get_aut());
				adaug.add(fisier.get_t());
				adaug.add(fisier.get_a());
				adaug.add(fisier.get_g());
				adaug.add(fisier.get_p());
			}
			
			CreareJsonCarti_pentru_Carte_noua carte_noua=new CreareJsonCarti_pentru_Carte_noua();
			carte_noua.creare(adaug,"src/main/resources/Books.json");
			}
		});
		btnNewButton.setBounds(504, 462, 125, 38);
		contentPane.add(btnNewButton);
		
		 btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Actualizare actual=new Actualizare();
				btn1=true;
				actual.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(906, 462, 125, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Adaugare_carte.class.getResource("/carte_noua.jpg")));
		lblNewLabel_2.setBounds(0, 0, 1362, 1033);
		contentPane.add(lblNewLabel_2);
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
