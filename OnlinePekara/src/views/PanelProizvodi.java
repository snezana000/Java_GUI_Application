package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class PanelProizvodi extends JPanel {
	private JTextField txtTaksa;
	private JTextField txtOsnovica;
	private JTextField txtUkupno;

	/**
	 * Create the panel.
	 */
	public PanelProizvodi() {
		setBorder(new LineBorder(new Color(0, 0, 128)));
		setBounds(0, 0, 538, 396);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(0, 0, 538, 36);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pekara Pons");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 0, 170, 36);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_1.setBounds(10, 47, 349, 310);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2.setBounds(10, 11, 103, 137);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\plet.jpg"));
		lblNewLabel_1.setBounds(0, 0, 103, 60);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Pletenica");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(2, 61, 103, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Količina:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(2, 101, 59, 14);
		panel_2.add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner.setBounds(54, 98, 49, 20);
		panel_2.add(spinner);
		
		JRadioButton pletenica = new JRadioButton("170,00");
		pletenica.setHorizontalAlignment(SwingConstants.CENTER);
		pletenica.setBounds(3, 114, 95, 20);
		panel_2.add(pletenica);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2_1.setBounds(123, 11, 103, 137);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\bagettt.jpg"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(0, 0, 103, 60);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Baget");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(2, 61, 103, 14);
		panel_2_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Količina:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(2, 101, 59, 14);
		panel_2_1.add(lblNewLabel_5_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner_1.setBounds(54, 98, 49, 20);
		panel_2_1.add(spinner_1);
		
		JRadioButton baget = new JRadioButton("220,00");
		baget.setHorizontalAlignment(SwingConstants.CENTER);
		baget.setBounds(3, 114, 95, 20);
		panel_2_1.add(baget);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2_2.setBounds(236, 11, 103, 137);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\puzz.jpg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(0, 0, 103, 60);
		panel_2_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puž sa kremom");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setBounds(2, 61, 103, 14);
		panel_2_2.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("Količina:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_2.setBounds(2, 101, 59, 14);
		panel_2_2.add(lblNewLabel_5_2);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner_2.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner_2.setBounds(54, 98, 49, 20);
		panel_2_2.add(spinner_2);
		
		JRadioButton puzkrem = new JRadioButton("130,00");
		puzkrem.setHorizontalAlignment(SwingConstants.CENTER);
		puzkrem.setBounds(3, 114, 95, 20);
		panel_2_2.add(puzkrem);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2_3.setBounds(10, 159, 103, 137);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\hrskavi.jpg"));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(0, 0, 103, 60);
		panel_2_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Hrskavi sendvič");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.setBounds(2, 61, 103, 14);
		panel_2_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("Količina:");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_3.setBounds(2, 101, 59, 14);
		panel_2_3.add(lblNewLabel_5_3);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner_3.setBounds(54, 98, 49, 20);
		panel_2_3.add(spinner_3);
		
		JRadioButton hrskavisendvic = new JRadioButton("260,00");
		hrskavisendvic.setHorizontalAlignment(SwingConstants.CENTER);
		hrskavisendvic.setBounds(3, 114, 95, 20);
		panel_2_3.add(hrskavisendvic);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2_4.setBounds(123, 159, 103, 137);
		panel_1.add(panel_2_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\tost.jpg"));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(0, 0, 103, 60);
		panel_2_4.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("Tost sendvič");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_4.setBounds(2, 61, 103, 14);
		panel_2_4.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_5_4 = new JLabel("Količina:");
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_4.setBounds(2, 101, 59, 14);
		panel_2_4.add(lblNewLabel_5_4);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner_4.setBounds(54, 98, 49, 20);
		panel_2_4.add(spinner_4);
		
		JRadioButton tostsendvic = new JRadioButton("240,00");
		tostsendvic.setHorizontalAlignment(SwingConstants.CENTER);
		tostsendvic.setBounds(3, 114, 95, 20);
		panel_2_4.add(tostsendvic);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_2_5.setBounds(236, 159, 103, 137);
		panel_1.add(panel_2_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\donuts.jpg"));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(0, 0, 103, 60);
		panel_2_5.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_3_5 = new JLabel("Krofna");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(2, 61, 103, 14);
		panel_2_5.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_5_5 = new JLabel("Količina:");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_5.setBounds(2, 101, 59, 14);
		panel_2_5.add(lblNewLabel_5_5);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerNumberModel(0, 0, 35, 1));
		spinner_5.setFont(new Font("Dialog", Font.PLAIN, 12));
		spinner_5.setBounds(54, 98, 49, 20);
		panel_2_5.add(spinner_5);
		
		JRadioButton krofna = new JRadioButton("150,00");
		krofna.setHorizontalAlignment(SwingConstants.CENTER);
		krofna.setBounds(3, 114, 95, 20);
		panel_2_5.add(krofna);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(349, 0, 177, 254);
		panel_1.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(211, 211, 211), 2));
		panel_3.setBounds(10, 362, 350, 30);
		add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnUkupno = new JButton("Ukupno");
		btnUkupno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUkupno.getText().equals("") || txtTaksa.getText().equals("") || txtOsnovica.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Odaberite način plaćanja i stistine Potvrda");
				}
				else
				{
					narucivanje up = new narucivanje();
					up.show();
					dispose();
				}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnUkupno.setForeground(new Color(255, 255, 255));
		btnUkupno.setBackground(new Color(47, 79, 79));
		btnUkupno.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUkupno.setBounds(10, 3, 92, 24);
		panel_3.add(btnUkupno);
		
		JButton btnPotvrda = new JButton("Potvrda");
		btnPotvrda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Ukupno;
				double Osnovica = 0;
				final double Porez = 0.2;
				double Taksa;
				
				if(pletenica.isSelected()) {
					Osnovica = Osnovica + 170;
				}
				if(baget.isSelected()) {
					Osnovica = Osnovica +220;
				}
				if(puzkrem.isSelected()) {
					Osnovica = Osnovica +130; 
				}
				if(hrskavisendvic.isSelected()) {
					Osnovica = Osnovica + 260;
				}
				if(tostsendvic.isSelected()) {
					Osnovica = Osnovica + 240;
				}
				if(krofna.isSelected()) {
					Osnovica = Osnovica + 150;
				}
				
				txtOsnovica.setText(Double.toString(Osnovica));
				
				Osnovica = Double.parseDouble(txtOsnovica.getText());
				Taksa = Osnovica * Porez;
				Ukupno = Taksa + Osnovica;
				
				txtTaksa.setText(Double.toString(Taksa));
				txtUkupno.setText(Double.toString(Ukupno));
				
			}
		});
		btnPotvrda.setForeground(new Color(255, 255, 255));
		btnPotvrda.setBackground(new Color(47, 79, 79));
		btnPotvrda.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPotvrda.setBounds(104, 3, 92, 24);
		panel_3.add(btnPotvrda);
		
		JButton btnExit = new JButton("Izlaz");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(47, 79, 79));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(266, 3, 69, 24);
		panel_3.add(btnExit);	
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pletenica.setSelected(false);
				baget.setSelected(false);
				puzkrem.setSelected(false);
				hrskavisendvic.setSelected(false);
				tostsendvic.setSelected(false);
				krofna.setSelected(false);
				
				txtUkupno.setText("");
				txtOsnovica.setText("");
				txtTaksa.setText("");
				
				
				}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(47, 79, 79));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(196, 3, 69, 24);
		panel_3.add(btnReset);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(47, 79, 79));
		panel_4.setBorder(null);
		panel_4.setBounds(362, 47, 171, 345);
		add(panel_4);
		panel_4.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(2, 2, 167, 182);
		panel_4.add(textArea_1);
		
		txtTaksa = new JTextField();
		txtTaksa.setHorizontalAlignment(SwingConstants.CENTER);
		txtTaksa.setText("0.0");
		txtTaksa.setEditable(false);
		txtTaksa.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTaksa.setBounds(65, 270, 96, 20);
		panel_4.add(txtTaksa);
		txtTaksa.setColumns(10);
		
		txtOsnovica = new JTextField();
		txtOsnovica.setHorizontalAlignment(SwingConstants.CENTER);
		txtOsnovica.setText("0.0");
		txtOsnovica.setEditable(false);
		txtOsnovica.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtOsnovica.setBounds(65, 295, 96, 20);
		panel_4.add(txtOsnovica);
		txtOsnovica.setColumns(10);
		
		txtUkupno = new JTextField();
		txtUkupno.setHorizontalAlignment(SwingConstants.CENTER);
		txtUkupno.setText("0.0");
		txtUkupno.setEditable(false);
		txtUkupno.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtUkupno.setBounds(65, 320, 96, 20);
		panel_4.add(txtUkupno);
		txtUkupno.setColumns(10);
		
		JLabel lblTaksa = new JLabel("Taksa:");
		lblTaksa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTaksa.setBounds(2, 274, 49, 14);
		panel_4.add(lblTaksa);
		
		JLabel lblOsnovica = new JLabel("Osnovica:");
		lblOsnovica.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOsnovica.setBounds(2, 299, 64, 14);
		panel_4.add(lblOsnovica);
		
		JLabel lblUkupno = new JLabel("Ukupno:");
		lblUkupno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUkupno.setBounds(2, 324, 64, 14);
		panel_4.add(lblUkupno);
		
		JLabel lblNacinPlacanja = new JLabel("Način plaćanja:");
		lblNacinPlacanja.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNacinPlacanja.setBounds(36, 195, 96, 29);
		panel_4.add(lblNacinPlacanja);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izaberi", "Kartica", "Gotovina", "PayPal", "BitCoin"}));
		comboBox.setBounds(46, 219, 75, 20);
		panel_4.add(comboBox);
		setVisible(true);
	}
}

	

