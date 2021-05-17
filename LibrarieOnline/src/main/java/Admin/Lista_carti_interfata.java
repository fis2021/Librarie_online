package Admin;
 
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.modelmbean.ModelMBean;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Lista_carti_interfata extends JFrame {
	private JButton btnNewButton = new JButton();
	private boolean btn=false;
	private JButton btnNewButton_1 = new JButton();
	private boolean btn1=false;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public Lista_carti_interfata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1650,750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JLabel lblListaCarti = new JLabel("Lista Carti");
		lblListaCarti.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblListaCarti.setBounds(830, 88, 552, 82);
		contentPane.add(lblListaCarti);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(662, 183, 480, 324);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Comic Sans MS", table.getFont().getStyle(), table.getFont().getSize() + 6));
		table.setForeground(SystemColor.activeCaptionText);
		table.setBackground(SystemColor.inactiveCaption);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titlu", "Detalii carte"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(83);
		table.getColumnModel().getColumn(0).setMinWidth(21);
		table.getColumnModel().getColumn(1).setPreferredWidth(86);
		scrollPane.setViewportView(table);
		CitireJsonCarti car = new CitireJsonCarti();
		car.get_nr_titluri();
		final int nr=car.get_nr();
		int aux=0;
		while(aux!=nr)
		{
			aux++;
			car.get_titlu(aux);
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			table.setRowHeight(30);
			model.addRow(new Object [] {car.get_t(),false});
		}
		
		car.get_titlu(1);
		car.get_titlu(2);
		
		btnNewButton = new JButton("Back meniu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meniu_Admin frame = new Meniu_Admin();
				btn=true;
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(1004, 518, 138, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Vezi detalii carte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int aux1=0,count=0,poz = 0;
				btn1=true;
				while(aux1!=nr)
				{
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					if((Boolean)model.getValueAt(aux1, 1)==true)
						{
						count++;
						poz=aux1;
						}
					aux1++;
				}	
				if(count>1)
					JOptionPane.showMessageDialog(null, "Selectati numai o optiune!!!");
				else
					if(count==1)
				{	
					Vizualizare_detalii_carte detalii=new Vizualizare_detalii_carte(poz);
					detalii.setVisible(true);
					dispose();
				}
					else
						JOptionPane.showMessageDialog(null, "Nu ati selectat nimic!!!");	
			}
		});
		btnNewButton_1.setBounds(662, 518, 138, 27);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Lista_carti_interfata.class.getResource("/back_lista_carti.jpg")));
		lblNewLabel.setBounds(-2, -223, 1362, 1033);
		contentPane.add(lblNewLabel);
	}
	public JButton get_but()
	{
		return btnNewButton;
	}
	public boolean get_bol_but()
	{
		return btn;
	}
	public JButton get_but1()
	{
		return btnNewButton_1;
	}
	public boolean get_bol_but1()
	{
		return btn1;
	}
	}

