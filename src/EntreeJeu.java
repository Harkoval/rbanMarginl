import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;
import vue.Arene;
import vue.ChoixJoueur;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntreeJeu frame = new EntreeJeu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		this.setResizable(false);
		
		setTitle("Urban Marginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStart = new JLabel("Start a server:");
		lblStart.setBounds(10, 11, 73, 14);
		contentPane.add(lblStart);
		
		JLabel lblConnect = new JLabel("Connect an existing server:");
		lblConnect.setBounds(10, 36, 142, 14);
		contentPane.add(lblConnect);
		
		JLabel lblIP = new JLabel("IP server:");
		lblIP.setBounds(10, 61, 58, 14);
		contentPane.add(lblIP);
		
		textField = new JTextField();
		textField.setBounds(66, 58, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("127.0.0.1");
		
		JButton btnStartServer = new JButton("Start");
		btnStartServer.addActionListener(new ActionListener() {
			private Arene frmArene;
			public void actionPerformed(ActionEvent e) {
				this.frmArene = new Arene() ;
				this.frmArene.setVisible(true);
				EntreeJeu.this.dispose();
			}
		});
		btnStartServer.setBounds(161, 7, 89, 23);
		contentPane.add(btnStartServer);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			private ChoixJoueur frmChoixJoueur;
			public void actionPerformed(ActionEvent e) {
				this.frmChoixJoueur = new ChoixJoueur() ;
				this.frmChoixJoueur.setVisible(true);
				EntreeJeu.this.dispose();
			}
		});
		btnConnect.setBounds(162, 57, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(161, 91, 89, 23);
		contentPane.add(btnExit);
		
		
			}
}
