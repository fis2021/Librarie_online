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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import BorrowExceptions.NoBooksAdded;

public class Books extends JFrame {
	private List <BookModel>books=new ArrayList<BookModel>();
	private BooksServices b=new BooksServices();
	GridBagConstraints gbc=new GridBagConstraints();
	GridBagConstraints gbcnew=new GridBagConstraints();
	private JPanel contentPane;
	private String username;
	public Books(final String username) {
		this.username=username;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1650, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panelmenu=new JPanel();
		panelmenu.setPreferredSize(new Dimension(1650,100));
		JButton buttonp=new JButton("Pagina Principala");
		 buttonp.setPreferredSize(new Dimension(250,50));
		 buttonp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ClientPageInterface cp=new ClientPageInterface(username);
					cp.setVisible(true);
					setVisible(false);
				}
			});
		 JButton buttonf=new JButton("Cos cumparaturi");
		 buttonf.setPreferredSize(new Dimension(250,50));
		 buttonf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
					BorrowListInterface fb=new BorrowListInterface(username);
					fb.setVisible(true);
					}
					catch(NoBooksAdded e1) {
						Books cp=new Books(username);
						cp.setVisible(true);
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					
					setVisible(false);
				}
			});
		books=b.getbooks();
		JPanel panel=new JPanel();
		int aux=(700*books.size())/12+200;
		panel.setPreferredSize(new Dimension(1300, aux));
		gbc.gridx=0;
		gbc.gridy=0;
		panelmenu.add(buttonp,gbc);
		gbcnew.gridx=0;
		gbcnew.gridy=1;
		panelmenu.add(buttonf,gbcnew);
		panel.add(panelmenu);
		for (final BookModel e:books) {
			 JPanel panel_box=new JPanel();
			 panel_box.setBounds(550, 5, 200, 300);
			 panel_box.setPreferredSize(new Dimension(200, 300));
			 panel_box.setLayout(new GridBagLayout());
			
			 JLabel jlabel1=new JLabel(e.getTitlu());
			 jlabel1.setPreferredSize(new Dimension(170,60));
			 jlabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
			 gbc.gridx=0;
			 gbc.gridy=0;
			 panel_box.add(jlabel1,gbc);
			 
		     JLabel jlabel2=new JLabel("poza");
		     jlabel2.setPreferredSize(new Dimension(200,200));
		     //System.out.println(e.getPoza());
		     jlabel2.setIcon(new ImageIcon(Books.class.getResource(e.getPoza())));
		     gbc.gridx=0;
		     gbc.gridy=1;
		     panel_box.add(jlabel2,gbc);
		     
			 JButton button=new JButton("Vezi detalii");
			 button.setPreferredSize(new Dimension(100,20));
			 button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						VeziDetalii detalii=new VeziDetalii(e,username);
						detalii.setVisible(true);
						setVisible(false);
					}
				});
			 gbc.gridx=0;
			 gbc.gridy=2;
			 panel_box.add(button, gbc);
			 panel.add(panel_box);
			 
		}
		
		 JScrollPane scrollPane ;
		 scrollPane = new JScrollPane(panel);
		 scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		 scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		 scrollPane.setBounds(200,200, 1365,700);
		 contentPane.add(scrollPane);
	}

}
