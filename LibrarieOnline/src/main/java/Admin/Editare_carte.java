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

public class Editare_carte extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;	
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
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
	public Editare_carte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1380,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Editare carte");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(548, 247, 504, 51);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(262, 396, 226, 38);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(262, 445, 226, 38);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(200, 393, 139, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Titlu carte:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(162, 442, 139, 38);
		contentPane.add(lblNewLabel_1_2);
		
		 btnNewButton = new JButton("Editare carte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Carte editata cu succes");
				btn=true;
				ArrayList <String> adaug=new ArrayList<String>();
				String aut1,t1;//pentru cartea existenta
				String d2,aut2,t2,a2,g2,p2;// cu ce vreau sa inlocuiesc
				aut1=textField_2.getText();
				t1=textField_3.getText();
				d2=textField_7.getText();
				aut2=textField_8.getText();
				t2=textField_9.getText();
				a2=textField_10.getText();
				g2=textField_11.getText();
				p2=textField_12.getText();
				CitireJsonCarti fisier=new CitireJsonCarti();
				fisier.get_nr_titluri();
				int nr=fisier.get_nr();
				int aux=0;
			while(aux!=nr)
			{
				aux++;
				fisier.get_titlu(aux);
				if(fisier.get_t().equals(t1) && fisier.get_aut().equals(aut1))
					{
					
					if(d2.isEmpty()!=true)
						adaug.add(d2);
					else
						adaug.add(fisier.get_d());
					
					
					if(aut2.isEmpty()!=true)
						adaug.add(aut2);
					else
						adaug.add(fisier.get_aut());
					
					
					if(t2.isEmpty()!=true)
						adaug.add(t2);
					else
						adaug.add(fisier.get_t());
					
					
					if(a2.isEmpty()!=true)
						adaug.add(a2);
					else
						adaug.add(fisier.get_a());
					
					
					if(g2.isEmpty()!=true)
						adaug.add(g2);
					else
						adaug.add(fisier.get_g());
					
					
					if(p2.isEmpty()!=true)
						adaug.add(p2);
					else
						adaug.add(fisier.get_p());
					}
				else
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
		btnNewButton.setBounds(477, 619, 125, 38);
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
		btnBack.setBounds(721, 619, 125, 38);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("Dupa editare ->");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		lblNewLabel_2.setBounds(565, 418, 189, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_6 = new JLabel("Descriere:");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(842, 329, 139, 38);
		contentPane.add(lblNewLabel_1_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(954, 329, 226, 38);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Autor:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(877, 378, 139, 38);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(954, 378, 226, 38);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(954, 425, 226, 38);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(954, 472, 226, 38);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(954, 521, 226, 38);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(954, 570, 226, 38);
		contentPane.add(textField_12);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Titlu carte:");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(842, 427, 139, 38);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("An aparitie:");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(842, 474, 139, 38);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Genul:");
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(888, 526, 139, 38);
		contentPane.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Nume poza:");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(842, 570, 139, 38);
		contentPane.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Editare_carte.class.getResource("/editare.jpg")));
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
