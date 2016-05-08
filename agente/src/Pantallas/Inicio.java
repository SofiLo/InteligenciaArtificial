package Pantallas;

import java.awt.*;
import javax.swing.*;

public class Inicio extends JFrame {
	private JTextField txtInicio;
	private JTextField txtDestino;
	private JTextArea txtrAquiVaA;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		txtInicio = new JTextField();
		txtInicio.setText("inicio");
		panel.add(txtInicio);
		txtInicio.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setText("destino");
		panel.add(txtDestino);
		txtDestino.setColumns(10);
		
		txtrAquiVaA = new JTextArea();
		txtrAquiVaA.setEditable(false);
		txtrAquiVaA.setText("alaralala\r\n");
		getContentPane().add(txtrAquiVaA, BorderLayout.WEST);
		
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon("C:\\\\Users\\\\homero.jpg"));
		getContentPane().add(lbl, BorderLayout.CENTER);
		
		 // Create a JPanel
        JPanel p1 = new JPanel();
        
        // Set the background, black with 125 as alpha value
        // This is less transparent
        p1.setBackground(new Color(0,0,0,125));
        
        
        // Set some size to the panels
        p1.setPreferredSize(new Dimension(250,150));
        
        
        // Add the panels to the JFrame
        getContentPane().add(p1);
		
	}
}
