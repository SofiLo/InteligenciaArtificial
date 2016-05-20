package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import frsf.cidisi.exercise.diagrama.search.Ambiente;
import frsf.cidisi.exercise.diagrama.search.EstadoAgente;
import frsf.cidisi.exercise.diagrama.search.EstadoAmbiente;
import frsf.cidisi.exercise.diagrama.search.SearchExtendido;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;
import frsf.cidisi.faia.simulator.Simulator;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Inicio extends JFrame {
	private JLabel lblInicio;
	private JLabel lblDestino;
	private JComboBox cbInicio;
	private JComboBox cbDestino;
	private JButton btnAgregarObstaculos;
	private JPanel panelCorrida;
	private JLabel imagenMapa;
	DefObstaculos defObs;
	private JButton btnAceptar;
	String inicio, destino;
	private EstadoAgente agente;
	private Simulator simulator;
	private Ambiente enviroment;
	private JPanel panel_1;
	private JLabel metodoBusqueda;
	private JPanel panel_2;
	private JRadioButton rdbtnAnchura;
	private JRadioButton rdbtnCostoUniforme;
	private JRadioButton rdbtnVueloDePjaro;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	public Inicio(EstadoAgente estadoAgente, SearchBasedAgentSimulator simulator, Ambiente environment) {

		// Tengo una referencia al agente
		agente = estadoAgente;
		this.simulator = simulator;
		this.enviroment = environment;

		getContentPane().setBackground(new Color(95, 158, 160));
		setBackground(new Color(102, 205, 170));
		setTitle("Inicializando Entorno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 400);

		// Edito el combobox
		String aulas[] = { "Mastil", "Cantina", "Alumnado", "Ingreso a torre",
				"Escalera Torre", "Puerta Principal", "Fotocopiadora",
				"Aula 2", "Aula 3", "Aula 4", "Aula 5", "Aula 1",
				"Aula de Estudio", "Departamento Mec�nica",
				"Puerta a Patio Interno", "Departamento El�ctrica", "Ascensor",
				"Escalera Principal", "Ba�os Planta Baja", "Escalera B�sicas",
				"Aula 9", "Aula 12", "Aula 18", "Aula 19", "Ba�os Primer Piso",
				"Escalera Chica", "Civil GIMNI", "Departamento Civil",
				"Ba�os segundo piso", "Escalea El�ctrica", "Puerta Estadio",
				"Estadio", "Departamento Industrial", "Aula 20", "Aula 21",
				"Aula 22", "Escalera ISI", "Laboratorio 1", "CIDISI",
				"Laboratorio 2", "Departamento ISI", "TICS", "Laboratorio 3",
				"Laboratorio de Conectividad", "Laboratorio 4", "Laboratorio 5", "" };
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.NORTH);
		
				lblInicio = new JLabel("Ingrese inicio");
				panel_2.add(lblInicio);
				cbInicio = new JComboBox(aulas);
				panel_2.add(cbInicio);
				cbInicio.setBackground(new Color(255, 255, 255));
				
						lblDestino = new JLabel("Ingrese destino");
						panel_2.add(lblDestino);
						
								cbDestino = new JComboBox(aulas);
								panel_2.add(cbDestino);
								cbDestino.addActionListener(new ActionListener() {

									public void actionPerformed(ActionEvent e) {
										if (cbDestino.getSelectedItem().equals(cbInicio.getSelectedItem())) {
											cbDestino.setSelectedItem("");
											JOptionPane.showMessageDialog(Inicio.this, "El destino debe ser distinto del origen");
										}
									}
								});
								
								cbDestino.setSelectedItem("");
								
								panel_1 = new JPanel();
								panel.add(panel_1, BorderLayout.SOUTH);
								panel_1.setLayout(new BorderLayout(0, 0));
								
								panel_3 = new JPanel();
								FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
								flowLayout.setAlignment(FlowLayout.LEFT);
								panel_1.add(panel_3, BorderLayout.WEST);
								
								metodoBusqueda = new JLabel("M�todo de b�squeda");
								panel_3.add(metodoBusqueda);
								metodoBusqueda.setHorizontalAlignment(SwingConstants.LEFT);
								
								panel_4 = new JPanel();
								FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
								panel_1.add(panel_4, BorderLayout.CENTER);
								
								rdbtnAnchura = new JRadioButton("Anchura");
								panel_4.add(rdbtnAnchura);
								
								rdbtnCostoUniforme = new JRadioButton("Costo Uniforme");
								panel_4.add(rdbtnCostoUniforme);
								
								rdbtnVueloDePjaro = new JRadioButton("Vuelo de p\u00E1jaro");
								panel_4.add(rdbtnVueloDePjaro);
								
								panel_5 = new JPanel();
								panel_1.add(panel_5, BorderLayout.EAST);
								
										btnAgregarObstaculos = new JButton("Agregar Obstaculos");
										panel_5.add(btnAgregarObstaculos);
										btnAgregarObstaculos.setHorizontalAlignment(SwingConstants.LEFT);
										btnAgregarObstaculos.setActionCommand("Agregar Obstaculos");
										
												btnAceptar = new JButton("Ejecutar");
												panel_5.add(btnAceptar);
												btnAceptar.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {

														if (!cbDestino.getSelectedItem().equals("") && !cbInicio.getSelectedItem().equals("")) {
															inicio = (String) cbInicio.getSelectedItem();
															destino = (String) cbDestino.getSelectedItem();

															((EstadoAgente) agente).setNodoDestinoNombre(destino);
															((EstadoAmbiente) ((Ambiente) enviroment)
																	.getEnvironmentState())
																	.setPosicionAgenteNombre(inicio);

															Inicio.this.simulator.start();
														} else
															JOptionPane.showMessageDialog(Inicio.this, "No puede haber opciones vacias");
													}
												});
												btnAceptar.setHorizontalAlignment(SwingConstants.RIGHT);
										btnAgregarObstaculos.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												defObs.setVisible(true);
												Inicio.this.setEnabled(false);
											}
										});
				
				cbInicio.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						if (cbInicio.getSelectedItem().equals(cbDestino.getSelectedItem())){
							cbInicio.setSelectedItem("");
							JOptionPane.showMessageDialog(Inicio.this,"El inicio debe ser distinto del origen");
						}
					}
				});
		
				imagenMapa = new JLabel("mapa");
				imagenMapa.setBackground(new Color(230, 230, 250));
				imagenMapa
						.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				imagenMapa.setHorizontalTextPosition(SwingConstants.CENTER);
				imagenMapa.setHorizontalAlignment(SwingConstants.CENTER);
				imagenMapa.setIcon(new ImageIcon(Inicio.class
						.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
				getContentPane().add(imagenMapa, BorderLayout.CENTER);

		panelCorrida = new JPanel();
		panelCorrida.setBackground(new Color(230, 230, 250));
		panelCorrida.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		getContentPane().add(panelCorrida, BorderLayout.SOUTH);
		FlowLayout fl_panelCorrida = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panelCorrida.setLayout(fl_panelCorrida);
		
		textArea = new JTextArea();
		textArea.setSize(new Dimension(200, 50));
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setSize(new Dimension(200, 50));
		scrollPane.setEnabled(false);
		panelCorrida.add(scrollPane);
		
		
		//panelCorrida.add(textArea);
		
		//scrollPane.setViewportView(textArea);
		
		defObs = new DefObstaculos(Inicio.this);

		setSize(800, 520);
		setResizable(false);
		setVisible(true);
	}

	public void setObstaculos(ArrayList<String> listaObstaculos) {

		enviroment.getEnvironmentState().clearObstaculos();

		Iterator<String> iter = listaObstaculos.iterator();
		while (iter.hasNext()) {
			enviroment.getEnvironmentState().setearObstaculos(iter.next());
		}
	}

	public void mostrarRecorrido(String string) {
		
		textArea.setText(string);	
	}

}
