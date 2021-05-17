package Admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Vizualizare_detalii_carte extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Vizualizare_detalii_carte(int poz) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1380,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		CitireJsonCarti car = new CitireJsonCarti();
		car.get_titlu(poz+1);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(263, 472, 1027, 140);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titlu", car.get_t()
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		
		lblNewLabel = new JLabel(car.get_t());
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(521, 143, 693, 77);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Back vizualizare");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista_carti_interfata frame = new Lista_carti_interfata();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(1134, 648, 156, 25);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Vizualizare_detalii_carte.class.getResource(car.get_p())));
		lblNewLabel_3.setBounds(664, 238, 218, 206);
		contentPane.add(lblNewLabel_3);
		
	
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object [] {"Autor:",car.get_aut()});
				model.addRow(new Object [] {"Descriere",car.get_d()});
				model.addRow(new Object [] {"An aparitie:",car.get_a()});
				model.addRow(new Object [] {"Genul",car.get_g()});
				table.setRowHeight(30);
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(Vizualizare_detalii_carte.class.getResource("/vizualizare_c1.png")));
				lblNewLabel_2.setBounds(0, 0, 1362, 1033);
				contentPane.add(lblNewLabel_2);
	}
}
