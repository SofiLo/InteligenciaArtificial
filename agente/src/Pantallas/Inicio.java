package Pantallas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Inicio extends JFrame {
	private JLabel lbl;
	private JLabel lblInicio;
	private JLabel lblDestino;
	private ScrollPane scrollPane;
	private JComboBox combobxInicio;
	private JComboBox combobxDestino;

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
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panel, BorderLayout.NORTH);
		
		lblInicio = new JLabel("Ingrese inicio");
		panel.add(lblInicio);
		
		//Edito el combobox
		String aulas[] = {"M�stil", "Cantina", "Alumnado", "Ingreso a torre", "Escalera Torre", "Puerta Principal", "Fotocopiadora", "Aula 2", "Aula 3", "Aula 4", "Aula 5", "Aula 1", "Aula de Estudio", "Departamento Mec�nica", "Puerta a Patio Interno", "Departamento El�ctrica", "Ascensor", "Escalera Principal", "Ba�os Planta Baja", "Escalera B�sicas", "Aula 9", "Aula 12", "Aula 18", "Aula 19", "Ba�os Primer Piso", "Escalera Chica", "Civil GIMNI", "Departamento Civil", "Ba�os segundo piso", "Escalea El�ctrica", "Puerta Estadio", "Estadio", "Departamento Industrial", "Aula 20", "Aula 21", "Aula 22", "Escalera ISI", "Laboratorio 1", "CIDISI", "Laboratorio 2", "Departamento ISI", "TICS", "Laboratorio 3", "Laboratorio de Conectividad", "Laboratorio 4", "Laboratorio 5"};
		combobxInicio = new JComboBox(aulas);
		panel.add(combobxInicio);
				
		lblDestino = new JLabel("Ingrese destino");
		panel.add(lblDestino);
		
		combobxDestino = new JComboBox(aulas);
		panel.add(combobxDestino);
		
		//ACTION LISTENERS
		 ActionListener actionListener = new ActionListener() 
		 {
			 public void actionPerformed(ActionEvent actionEvent) {
		        System.out.println("Selected: " + combobxInicio.getSelectedItem());
		        System.out.println(", Position: " + combobxInicio.getSelectedIndex());

		        System.out.println("Selected: " + combobxDestino.getSelectedItem());
		        System.out.println(", Position: " + combobxDestino.getSelectedIndex());
		      }
		 };
		combobxInicio.addActionListener(actionListener);
		combobxDestino.addActionListener(actionListener);
		
		
		lbl = new JLabel();
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setIcon(new ImageIcon("C:\\Users\\homero.jpg"));
		getContentPane().add(lbl, BorderLayout.CENTER);
		
		scrollPane = new ScrollPane();
		getContentPane().add(scrollPane, BorderLayout.WEST);
		
	}

	public String getInicio() {
		String inicio = (String) combobxInicio.getSelectedItem();
		
		return inicio;
	}

	public String getDestino() {
		String destino = (String) combobxDestino.getSelectedItem();
		
		return destino;
	}
	
}
