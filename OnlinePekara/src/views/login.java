package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class login extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setUndecorated(true);
		setTitle("Pekara \"Pons\"");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(168, 173, 262, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setText("Korisničko ime");
		txtUsername.setBounds(10, 11, 170, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblIconUsername = new JLabel("");
		lblIconUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconUsername.setBounds(222, 0, 40, 40);
		lblIconUsername.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\userr.png"));
		panel.add(lblIconUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(168, 224, 262, 40);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('●');
					txtPassword.setText("");
					
				}
				else {
					txtPassword.selectAll();
				}

			}
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);
		txtPassword.setFont(new Font ("Arial", Font.PLAIN, 12));
		txtPassword.setText("Lozinka");
		txtPassword.setBounds(10, 11, 172, 20);
		panel_1.add(txtPassword);
		
		JLabel lblIconPassword = new JLabel("");
		lblIconPassword.setBounds(222, 0, 40, 40);
		lblIconPassword.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\key.png"));
		panel_1.add(lblIconPassword);
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(47, 79, 79));
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(60, 80, 80));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(30, 60, 60));
				
			}
		});
		pnlBtnLogin.setBackground(new Color(47, 79, 79));
		pnlBtnLogin.setBounds(168, 304, 262, 52);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblLogIn = new JLabel("ULOGUJ SE");
		lblLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtUsername.getText().equals("sneza") && txtPassword.getText().equals("sneza123")) {
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "Uspešno ste se ulogovali!");
					glavna glavna = new glavna();
					glavna.show();
					
				}
				else if(txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || 
				txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
			lblLoginMessage.setText("Morate popuniti sva polja!");
		}
				else {
					lblLoginMessage.setText("Korisničko ime ili lozinka nisu ispravni!");
				}
			}
		});
		lblLogIn.setForeground(Color.WHITE);
		lblLogIn.setFont(new Font("Arial", Font.BOLD, 14));
		lblLogIn.setBounds(106, 11, 130, 30);
		pnlBtnLogin.add(lblLogIn);
		
		JLabel lblIconLogin = new JLabel("");
		lblIconLogin.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\log_in.png"));
		lblIconLogin.setBounds(66, 0, 50, 52);
		pnlBtnLogin.add(lblIconLogin);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showInternalConfirmDialog(null, "Da li ste siurni da želite da zatvorite aplikaciju?", "Potvrda", JOptionPane.YES_NO_OPTION)== 0) {
					login.this.dispose();
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
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(580, 0, 20, 20);
		contentPane.add(lblX);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(168, 33, 262, 129);
		contentPane.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon("C:\\Users\\ThinkPad X390\\Desktop\\slike\\pons3.jpg"));
		
		lblLoginMessage.setForeground(new Color(128, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginMessage.setBounds(168, 273, 262, 25);
		contentPane.add(lblLoginMessage);
		setLocationRelativeTo(null);
	}
}
