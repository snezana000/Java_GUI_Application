package views;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class narucivanje extends JFrame {

	private JPanel contentPane;
	private JTextField textIme;
	private JTextField textUlica;
	private JTextField textPrezime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					narucivanje frame = new narucivanje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public narucivanje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(57, 48, 703, 295);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unesite podatke za poručivanje");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 0, 229, 25);
		panel.add(lblNewLabel);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIme.setBounds(10, 78, 80, 20);
		panel.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPrezime.setBounds(10, 144, 80, 20);
		panel.add(lblPrezime);
		
		JLabel lblUlica = new JLabel("Ulica i broj:");
		lblUlica.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblUlica.setBounds(414, 78, 96, 20);
		panel.add(lblUlica);
		
		JLabel lblNewLabel_4 = new JLabel("Mesto:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(414, 144, 80, 20);
		panel.add(lblNewLabel_4);
		
		textIme = new JTextField();
		textIme.setBounds(102, 77, 137, 25);
		panel.add(textIme);
		textIme.setColumns(10);
		
		textUlica = new JTextField();
		textUlica.setColumns(10);
		textUlica.setBounds(525, 77, 137, 25);
		panel.add(textUlica);
		
		textPrezime = new JTextField();
		textPrezime.setColumns(10);
		textPrezime.setBounds(102, 145, 137, 25);
		panel.add(textPrezime);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Izaberi", "Becej", "Novi Sad", "Beograd", "Zrenjanin", "Kragujevac", "Subotica", "Nis", "Pancevo", "Smederevo"}));
		comboBox.setBounds(525, 145, 137, 25);
		panel.add(comboBox);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showInternalConfirmDialog(null, "Da li ste siurni da želite da zatvorite aplikaciju?", "Potvrda", JOptionPane.YES_NO_OPTION)== 0) {
					
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(796, 0, 20, 20);
		contentPane.add(lblX);
		
		JButton btnPosalji = new JButton("Pošalji");
		btnPosalji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textIme.getText().equals("") || textUlica.getText().equals("") || textPrezime.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(null, "Popunite sva polja!");
			    }
				else 
			    {
					potvrda sp = new potvrda();
					sp.show();
					dispose();
			    }
			}
		});
		btnPosalji.setForeground(new Color(255, 255, 255));
		btnPosalji.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPosalji.setBackground(new Color(0, 139, 139));
		btnPosalji.setBounds(558, 350, 89, 32);
		contentPane.add(btnPosalji);
		
		JButton btnZatvori = new JButton("Zatvori");
		btnZatvori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZatvori.setForeground(new Color(255, 255, 255));
		btnZatvori.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnZatvori.setBackground(new Color(255, 0, 0));
		btnZatvori.setBounds(657, 350, 89, 32);
		contentPane.add(btnZatvori);
		setUndecorated(true);
	}
}
