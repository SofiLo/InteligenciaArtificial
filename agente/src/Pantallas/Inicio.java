package Pantallas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class Inicio extends JFrame {
	private JLabel lblInicio;
	private JLabel lblDestino;
	private JComboBox cbInicio;
	private JComboBox cbDestino;
	private JButton btnAgregarObstaculos;
	private JPanel panelCorrida;
	private JTextField pasosCorrida;
	private JButton btnEjecutar;
	private JLabel imagenMapa;
	private JPanel panel_1;
	DefObstaculos defObs;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
					frame.setSize(800, 520);
					frame.setResizable(false);
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
		getContentPane().setBackground(new Color(95, 158, 160));
		setBackground(new Color(102, 205, 170));
		setTitle("Inicializando Entorno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 400);
		
		//Edito el combobox
		String aulas[] = {"M�stil", "Cantina", "Alumnado", "Ingreso a torre", "Escalera Torre", "Puerta Principal", "Fotocopiadora", "Aula 2", "Aula 3", "Aula 4", "Aula 5", "Aula 1", "Aula de Estudio", "Departamento Mec�nica", "Puerta a Patio Interno", "Departamento El�ctrica", "Ascensor", "Escalera Principal", "Ba�os Planta Baja", "Escalera B�sicas", "Aula 9", "Aula 12", "Aula 18", "Aula 19", "Ba�os Primer Piso", "Escalera Chica", "Civil GIMNI", "Departamento Civil", "Ba�os segundo piso", "Escalea El�ctrica", "Puerta Estadio", "Estadio", "Departamento Industrial", "Aula 20", "Aula 21", "Aula 22", "Escalera ISI", "Laboratorio 1", "CIDISI", "Laboratorio 2", "Departamento ISI", "TICS", "Laboratorio 3", "Laboratorio de Conectividad", "Laboratorio 4", "Laboratorio 5"};
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblInicio = new JLabel("Ingrese inicio");
		panel.add(lblInicio);
		cbInicio = new JComboBox(aulas);
		cbInicio.setBackground(new Color(255, 255, 255));
		panel.add(cbInicio);
		//cbInicio.addActionListener(actionListener);
		
		lblDestino = new JLabel("Ingrese destino");
		panel.add(lblDestino);
		
		cbDestino = new JComboBox(aulas);
		panel.add(cbDestino);
		
		btnAgregarObstaculos = new JButton("Agregar Obstaculos");
		btnAgregarObstaculos.setActionCommand("Agregar Obstaculos");
		btnAgregarObstaculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				defObs = new DefObstaculos(Inicio.this);
				defObs.setVisible(true);
				Inicio.this.setEnabled(false);
				//frame.setEnabled(false);
			}
		});
		panel.add(btnAgregarObstaculos);
		
		panelCorrida = new JPanel();
		panelCorrida.setBackground(new Color(230, 230, 250));
		panelCorrida.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		getContentPane().add(panelCorrida, BorderLayout.WEST);
		panelCorrida.setLayout(new BoxLayout(panelCorrida, BoxLayout.Y_AXIS));
		
		btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.setMaximumSize(new Dimension(150, 23));
		btnEjecutar.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnEjecutar.setPreferredSize(new Dimension(150, 23));
		btnEjecutar.setHorizontalTextPosition(SwingConstants.LEADING);
		panelCorrida.add(btnEjecutar);
		
		pasosCorrida = new JTextField();
		pasosCorrida.setBackground(new Color(248, 248, 255));
		pasosCorrida.setText("");
		panelCorrida.add(pasosCorrida);
		pasosCorrida.setColumns(10);
		
		imagenMapa = new JLabel("mapa");
		imagenMapa.setBackground(new Color(230, 230, 250));
		imagenMapa.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		imagenMapa.setHorizontalTextPosition(SwingConstants.CENTER);
		imagenMapa.setHorizontalAlignment(SwingConstants.CENTER);
		imagenMapa.setIcon(new ImageIcon(Inicio.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
		getContentPane().add(imagenMapa, BorderLayout.CENTER);
		
		
//		//TRANSPARENT PANEL
//		panel_1 = new JPanel();
//		panel_1.setBackground(new Color(0,0,0,125));
//		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		
		//cbDestino.addActionListener(actionListener);
		
		//ACTION LISTENERS
		 ActionListener actionListener = new ActionListener() 
		 {
			 public void actionPerformed(ActionEvent actionEvent) {
		        System.out.println("Selected: " + cbInicio.getSelectedItem());
		        System.out.println(", Position: " + cbInicio.getSelectedIndex());

		        System.out.println("Selected: " + cbDestino.getSelectedItem());
		        System.out.println(", Position: " + cbDestino.getSelectedIndex());
		      }
		 };
		
	}

	public String getInicio() {
		String inicio = (String) cbInicio.getSelectedItem();
		
		return inicio;
	}

	public String getDestino() {
		String destino = (String) cbDestino.getSelectedItem();
		
		return destino;
	}
}
