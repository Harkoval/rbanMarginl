import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixJoueur frame = new ChoixJoueur();
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
	public ChoixJoueur() {
		 // Charger l'image de fond
	    ImageIcon fondChoix = new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg"));
	    
	    // Récupérer les dimensions de l'image et proportionner l'image et la fenêtre
	    int largeur = fondChoix.getIconWidth();
	    int hauteur = fondChoix.getIconHeight();
		this.getContentPane().setPreferredSize(new Dimension(largeur, hauteur));
		this.pack();
		this.setResizable(false);
		
		
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFondChoix = new JLabel("");
		lblFondChoix.setIcon(new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg")));
		lblFondChoix.setBounds(0, 0, 400, 275);
		contentPane.add(lblFondChoix);
		
		textField = new JTextField();
		textField.setBounds(145, 245, 116, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFlecheG = new JLabel("");
		lblFlecheG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clic sur précédent");
			}
		});
		lblFlecheG.setBounds(55, 142, 46, 45);
		contentPane.add(lblFlecheG);
		
		JLabel lblFlecheD = new JLabel("");
		lblFlecheD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clic sur suivant");
			}
		});
		lblFlecheD.setBounds(290, 142, 46, 45);
		contentPane.add(lblFlecheD);
		
		JLabel lblGO = new JLabel("");
		lblGO.addMouseListener(new MouseAdapter() {
			private Arene frmArene;
			@Override
			public void mouseClicked(MouseEvent e) {
				this.frmArene = new Arene() ;
				this.frmArene.setVisible(true);
				ChoixJoueur.this.dispose();
			}
		});
		lblGO.setBounds(312, 198, 62, 66);
		contentPane.add(lblGO);
	}
}
