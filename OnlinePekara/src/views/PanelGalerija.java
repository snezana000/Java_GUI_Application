package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class PanelGalerija extends JPanel {


	 
	public PanelGalerija() {
		setBackground(new Color(47, 79, 79));
		setBounds(0, 0, 538, 396);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\ban2.jpg"));
		lblNewLabel.setBounds(21, 68, 149, 149);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\ban1.jpg"));
		lblNewLabel_1.setBounds(180, 134, 186, 156);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\ban3.jpg"));
		lblNewLabel_2.setBounds(376, 59, 141, 166);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Svaki trenutak može biti poseban...");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(10, 27, 286, 30);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("...uz nas i naša peciva!");
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		lblNewLabel_3_1.setBounds(296, 327, 221, 30);
		add(lblNewLabel_3_1);

	}

}
