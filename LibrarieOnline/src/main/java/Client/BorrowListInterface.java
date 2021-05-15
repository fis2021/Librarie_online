package Client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONArray;

import BorrowExceptions.NoBooksAdded;
import ExceptionsLogin.WrongUsername;
public class BorrowListInterface extends JFrame {

	private JPanel contentPane;
	private List<BookModel> list=new ArrayList<BookModel>();
	GridBagConstraints gbc=new GridBagConstraints();
	private String username;
	GridBagConstraints gbc1=new GridBagConstraints();
	 PrintBorrowBooks pb=new  PrintBorrowBooks();
	public BorrowListInterface(final String username) throws NoBooksAdded {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1365, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		list=WriteBooks.get_list();
		if(list.isEmpty()) throw new NoBooksAdded();
		System.out.println("miauu"+list);
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		gbc1.gridx=0;
		int y=0;
		for(final BookModel e:list)
		{
			 pb.writebook(e);
			 JButton button=new JButton("Sterge");
			 button.setPreferredSize(new Dimension(100,20));
			 button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					WriteBooks.remove(e);
					BorrowListInterface intr;
					try {
						
						intr = new BorrowListInterface(username);
						intr.setVisible(true);
					} catch (NoBooksAdded e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
						Books cp=new Books(username);
						cp.setVisible(true);

					}
					setVisible(false);
					}
					
				});
			 gbc.gridx=0;
			 gbc.gridy=2;
			 pb.get_panel().add(button, gbc);
			 y++;
			 panel.add(pb.get_panel());
		}
		
		JButton button1=new JButton("Confirma comanda");
		button1.setPreferredSize(new Dimension(100,30));
		panel.add(button1);
		 button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					CreateBorrowList clp=new CreateBorrowList ();
					clp.create(username,list,"src/main/resources/lista_imprumut.json");
					
				}
			});
		 JButton button2=new JButton("Back");
			button2.setPreferredSize(new Dimension(50,20));
			panel.add(button2);
			button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Books books=new Books(username);
						books.setVisible(true);
						setVisible(false);
						
					}
				});
		 JScrollPane scrollPane ;
		 scrollPane = new JScrollPane(panel);
		 scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		 scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		 scrollPane.setBounds(0,0, 1365,700);
		 contentPane.add(scrollPane);
	}

}
