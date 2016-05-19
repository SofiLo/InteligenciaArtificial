package frsf.cidisi.exercise.diagrama.grafo;

import java.util.ArrayList;

import frsf.cidisi.exercise.Constantes;

public class Grafo {

	ArrayList<Nodo> listaNodos = new ArrayList<Nodo>();

	public Grafo() {

		// Creamos los nodos
		Nodo nodoInicial = new Nodo();
		Nodo nodoCantina = new Nodo();
		Nodo nodoBiblioteca = new Nodo();
		Nodo nodoAlumnado = new Nodo();
		Nodo nodoIngresoTorre = new Nodo();
		Nodo nodoEscaleraTorre = new Nodo();
		Nodo nodoPuertaPpal = new Nodo();
		Nodo nodoFotocopiadora = new Nodo();
		Nodo nodoAula2 = new Nodo();
		Nodo nodoAula3 = new Nodo();
		Nodo nodoAula4 = new Nodo();
		Nodo nodoAula5 = new Nodo();
		Nodo nodoAula1 = new Nodo();
		Nodo nodoAulaEstudio = new Nodo();
		Nodo nodoDptoMecanica = new Nodo();
		Nodo nodoPuertaPatioInterno = new Nodo();
		Nodo nodoDptoElectrica = new Nodo();
		Nodo nodoAscensor = new Nodo();
		Nodo nodoEscaleraPpal = new Nodo();
		Nodo nodoBañosPlantaBaja = new Nodo();
		Nodo nodoEscaleraBasicas = new Nodo();
		Nodo nodoAula9 = new Nodo();
		Nodo nodoAula12 = new Nodo();
		Nodo nodoAula18 = new Nodo();
		Nodo nodoAula19 = new Nodo();
		Nodo nodoBañosPrimerPiso = new Nodo();
		Nodo nodoEscaleraChica = new Nodo();
		Nodo nodoOficinaCivilGIMNI = new Nodo();
		Nodo nodoDptoCivil = new Nodo();
		Nodo nodoBaños2 = new Nodo();
		Nodo nodoEscaleraElectrica = new Nodo();
		Nodo nodoPuertaEstadio = new Nodo();
		Nodo nodoEstadio = new Nodo();
		Nodo nodoDptoIndustrial = new Nodo();
		Nodo nodoAula20 = new Nodo();
		Nodo nodoAula21 = new Nodo();
		Nodo nodoAula22 = new Nodo();
		Nodo nodoEscaleraISI = new Nodo();
		Nodo nodoLab1 = new Nodo();
		Nodo nodoCIDISI = new Nodo();
		Nodo nodoLab2 = new Nodo();
		Nodo nodoDptoISI = new Nodo();
		Nodo nodoTICS = new Nodo();
		Nodo nodoLab3 = new Nodo();
		Nodo nodoLabConectividad = new Nodo();
		Nodo nodoLab4 = new Nodo();
		Nodo nodoLab5 = new Nodo();

		// Seteamos los nodos
		nodoInicial.setNombre("Mastil");
		nodoInicial.setIdNodo(0);
		nodoInicial.setNivel(0);
		nodoInicial.setObstaculo(false);

		nodoCantina.setNombre("Cantina");
		nodoCantina.setIdNodo(1);
		nodoCantina.setNivel(0);
		nodoCantina.setObstaculo(false);

		nodoBiblioteca.setNombre("Biblioteca");
		nodoBiblioteca.setIdNodo(46);
		nodoBiblioteca.setNivel(0);
		nodoBiblioteca.setObstaculo(false);

		nodoAlumnado.setNombre("Alumnado");
		nodoAlumnado.setIdNodo(2);
		nodoAlumnado.setNivel(0);
		nodoAlumnado.setObstaculo(false);

		nodoIngresoTorre.setNombre("Ingreso a Torre");
		nodoIngresoTorre.setIdNodo(3);
		nodoIngresoTorre.setNivel(0);
		nodoIngresoTorre.setObstaculo(false);

		nodoEscaleraTorre.setNombre("Escalera Torre");
		nodoEscaleraTorre.setIdNodo(4);
		nodoEscaleraTorre.setNivel(0);
		nodoEscaleraTorre.setObstaculo(false);

		nodoPuertaPpal.setNombre("Puerta Principal");
		nodoPuertaPpal.setIdNodo(5);
		nodoPuertaPpal.setNivel(0);
		nodoPuertaPpal.setObstaculo(false);

		nodoFotocopiadora.setNombre("Fotocopiadora");
		nodoFotocopiadora.setIdNodo(6);
		nodoFotocopiadora.setNivel(0);
		nodoFotocopiadora.setObstaculo(false);

		nodoAula2.setNombre("Aula 2");
		nodoAula2.setIdNodo(7);
		nodoAula2.setNivel(0);
		nodoAula2.setObstaculo(false);

		nodoAula3.setNombre("Aula 3");
		nodoAula3.setIdNodo(8);
		nodoAula3.setNivel(0);
		nodoAula3.setObstaculo(false);

		nodoAula4.setNombre("Aula 4");
		nodoAula4.setIdNodo(9);
		nodoAula4.setNivel(0);
		nodoAula4.setObstaculo(false);

		nodoAula5.setNombre("Aula 5");
		nodoAula5.setIdNodo(10);
		nodoAula5.setNivel(0);
		nodoAula5.setObstaculo(false);

		nodoAula1.setNombre("Aula 1");
		nodoAula1.setIdNodo(11);
		nodoAula1.setNivel(0);
		nodoAula1.setObstaculo(false);

		nodoAulaEstudio.setNombre("Aula de Estudio");
		nodoAulaEstudio.setIdNodo(12);
		nodoAulaEstudio.setNivel(0);
		nodoAulaEstudio.setObstaculo(false);

		nodoDptoMecanica.setNombre("Departamento Mecánica");
		nodoDptoMecanica.setIdNodo(13);
		nodoDptoMecanica.setNivel(0);
		nodoDptoMecanica.setObstaculo(false);

		nodoPuertaPatioInterno.setNombre("Puerta a Patio Interno");
		nodoPuertaPatioInterno.setIdNodo(14);
		nodoPuertaPatioInterno.setNivel(0);
		nodoPuertaPatioInterno.setObstaculo(false);

		nodoDptoElectrica.setNombre("Departamento Eléctrica");
		nodoDptoElectrica.setIdNodo(15);
		nodoDptoElectrica.setNivel(0);
		nodoDptoElectrica.setObstaculo(false);

		nodoAscensor.setNombre("Ascensor");
		nodoAscensor.setIdNodo(16);
		nodoAscensor.setNivel(0);
		nodoAscensor.setObstaculo(false);

		nodoEscaleraPpal.setNombre("Escalera Principal");
		nodoEscaleraPpal.setIdNodo(17);
		nodoEscaleraPpal.setNivel(0);
		nodoEscaleraPpal.setObstaculo(false);

		nodoBañosPlantaBaja.setNombre("Baños Planta Baja");
		nodoBañosPlantaBaja.setIdNodo(18);
		nodoBañosPlantaBaja.setNivel(0);
		nodoBañosPlantaBaja.setObstaculo(false);

		nodoEscaleraBasicas.setNombre("Escalera Básicas");
		nodoEscaleraBasicas.setIdNodo(19);
		nodoEscaleraBasicas.setNivel(0);
		nodoEscaleraBasicas.setObstaculo(false);

		nodoAula9.setNombre("Aula 9");
		nodoAula9.setIdNodo(20);
		nodoAula9.setNivel(1);
		nodoAula9.setObstaculo(false);

		nodoAula12.setNombre("Aula 12");
		nodoAula12.setIdNodo(21);
		nodoAula12.setNivel(1);
		nodoAula12.setObstaculo(false);

		nodoAula18.setNombre("Aula 18");
		nodoAula18.setIdNodo(22);
		nodoAula18.setNivel(1);
		nodoAula18.setObstaculo(false);

		nodoAula19.setNombre("Aula 19");
		nodoAula19.setIdNodo(23);
		nodoAula19.setNivel(1);
		nodoAula19.setObstaculo(false);

		nodoBañosPrimerPiso.setNombre("Baños Primer Piso");
		nodoBañosPrimerPiso.setIdNodo(24);
		nodoBañosPrimerPiso.setNivel(1);
		nodoBañosPrimerPiso.setObstaculo(false);

		nodoEscaleraChica.setNombre("Escalera Chica");
		nodoEscaleraChica.setIdNodo(25);
		nodoEscaleraChica.setNivel(0);
		nodoEscaleraChica.setObstaculo(false);

		nodoOficinaCivilGIMNI.setNombre("Civil GIMNI");
		nodoOficinaCivilGIMNI.setIdNodo(26);
		nodoOficinaCivilGIMNI.setNivel(1);
		nodoOficinaCivilGIMNI.setObstaculo(false);

		nodoDptoCivil.setNombre("Departamento Civil");
		nodoDptoCivil.setIdNodo(27);
		nodoDptoCivil.setNivel(1);
		nodoDptoCivil.setObstaculo(false);

		nodoBaños2.setNombre("Baños segundo piso");
		nodoBaños2.setIdNodo(28);
		nodoBaños2.setNivel(1);
		nodoBaños2.setObstaculo(false);

		nodoEscaleraElectrica.setNombre("Escalera Eléctrica");
		nodoEscaleraElectrica.setIdNodo(29);
		nodoEscaleraElectrica.setNivel(0);
		nodoEscaleraElectrica.setObstaculo(false);

		nodoPuertaEstadio.setNombre("Puerta Estadio");
		nodoPuertaEstadio.setIdNodo(30);
		nodoPuertaEstadio.setNivel(1);
		nodoPuertaEstadio.setObstaculo(false);

		nodoEstadio.setNombre("Estadio");
		nodoEstadio.setIdNodo(31);
		nodoEstadio.setNivel(1);
		nodoEstadio.setObstaculo(false);

		nodoDptoIndustrial.setNombre("Departamento Industrial");
		nodoDptoIndustrial.setIdNodo(32);
		nodoDptoIndustrial.setNivel(1);
		nodoDptoIndustrial.setObstaculo(false);

		nodoAula20.setNombre("Aula 20");
		nodoAula20.setIdNodo(33);
		nodoAula20.setNivel(1);
		nodoAula20.setObstaculo(false);

		nodoAula21.setNombre("Aula 21");
		nodoAula21.setIdNodo(34);
		nodoAula21.setNivel(1);
		nodoAula21.setObstaculo(false);

		nodoAula22.setNombre("Aula 22");
		nodoAula22.setIdNodo(35);
		nodoAula22.setNivel(1);
		nodoAula22.setObstaculo(false);

		nodoEscaleraISI.setNombre("Escalera ISI");
		nodoEscaleraISI.setIdNodo(36);
		nodoEscaleraISI.setNivel(1);
		nodoEscaleraISI.setObstaculo(false);

		nodoLab1.setNombre("Laboratorio 1");
		nodoLab1.setIdNodo(37);
		nodoLab1.setNivel(2);
		nodoLab1.setObstaculo(false);

		nodoCIDISI.setNombre("CIDISI");
		nodoCIDISI.setIdNodo(38);
		nodoCIDISI.setNivel(2);
		nodoCIDISI.setObstaculo(false);

		nodoLab2.setNombre("Laboratorio 2");
		nodoLab2.setIdNodo(39);
		nodoLab2.setNivel(2);
		nodoLab2.setObstaculo(false);

		nodoDptoISI.setNombre("Departamento ISI");
		nodoDptoISI.setIdNodo(40);
		nodoDptoISI.setNivel(2);
		nodoDptoISI.setObstaculo(false);

		nodoTICS.setNombre("TICS");
		nodoTICS.setIdNodo(41);
		nodoTICS.setNivel(2);
		nodoTICS.setObstaculo(false);

		nodoLab3.setNombre("Laboratorio 3");
		nodoLab3.setIdNodo(42);
		nodoLab3.setNivel(2);
		nodoLab3.setObstaculo(false);

		nodoLabConectividad.setNombre("Laboratorio de Conectividad");
		nodoLabConectividad.setIdNodo(43);
		nodoLabConectividad.setNivel(2);
		nodoLabConectividad.setObstaculo(false);

		nodoLab4.setNombre("Laboratorio 4");
		nodoLab4.setIdNodo(44);
		nodoLab4.setNivel(2);
		nodoLab4.setObstaculo(false);

		nodoLab5.setNombre("Laboratorio 5");
		nodoLab5.setIdNodo(45);
		nodoLab5.setNivel(2);
		nodoLab5.setObstaculo(false);

		nodoInicial.agregarDestinos(Constantes.OESTE, nodoCantina);
		nodoInicial.agregarDestinos(Constantes.NORTE, nodoPuertaPpal);

		listaNodos.add(nodoInicial);

		nodoCantina.agregarDestinos(Constantes.ESTE, nodoInicial);
		nodoCantina.agregarDestinos(Constantes.OESTE, nodoBiblioteca);

		listaNodos.add(nodoCantina);

		nodoBiblioteca.agregarDestinos(Constantes.ESTE, nodoCantina);
		nodoBiblioteca.agregarDestinos(Constantes.OESTE, nodoAlumnado);

		listaNodos.add(nodoBiblioteca);

		nodoAlumnado.agregarDestinos(Constantes.ESTE, nodoBiblioteca);
		nodoAlumnado.agregarDestinos(Constantes.OESTE, nodoIngresoTorre);

		listaNodos.add(nodoAlumnado);

		nodoIngresoTorre.agregarDestinos(Constantes.ESTE, nodoAlumnado);
		nodoIngresoTorre.agregarDestinos(Constantes.SUR, nodoEscaleraTorre);

		listaNodos.add(nodoIngresoTorre);

		nodoEscaleraTorre.agregarDestinos(Constantes.NORTE, nodoIngresoTorre);
		nodoEscaleraTorre.agregarDestinos(Constantes.ESTE, nodoPuertaEstadio);

		listaNodos.add(nodoEscaleraTorre);

		nodoPuertaPpal.agregarDestinos(Constantes.SUR, nodoInicial);
		nodoPuertaPpal.agregarDestinos(Constantes.NORTE, nodoFotocopiadora);
		nodoPuertaPpal.agregarDestinos(Constantes.ESTE, nodoAula1);
		nodoPuertaPpal.agregarDestinos(Constantes.OESTE, nodoAulaEstudio);

		listaNodos.add(nodoPuertaPpal);

		nodoFotocopiadora.agregarDestinos(Constantes.SUR, nodoPuertaPpal);
		nodoFotocopiadora.agregarDestinos(Constantes.NORTE, nodoAula2);

		listaNodos.add(nodoFotocopiadora);

		nodoAula2.agregarDestinos(Constantes.SUR, nodoFotocopiadora);
		nodoAula2.agregarDestinos(Constantes.NORTE, nodoAula3);

		listaNodos.add(nodoAula2);

		nodoAula3.agregarDestinos(Constantes.SUR, nodoAula2);
		nodoAula3.agregarDestinos(Constantes.NORTE, nodoAula4);

		listaNodos.add(nodoAula3);

		nodoAula4.agregarDestinos(Constantes.SUR, nodoAula3);
		nodoAula4.agregarDestinos(Constantes.NORTE, nodoAula5);

		listaNodos.add(nodoAula4);

		nodoAula5.agregarDestinos(Constantes.SUR, nodoAula4);

		listaNodos.add(nodoAula5);

		nodoAula1.agregarDestinos(Constantes.OESTE, nodoPuertaPpal);
		nodoAula1.agregarDestinos(Constantes.SUR, nodoEscaleraBasicas);

		listaNodos.add(nodoAula1);

		nodoAulaEstudio.agregarDestinos(Constantes.ESTE, nodoPuertaPpal);
		nodoAulaEstudio.agregarDestinos(Constantes.OESTE, nodoDptoMecanica);
		nodoAulaEstudio.agregarDestinos(Constantes.NORTE, nodoEscaleraPpal);

		listaNodos.add(nodoAulaEstudio);

		nodoDptoMecanica.agregarDestinos(Constantes.ESTE, nodoAulaEstudio);
		nodoDptoMecanica.agregarDestinos(Constantes.OESTE, nodoPuertaPatioInterno);
		nodoDptoMecanica.agregarDestinos(Constantes.OESTE, nodoPuertaPatioInterno);

		listaNodos.add(nodoDptoMecanica);

		nodoPuertaPatioInterno.agregarDestinos(Constantes.ESTE, nodoDptoMecanica);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.NORTE, nodoDptoElectrica);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.OESTE, nodoAscensor);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.SUBIROESTE, nodoEscaleraChica);

		listaNodos.add(nodoPuertaPatioInterno);

		nodoDptoElectrica.agregarDestinos(Constantes.SUR, nodoPuertaPatioInterno);

		listaNodos.add(nodoDptoElectrica);

		nodoAscensor.agregarDestinos(Constantes.ESTE, nodoPuertaPatioInterno);
		nodoAscensor.agregarDestinos(Constantes.SUBIRESTE, nodoDptoCivil);// QUE
																			// PASA
																			// SI
																			// ESTOY
																			// EN
																			// EL
																			// 3RO
																			// Y
																			// QUIERO
																			// BAJAR
																			// A
																			// CIVIL
		nodoAscensor.agregarDestinos(Constantes.SUBIRNORTE, nodoDptoIndustrial);// LO
																				// MISMO
		nodoAscensor.agregarDestinos(Constantes.SUBIRESTE, nodoTICS);// ya tengo
																		// dos
																		// SUBIRESTE
																		// QUE
																		// HAGO

		listaNodos.add(nodoAscensor);

		nodoEscaleraPpal.agregarDestinos(Constantes.SUR, nodoAulaEstudio);
		nodoEscaleraPpal.agregarDestinos(Constantes.NORTE, nodoBañosPlantaBaja);
		nodoEscaleraPpal.agregarDestinos(Constantes.SUBIRNORTE, nodoBañosPrimerPiso);

		listaNodos.add(nodoEscaleraPpal);

		nodoBañosPlantaBaja.agregarDestinos(Constantes.SUR, nodoEscaleraPpal);

		listaNodos.add(nodoBañosPlantaBaja);

		nodoEscaleraBasicas.agregarDestinos(Constantes.SUBIRNORTE, nodoAula1);
		nodoEscaleraBasicas.agregarDestinos(Constantes.SUBIROESTE, nodoAula9);

		listaNodos.add(nodoEscaleraBasicas);

		nodoAula9.agregarDestinos(Constantes.SUR, nodoEscaleraBasicas);
		nodoAula9.agregarDestinos(Constantes.NORTE, nodoAula12);

		listaNodos.add(nodoAula9);

		nodoAula12.agregarDestinos(Constantes.SUR, nodoAula9);
		nodoAula12.agregarDestinos(Constantes.NORTE, nodoAula18);
		nodoAula12.agregarDestinos(Constantes.OESTE, nodoAula19);

		listaNodos.add(nodoAula12);

		nodoAula18.agregarDestinos(Constantes.SUR, nodoAula12);

		listaNodos.add(nodoAula18);

		nodoAula19.agregarDestinos(Constantes.ESTE, nodoAula12);
		nodoAula19.agregarDestinos(Constantes.SUR, nodoBañosPrimerPiso);

		listaNodos.add(nodoAula19);

		nodoBañosPrimerPiso.agregarDestinos(Constantes.SUR, nodoEscaleraPpal);
		nodoBañosPrimerPiso.agregarDestinos(Constantes.NORTE, nodoAula19);
		nodoBañosPrimerPiso.agregarDestinos(Constantes.OESTE, nodoOficinaCivilGIMNI);

		listaNodos.add(nodoBañosPrimerPiso);

		// aca tambien
		nodoEscaleraChica.agregarDestinos(Constantes.BAJARESTE, nodoDptoMecanica);
		nodoEscaleraChica.agregarDestinos(Constantes.SUBIROESTE, nodoDptoCivil);
		nodoEscaleraChica.agregarDestinos(Constantes.SUBIRNORTE, nodoAula20);
		nodoEscaleraChica.agregarDestinos(Constantes.NORTE, nodoEscaleraISI);

		listaNodos.add(nodoEscaleraChica);

		nodoOficinaCivilGIMNI.agregarDestinos(Constantes.ESTE, nodoBañosPrimerPiso);
		nodoOficinaCivilGIMNI.agregarDestinos(Constantes.OESTE, nodoBaños2);

		listaNodos.add(nodoOficinaCivilGIMNI);

		nodoDptoCivil.agregarDestinos(Constantes.OESTE, nodoAscensor);
		nodoDptoCivil.agregarDestinos(Constantes.ESTE, nodoEscaleraChica);
		nodoDptoCivil.agregarDestinos(Constantes.NORTE, nodoEscaleraElectrica);
		nodoDptoCivil.agregarDestinos(Constantes.SUR, nodoPuertaEstadio);

		listaNodos.add(nodoDptoCivil);

		nodoBaños2.agregarDestinos(Constantes.ESTE, nodoOficinaCivilGIMNI);
		nodoBaños2.agregarDestinos(Constantes.SUR, nodoEscaleraElectrica);

		listaNodos.add(nodoBaños2);

		nodoEscaleraElectrica.agregarDestinos(Constantes.BAJARSUR, nodoPuertaPatioInterno);
		nodoEscaleraElectrica.agregarDestinos(Constantes.SUR, nodoDptoCivil);
		nodoEscaleraElectrica.agregarDestinos(Constantes.NORTE, nodoBaños2);
		nodoEscaleraElectrica.agregarDestinos(Constantes.SUBIRNORTE, nodoEscaleraISI);

		listaNodos.add(nodoEscaleraElectrica);

		nodoPuertaEstadio.agregarDestinos(Constantes.OESTE, nodoIngresoTorre);
		nodoPuertaEstadio.agregarDestinos(Constantes.NORTE, nodoDptoCivil);
		nodoPuertaEstadio.agregarDestinos(Constantes.ESTE, nodoEstadio);

		listaNodos.add(nodoPuertaEstadio);

		nodoEstadio.agregarDestinos(Constantes.OESTE, nodoPuertaEstadio);

		listaNodos.add(nodoEstadio);

		nodoDptoIndustrial.agregarDestinos(Constantes.SUR, nodoAscensor);

		listaNodos.add(nodoDptoIndustrial);

		nodoAula20.agregarDestinos(Constantes.SUR, nodoEscaleraChica);
		nodoAula20.agregarDestinos(Constantes.NORTE, nodoAula21);

		listaNodos.add(nodoAula20);

		nodoAula21.agregarDestinos(Constantes.SUR, nodoAula20);
		nodoAula21.agregarDestinos(Constantes.NORTE, nodoAula22);

		listaNodos.add(nodoAula21);

		nodoAula22.agregarDestinos(Constantes.SUR, nodoAula21);
		nodoAula22.agregarDestinos(Constantes.NORTE, nodoEscaleraISI);

		listaNodos.add(nodoAula22);

		nodoEscaleraISI.agregarDestinos(Constantes.SUR, nodoEscaleraChica);
		nodoEscaleraISI.agregarDestinos(Constantes.BAJARNORTE, nodoEscaleraElectrica);
		nodoEscaleraISI.agregarDestinos(Constantes.BAJARSUR, nodoAula22);
		nodoEscaleraISI.agregarDestinos(Constantes.ESTE, nodoLab1);

		listaNodos.add(nodoEscaleraISI);

		nodoLab1.agregarDestinos(Constantes.OESTE, nodoEscaleraISI);
		nodoLab1.agregarDestinos(Constantes.SUR, nodoCIDISI);
		nodoLab1.agregarDestinos(Constantes.NORTE, nodoLab2);

		listaNodos.add(nodoLab1);

		nodoCIDISI.agregarDestinos(Constantes.NORTE, nodoLab1);
		nodoCIDISI.agregarDestinos(Constantes.SUR, nodoDptoISI);

		listaNodos.add(nodoCIDISI);

		nodoLab2.agregarDestinos(Constantes.SUR, nodoLab1);
		nodoLab2.agregarDestinos(Constantes.NORTE, nodoLab3);

		listaNodos.add(nodoLab2);

		nodoLab3.agregarDestinos(Constantes.SUR, nodoLab2);
		nodoLab3.agregarDestinos(Constantes.NORTE, nodoLabConectividad);

		listaNodos.add(nodoLab3);

		nodoLabConectividad.agregarDestinos(Constantes.SUR, nodoLab3);
		nodoLabConectividad.agregarDestinos(Constantes.NORTE, nodoLab4);

		listaNodos.add(nodoLabConectividad);

		nodoLab4.agregarDestinos(Constantes.SUR, nodoLabConectividad);
		nodoLab4.agregarDestinos(Constantes.ESTE, nodoLab5);

		listaNodos.add(nodoLab4);

		nodoLab5.agregarDestinos(Constantes.OESTE, nodoLab4);

		listaNodos.add(nodoLab5);

		nodoDptoISI.agregarDestinos(Constantes.SUR, nodoTICS);
		nodoDptoISI.agregarDestinos(Constantes.NORTE, nodoCIDISI);

		listaNodos.add(nodoDptoISI);

		nodoTICS.agregarDestinos(Constantes.NORTE, nodoDptoISI);
		nodoTICS.agregarDestinos(Constantes.OESTE, nodoAscensor);

		listaNodos.add(nodoTICS);

	}

	public Nodo getNodoPorNombre(String nombre) {
		Nodo nodo = new Nodo(nombre, 0, 0, false);
		return listaNodos.get(listaNodos.indexOf(nodo));
	}
}
