package pantallas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class DefObstaculos extends JFrame {

	private JPanel contentPane;
	private JPanel panelObs = new JPanel();
	private String[] aulas = { "Mastil", "Cantina", "Alumnado",
			"Ingreso a torre", "Escalera Torre", "Puerta Principal",
			"Fotocopiadora", "Aula 2", "Aula 3", "Aula 4", "Aula 5", "Aula 1",
			"Aula de Estudio", "Departamento Mecánica",
			"Puerta a Patio Interno", "Departamento Eléctrica", "Ascensor",
			"Escalera Principal", "Baños Planta Baja", "Escalera Básicas",
			"Aula 9", "Aula 12", "Aula 18", "Aula 19", "Baños Primer Piso",
			"Escalera Chica", "Civil GIMNI", "Departamento Civil",
			"Baños segundo piso", "Escalea Eléctrica", "Puerta Estadio",
			"Estadio", "Departamento Industrial", "Aula 20", "Aula 21",
			"Aula 22", "Escalera ISI", "Laboratorio 1", "CIDISI",
			"Laboratorio 2", "Departamento ISI", "TICS", "Laboratorio 3",
			"Laboratorio de Conectividad", "Laboratorio 4", "Laboratorio 5" };
	private JComboBox cbObstaculo = new JComboBox(aulas);
	private JTable table = new JTable();
	private final JButton eliminarObs = new JButton("-");
	private final JPanel panelBotones = new JPanel();
	private final JButton agregarCambios = new JButton("Agregar Cambios");
	private final JButton cancelar = new JButton("Cancelar");
	private final JButton limpiarTabla = new JButton("Limpiar tabla");
	private final ArrayList<String> listaObstaculos = new ArrayList<String>();
	private Inicio frame;


	public DefObstaculos(Inicio inicio) {
		setSize(500, 330);
		setResizable(false);
		frame = inicio;	
		
		setTitle("Definir Obstaculos del ambiente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		panelObs.setBackground(new Color(230, 230, 250));
		panelObs.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelObs.setMaximumSize(new Dimension(32767, 400));

		contentPane.add(panelObs);
		panelObs.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		cbObstaculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		panelObs.add(cbObstaculo);

		JButton agregarObs = new JButton("+");
		agregarObs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String obs = (String) cbObstaculo.getSelectedItem();
				Object aula[] = { obs };
				DefaultTableModel temp = (DefaultTableModel) table.getModel();
				cbObstaculo.removeItem(obs);
				temp.addRow(aula);
			}

		});

		panelObs.add(agregarObs);
		eliminarObs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DefaultTableModel temp = (DefaultTableModel) table
							.getModel();
					String dato = String.valueOf(temp.getValueAt(table
							.getSelectedRow(), 0));
					cbObstaculo.addItem(dato);
					temp.removeRow(table.getSelectedRow());
				} catch (ArrayIndexOutOfBoundsException e1) {
					;
				}
			}
		});

		panelObs.add(eliminarObs);

		JPanel panelTabla = new JPanel();
		panelTabla.setBackground(new Color(230, 230, 250));
		panelTabla
				.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelTabla.setPreferredSize(new Dimension(400, 170));
		contentPane.add(panelTabla);
		table.setName("");
		table.setPreferredScrollableViewportSize(new Dimension(350, 150));

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Obst\u00E1culos" }));
		panelTabla.add(table);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBackground(new Color(248, 248, 255));
		scrollPane.setPreferredSize(new Dimension(352, 150));
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelTabla.add(scrollPane);
		panelBotones.setBackground(new Color(230, 230, 250));
		panelBotones.setMaximumSize(new Dimension(32767, 500));
		panelBotones.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		contentPane.add(panelBotones);
		limpiarTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int i = JOptionPane.showConfirmDialog(DefObstaculos.this,
						"¿Realmente desea limpiar la tabla?", "Aceptar",
						JOptionPane.YES_NO_OPTION);
				if (i == 0) {
					DefaultTableModel temp = (DefaultTableModel) table
							.getModel();

					for (int j = 0; j < temp.getRowCount(); j++) {
						cbObstaculo.addItem((String) temp.getValueAt(j, 0));
						temp.removeRow(j);
						j -= 1;
					}
				}
			}
		});

		panelBotones.add(limpiarTabla);
		agregarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaObstaculos.clear();
				
				DefaultTableModel temp = (DefaultTableModel) table.getModel();
				int i = 0;
				while (i < temp.getRowCount()) {
					listaObstaculos.add((String) temp.getValueAt(i, 0));
					i++;
				}
				DefObstaculos.this.setVisible(false);
				frame.setObstaculos(listaObstaculos);
				frame.setEnabled(true);
			}
		});

		panelBotones.add(agregarCambios);
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefObstaculos.this.setVisible(false);
				frame.setEnabled(true);
			}
		});

		panelBotones.add(cancelar);
		
		setVisible(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
	}
}
