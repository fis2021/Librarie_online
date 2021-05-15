package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Lista_cereri_interfata extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Lista_cereri_interfata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista cereri");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(722, 196, 537, 66);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(390, 294, 836, 235);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Titlu carte", "Accepta", "Respinge"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Boolean.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(104);
		table.getColumnModel().getColumn(1).setPreferredWidth(121);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(table);
		CitireJsonImprumut imprumut=new CitireJsonImprumut();
		imprumut.get_numar_imprumuturi();
		final int nr=imprumut.get_nr();
		
		JButton btnNewButton = new JButton("Trimitere feedback");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int aux=0;
				ArrayList imprumut=new ArrayList();
				while(aux!=nr)
				{		
					if(aux==0)
					JOptionPane.showMessageDialog(null, "Feedback trimis cu succes");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					String username,titlu;
					boolean respinge,accepta;
					username=(String) model.getValueAt(aux, 0);
					titlu=(String) model.getValueAt(aux,1);
					accepta=(boolean) model.getValueAt(aux,2);
					respinge=(boolean) model.getValueAt(aux,3);
					
					imprumut.add(username);
					imprumut.add(titlu);
					imprumut.add(accepta);
					imprumut.add(respinge);
					aux++;
				}
				CreareJsonImprumut fisier=new CreareJsonImprumut();
				fisier.creare(imprumut);
			}
		});
		btnNewButton.setBounds(390, 540, 166, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_Admin frame = new Meniu_Admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1060, 540, 166, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Lista_cereri_interfata.class.getResource("/imprumutate.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1362, 749);
		contentPane.add(lblNewLabel_1);
	
		int aux=0;
		while(aux!=nr)
		{
			aux++;
			imprumut.get_imprumut(aux,"src/main/resources/lista_imprumut.json");
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.addRow(new Object [] {imprumut.get_username(),imprumut.get_titlu(),false,false});
			table.setRowHeight(30);
		}
			
	}
}
