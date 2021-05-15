package Client;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrintBorrowBooks {
	GridBagConstraints gbc=new GridBagConstraints();
	JPanel panel_box;
	public void writebook(BookModel e) {
		 panel_box=new JPanel();
		 panel_box.setBounds(0, 0, 200, 300);
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
	     jlabel2.setIcon(new ImageIcon(Books.class.getResource(e.getPoza())));
	     gbc.gridx=0;
	     gbc.gridy=1;
	     panel_box.add(jlabel2,gbc);
	     
	}
	public JPanel get_panel() {
	return panel_box;}

}
