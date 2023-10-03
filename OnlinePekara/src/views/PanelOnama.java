package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.ImageIcon;

public class PanelOnama extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelOnama() {
		setBackground(new Color(47, 79, 79));
		setBounds(0, 0, 538, 396);
		setLayout(null);
		
		JTextPane txtpnOduvekZaOvih = new JTextPane();
		txtpnOduvekZaOvih.setBackground(new Color(0, 128, 128));
		txtpnOduvekZaOvih.setFont(new Font("Tw Cen MT", Font.ITALIC, 22));
		txtpnOduvekZaOvih.setText("Oduvek, za ovih pedeset godina postojanja naše pekare posvećene su kreiranju po najboljim receptima — bez obzira da li je vaš izbor slatko ili slano pecivo, hlebovi, kolači ili salate i sendviči.     Posvećenost uživanju savršenom zalogaju je u srcu svakog našeg ostvarenja.");
		txtpnOduvekZaOvih.setBounds(29, 21, 209, 353);
		add(txtpnOduvekZaOvih);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\Screenshot 2023-02-13 204214.jpg"));
		lblNewLabel.setBounds(248, 21, 267, 353);
		add(lblNewLabel);

	}
}
