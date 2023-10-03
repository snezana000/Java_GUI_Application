package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class glavna extends JFrame {

	private JPanel contentPane;

	
	
	private PanelProizvodi panelProizvodi;
	private PanelGalerija panelGalerija;
	private PanelOnama panelOnama;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					glavna frame = new glavna();
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
	public glavna() {
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 418);
		setUndecorated (true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelProizvodi = new PanelProizvodi();
		panelGalerija = new PanelGalerija ();
		panelOnama = new PanelOnama ();
		
		
		JPanel paneMenu = new JPanel();
		paneMenu.setBackground(new Color(47, 79, 79));
		paneMenu.setBounds(0, 0, 249, 418);
		contentPane.add(paneMenu);
		paneMenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\pons3.jpg"));
		lblIconLogo.setBounds(10, 11, 229, 126);
		paneMenu.add(lblIconLogo);
		
		JPanel paneProizvodi = new JPanel();
		paneProizvodi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProizvodi);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneProizvodi.setBackground(new Color(122, 128, 144));
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				paneProizvodi.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				paneProizvodi.setBackground(new Color(112, 128, 144));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneProizvodi.setBackground(new Color(47, 79, 79));
			}
		});
		paneProizvodi.setBackground(new Color(47, 79, 79));
		paneProizvodi.setBounds(0, 150, 249, 40);
		paneMenu.add(paneProizvodi);
		paneProizvodi.setLayout(null);
		
		JLabel lblProizvodi = new JLabel("PROIZVODI");
		lblProizvodi.setForeground(new Color(255, 255, 255));
		lblProizvodi.setFont(new Font("Dialog", Font.BOLD, 14));
		lblProizvodi.setBounds(73, 11, 176, 25);
		paneProizvodi.add(lblProizvodi);
		
		JLabel lblIconProizvodi = new JLabel("");
		lblIconProizvodi.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\ikonaproizvoda.jpg"));
		lblIconProizvodi.setBounds(20, 0, 40, 40);
		paneProizvodi.add(lblIconProizvodi);
		
		JPanel paneGalerija = new JPanel();
		paneGalerija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelGalerija);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneGalerija.setBackground(new Color(122, 128, 144));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneGalerija.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				paneGalerija.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				paneGalerija.setBackground(new Color(112, 128, 144));
			}
		});
		paneGalerija.setBackground(new Color(47, 79, 79));
		paneGalerija.setBounds(0, 190, 249, 40);
		paneMenu.add(paneGalerija);
		paneGalerija.setLayout(null);
		
		JLabel lblGalerija = new JLabel("GALERIJA");
		lblGalerija.setForeground(Color.WHITE);
		lblGalerija.setFont(new Font("Dialog", Font.BOLD, 14));
		lblGalerija.setBounds(73, 11, 176, 25);
		paneGalerija.add(lblGalerija);
		
		JLabel lblIconGalerija = new JLabel("");
		lblIconGalerija.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconGalerija.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\slika.jpg"));
		lblIconGalerija.setBounds(20, 0, 40, 40);
		paneGalerija.add(lblIconGalerija);
		
		JPanel paneOnama = new JPanel();
		paneOnama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelOnama);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneOnama.setBackground(new Color(122, 128, 144));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneOnama.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				paneOnama.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				paneOnama.setBackground(new Color(112, 128, 144));
			}
		});
		paneOnama.setBackground(new Color(47, 79, 79));
		paneOnama.setBounds(0, 230, 249, 40);
		paneMenu.add(paneOnama);
		paneOnama.setLayout(null);
		
		JLabel lblONama = new JLabel("O NAMA");
		lblONama.setForeground(Color.WHITE);
		lblONama.setFont(new Font("Dialog", Font.BOLD, 14));
		lblONama.setBounds(73, 11, 176, 25);
		paneOnama.add(lblONama);
		
		JLabel lblIconOnama = new JLabel("");
		lblIconOnama.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOnama.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\abus.jpg"));
		lblIconOnama.setBounds(20, 0, 40, 40);
		paneOnama.add(lblIconOnama);
		
		JPanel paneOdjava = new JPanel();
		paneOdjava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(JOptionPane.showConfirmDialog(null,  "Da li ste sigurni da želite da se odjavite?") == 0) {
					login login = new login ();
					login.setVisible(true);
					glavna.this.dispose();
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneOdjava.setBackground(new Color(122, 128, 144));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneOdjava.setBackground(new Color(47, 79, 79));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				paneOdjava.setBackground(new Color(60, 179, 113));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				paneOdjava.setBackground(new Color(112, 128, 144));
			}
		});
		paneOdjava.setBackground(new Color(47, 79, 79));
		paneOdjava.setBounds(0, 270, 249, 40);
		paneMenu.add(paneOdjava);
		paneOdjava.setLayout(null);
		
		JLabel lblOdjava = new JLabel("ODJAVA");
		lblOdjava.setForeground(Color.WHITE);
		lblOdjava.setFont(new Font("Dialog", Font.BOLD, 14));
		lblOdjava.setBounds(73, 11, 176, 25);
		paneOdjava.add(lblOdjava);
		
		JLabel lblIconOdjava = new JLabel("");
		lblIconOdjava.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconOdjava.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\log_in.png"));
		lblIconOdjava.setBounds(20, 0, 40, 40);
		paneOdjava.add(lblIconOdjava);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Da li ste siurni da želite da zatvorite aplikaciju?", "Potvrda", JOptionPane.YES_NO_OPTION)== 0) {
					glavna.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.WHITE);
			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(796, 0, 20, 20);
		contentPane.add(lblX);
		
		JPanel paneGlavniSadrzaj = new JPanel();
		paneGlavniSadrzaj.setBounds(259, 11, 538, 396);
		contentPane.add(paneGlavniSadrzaj);
		paneGlavniSadrzaj.setLayout(null);
		
		paneGlavniSadrzaj.add(panelProizvodi);
		paneGlavniSadrzaj.add(panelGalerija);
		paneGlavniSadrzaj.add(panelOnama);
		
		menuClicked(panelProizvodi);
	
		
	}
	
	public void menuClicked(JPanel panel) {
		panelProizvodi.setVisible(false);
		panelGalerija.setVisible(false);
		panelOnama.setVisible(false);
		
		panel.setVisible(true);
	}

	

}
