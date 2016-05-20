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

		nodoInicial.agregarDestinos(Constantes.IROESTE, nodoCantina);
		nodoInicial.agregarDestinos(Constantes.IRNORTE, nodoPuertaPpal);
		
		nodoInicial.agregarDistancias(Constantes.IROESTE, 10);
		nodoInicial.agregarDistancias(Constantes.IRNORTE, 10);

		listaNodos.add(nodoInicial);

		nodoCantina.agregarDestinos(Constantes.IRESTE, nodoInicial);
		nodoCantina.agregarDestinos(Constantes.IROESTE, nodoBiblioteca);
		
		nodoCantina.agregarDistancias(Constantes.IROESTE, 5);
		nodoCantina.agregarDistancias(Constantes.IRESTE, 10);

		listaNodos.add(nodoCantina);

		nodoBiblioteca.agregarDestinos(Constantes.IRESTE, nodoCantina);
		nodoBiblioteca.agregarDestinos(Constantes.IROESTE, nodoAlumnado);

		nodoBiblioteca.agregarDistancias(Constantes.IROESTE, 5);
		nodoBiblioteca.agregarDistancias(Constantes.IRESTE, 5);
		
		listaNodos.add(nodoBiblioteca);

		nodoAlumnado.agregarDestinos(Constantes.IRESTE, nodoBiblioteca);
		nodoAlumnado.agregarDestinos(Constantes.IROESTE, nodoIngresoTorre);

		nodoAlumnado.agregarDistancias(Constantes.IROESTE, 5);
		nodoAlumnado.agregarDistancias(Constantes.IRESTE, 5);

		listaNodos.add(nodoAlumnado);

		nodoIngresoTorre.agregarDestinos(Constantes.IRESTE, nodoAlumnado);
		nodoIngresoTorre.agregarDestinos(Constantes.IRSUR, nodoEscaleraTorre);
		nodoIngresoTorre.agregarDestinos(Constantes.IROESTE, nodoPuertaEstadio);

		nodoIngresoTorre.agregarDistancias(Constantes.IRESTE, 5);
		nodoIngresoTorre.agregarDistancias(Constantes.IRSUR, 7);
		nodoIngresoTorre.agregarDistancias(Constantes.IROESTE, 6);
		
		listaNodos.add(nodoIngresoTorre);

		nodoEscaleraTorre.agregarDestinos(Constantes.IRNORTE, nodoIngresoTorre);
		nodoEscaleraTorre.agregarDestinos(Constantes.IRESTE, nodoPuertaEstadio);

		nodoEscaleraTorre.agregarDistancias(Constantes.IRNORTE, 7);
		nodoEscaleraTorre.agregarDistancias(Constantes.IRESTE, 20);

		listaNodos.add(nodoEscaleraTorre);

		nodoPuertaPpal.agregarDestinos(Constantes.IRSUR, nodoInicial);
		nodoPuertaPpal.agregarDestinos(Constantes.IRNORTE, nodoFotocopiadora);
		nodoPuertaPpal.agregarDestinos(Constantes.IRESTE, nodoAula1);
		nodoPuertaPpal.agregarDestinos(Constantes.IROESTE, nodoAulaEstudio);
		
		nodoPuertaPpal.agregarDistancias(Constantes.IRSUR, 10);
		nodoPuertaPpal.agregarDistancias(Constantes.IRESTE, 5);
		nodoPuertaPpal.agregarDistancias(Constantes.IRNORTE, 5);
		nodoPuertaPpal.agregarDistancias(Constantes.IROESTE, 5);

		listaNodos.add(nodoPuertaPpal);

		nodoFotocopiadora.agregarDestinos(Constantes.IRSUR, nodoPuertaPpal);
		nodoFotocopiadora.agregarDestinos(Constantes.IRNORTE, nodoAula2);

		nodoFotocopiadora.agregarDistancias(Constantes.IRSUR, 5);
		nodoFotocopiadora.agregarDistancias(Constantes.IRNORTE, 4);
		
		listaNodos.add(nodoFotocopiadora);

		nodoAula2.agregarDestinos(Constantes.IRSUR, nodoFotocopiadora);
		nodoAula2.agregarDestinos(Constantes.IRNORTE, nodoAula3);

		nodoAula2.agregarDistancias(Constantes.IRSUR, 4);
		nodoAula2.agregarDistancias(Constantes.IRNORTE, 4);
		
		listaNodos.add(nodoAula2);

		nodoAula3.agregarDestinos(Constantes.IRSUR, nodoAula2);
		nodoAula3.agregarDestinos(Constantes.IRNORTE, nodoAula4);
		
		nodoAula3.agregarDistancias(Constantes.IRSUR, 4);
		nodoAula3.agregarDistancias(Constantes.IRNORTE, 4);

		listaNodos.add(nodoAula3);

		nodoAula4.agregarDestinos(Constantes.IRSUR, nodoAula3);
		nodoAula4.agregarDestinos(Constantes.IRNORTE, nodoAula5);
		
		nodoAula4.agregarDistancias(Constantes.IRSUR, 4);
		nodoAula4.agregarDistancias(Constantes.IRNORTE, 4);

		listaNodos.add(nodoAula4);

		nodoAula5.agregarDestinos(Constantes.IRSUR, nodoAula4);

		nodoAula5.agregarDistancias(Constantes.IRSUR, 4);
		
		listaNodos.add(nodoAula5);

		nodoAula1.agregarDestinos(Constantes.IROESTE, nodoPuertaPpal);
		nodoAula1.agregarDestinos(Constantes.IRSUR, nodoEscaleraBasicas);

		nodoAula1.agregarDistancias(Constantes.IRSUR, 2);
		nodoAula1.agregarDistancias(Constantes.IROESTE, 5);
		
		listaNodos.add(nodoAula1);

		nodoAulaEstudio.agregarDestinos(Constantes.IRESTE, nodoPuertaPpal);
		nodoAulaEstudio.agregarDestinos(Constantes.IROESTE, nodoDptoMecanica);
		nodoAulaEstudio.agregarDestinos(Constantes.IRNORTE, nodoEscaleraPpal);

		nodoAulaEstudio.agregarDistancias(Constantes.IRNORTE, 3);
		nodoAulaEstudio.agregarDistancias(Constantes.IRESTE, 5);
		nodoAulaEstudio.agregarDistancias(Constantes.IROESTE, 4);
		
		listaNodos.add(nodoAulaEstudio);

		nodoDptoMecanica.agregarDestinos(Constantes.IRESTE, nodoAulaEstudio);
		nodoDptoMecanica.agregarDestinos(Constantes.IROESTE, nodoPuertaPatioInterno);
		nodoDptoMecanica.agregarDestinos(Constantes.SUBIROESTE, nodoEscaleraChica);

		nodoDptoMecanica.agregarDistancias(Constantes.SUBIROESTE, 15);
		nodoDptoMecanica.agregarDistancias(Constantes.IRESTE, 4);
		nodoDptoMecanica.agregarDistancias(Constantes.IROESTE, 3);
		
		listaNodos.add(nodoDptoMecanica);

		nodoPuertaPatioInterno.agregarDestinos(Constantes.IRESTE, nodoDptoMecanica);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.IRNORTE, nodoDptoElectrica);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.IROESTE, nodoAscensor);
		nodoPuertaPatioInterno.agregarDestinos(Constantes.SUBIROESTE, nodoEscaleraElectrica);
		
		nodoPuertaPatioInterno.agregarDistancias(Constantes.IRNORTE, 5);
		nodoPuertaPatioInterno.agregarDistancias(Constantes.IRESTE, 3);
		nodoPuertaPatioInterno.agregarDistancias(Constantes.IROESTE, 4);
		nodoPuertaPatioInterno.agregarDistancias(Constantes.SUBIROESTE, 15);
		
		listaNodos.add(nodoPuertaPatioInterno);

		nodoDptoElectrica.agregarDestinos(Constantes.IRSUR, nodoPuertaPatioInterno);

		nodoDptoElectrica.agregarDistancias(Constantes.IRSUR, 5);
		
		listaNodos.add(nodoDptoElectrica);

		nodoAscensor.agregarDestinos(Constantes.IRESTE, nodoPuertaPatioInterno);
		nodoAscensor.agregarDestinos(Constantes.BAJARESTE, nodoDptoCivil);
		nodoAscensor.agregarDestinos(Constantes.SUBIRNORTE, nodoDptoIndustrial);
		nodoAscensor.agregarDestinos(Constantes.SUBIRESTE, nodoTICS);

		nodoAscensor.agregarDistancias(Constantes.IRESTE, 4);
		nodoAscensor.agregarDistancias(Constantes.BAJARESTE, 1);
		nodoAscensor.agregarDistancias(Constantes.SUBIRNORTE, 1);
		nodoAscensor.agregarDistancias(Constantes.SUBIRESTE, 1);
		
		listaNodos.add(nodoAscensor);

		nodoEscaleraPpal.agregarDestinos(Constantes.IRSUR, nodoAulaEstudio);
		nodoEscaleraPpal.agregarDestinos(Constantes.IRNORTE, nodoBañosPlantaBaja);
		nodoEscaleraPpal.agregarDestinos(Constantes.SUBIRNORTE, nodoBañosPrimerPiso);

		nodoEscaleraPpal.agregarDistancias(Constantes.IRSUR, 3);
		nodoEscaleraPpal.agregarDistancias(Constantes.SUBIRNORTE, 10);
		nodoEscaleraPpal.agregarDistancias(Constantes.IRNORTE, 8);
		
		listaNodos.add(nodoEscaleraPpal);

		nodoBañosPlantaBaja.agregarDestinos(Constantes.IRSUR, nodoEscaleraPpal);
		
		nodoBañosPlantaBaja.agregarDistancias(Constantes.IRSUR, 8);

		listaNodos.add(nodoBañosPlantaBaja);

		nodoEscaleraBasicas.agregarDestinos(Constantes.BAJARNORTE, nodoAula1);
		nodoEscaleraBasicas.agregarDestinos(Constantes.SUBIRNORTE, nodoAula9);
		
		nodoEscaleraBasicas.agregarDistancias(Constantes.BAJARNORTE, 10);
		nodoEscaleraBasicas.agregarDistancias(Constantes.SUBIRNORTE, 10);

		listaNodos.add(nodoEscaleraBasicas);

		nodoAula9.agregarDestinos(Constantes.IRSUR, nodoEscaleraBasicas);
		nodoAula9.agregarDestinos(Constantes.IRNORTE, nodoAula12);

		nodoAula9.agregarDistancias(Constantes.IRNORTE, 5);
		nodoAula9.agregarDistancias(Constantes.IRSUR, 10);
		
		listaNodos.add(nodoAula9);

		nodoAula12.agregarDestinos(Constantes.IRSUR, nodoAula9);
		nodoAula12.agregarDestinos(Constantes.IRNORTE, nodoAula18);
		nodoAula12.agregarDestinos(Constantes.IROESTE, nodoAula19);

		nodoAula12.agregarDistancias(Constantes.IRNORTE, 5);
		nodoAula12.agregarDistancias(Constantes.IRSUR, 5);
		nodoAula12.agregarDistancias(Constantes.IROESTE, 5);
		
		listaNodos.add(nodoAula12);

		nodoAula18.agregarDestinos(Constantes.IRSUR, nodoAula12);

		nodoAula18.agregarDistancias(Constantes.IRSUR, 5);
		
		listaNodos.add(nodoAula18);

		nodoAula19.agregarDestinos(Constantes.IRESTE, nodoAula12);
		nodoAula19.agregarDestinos(Constantes.IRSUR, nodoBañosPrimerPiso);

		nodoAula19.agregarDistancias(Constantes.IRSUR, 7);
		nodoAula19.agregarDistancias(Constantes.IRESTE, 5);
		
		listaNodos.add(nodoAula19);

		nodoBañosPrimerPiso.agregarDestinos(Constantes.IRNORTE, nodoEscaleraPpal);
		nodoBañosPrimerPiso.agregarDestinos(Constantes.IRSUR, nodoAula19);
		nodoBañosPrimerPiso.agregarDestinos(Constantes.IROESTE, nodoOficinaCivilGIMNI);

		nodoBañosPrimerPiso.agregarDistancias(Constantes.IRSUR, 7);
		nodoBañosPrimerPiso.agregarDistancias(Constantes.IRNORTE, 10);
		nodoBañosPrimerPiso.agregarDistancias(Constantes.IROESTE, 8);
		
		listaNodos.add(nodoBañosPrimerPiso);

		// aca tambien
		nodoEscaleraChica.agregarDestinos(Constantes.BAJARESTE, nodoDptoMecanica);
		nodoEscaleraChica.agregarDestinos(Constantes.SUBIROESTE, nodoDptoCivil);
		nodoEscaleraChica.agregarDestinos(Constantes.SUBIRNORTE, nodoAula20);
		nodoEscaleraChica.agregarDestinos(Constantes.IRNORTE, nodoEscaleraISI);

		nodoEscaleraChica.agregarDistancias(Constantes.BAJARESTE, 10);
		nodoEscaleraChica.agregarDistancias(Constantes.SUBIROESTE, 10);
		nodoEscaleraChica.agregarDistancias(Constantes.SUBIRNORTE, 10);
		nodoEscaleraChica.agregarDistancias(Constantes.IRNORTE, 10);
		
		listaNodos.add(nodoEscaleraChica);

		nodoOficinaCivilGIMNI.agregarDestinos(Constantes.IRESTE, nodoBañosPrimerPiso);
		nodoOficinaCivilGIMNI.agregarDestinos(Constantes.IROESTE, nodoBaños2);

		nodoOficinaCivilGIMNI.agregarDistancias(Constantes.IRESTE, 8);
		nodoOficinaCivilGIMNI.agregarDistancias(Constantes.IROESTE, 5);
		
		listaNodos.add(nodoOficinaCivilGIMNI);

		nodoDptoCivil.agregarDestinos(Constantes.IROESTE, nodoAscensor);
		nodoDptoCivil.agregarDestinos(Constantes.IRESTE, nodoEscaleraChica);
		nodoDptoCivil.agregarDestinos(Constantes.IRNORTE, nodoEscaleraElectrica);
		nodoDptoCivil.agregarDestinos(Constantes.IRSUR, nodoPuertaEstadio);

		nodoDptoCivil.agregarDistancias(Constantes.IROESTE, 1);
		nodoDptoCivil.agregarDistancias(Constantes.IRESTE, 10);
		nodoDptoCivil.agregarDistancias(Constantes.IRNORTE, 10);
		nodoDptoCivil.agregarDistancias(Constantes.IRSUR, 9);
		
		listaNodos.add(nodoDptoCivil);

		nodoBaños2.agregarDestinos(Constantes.IRESTE, nodoOficinaCivilGIMNI);
		nodoBaños2.agregarDestinos(Constantes.IRSUR, nodoEscaleraElectrica);

		nodoBaños2.agregarDistancias(Constantes.IRESTE, 4);
		nodoBaños2.agregarDistancias(Constantes.IRSUR, 7);
		
		listaNodos.add(nodoBaños2);

		nodoEscaleraElectrica.agregarDestinos(Constantes.BAJARSUR, nodoPuertaPatioInterno);
		nodoEscaleraElectrica.agregarDestinos(Constantes.IRSUR, nodoDptoCivil);
		nodoEscaleraElectrica.agregarDestinos(Constantes.IRNORTE, nodoBaños2);
		nodoEscaleraElectrica.agregarDestinos(Constantes.SUBIRNORTE, nodoEscaleraISI);

		nodoEscaleraElectrica.agregarDistancias(Constantes.BAJARSUR, 8);
		nodoEscaleraElectrica.agregarDistancias(Constantes.IRSUR, 5);
		nodoEscaleraElectrica.agregarDistancias(Constantes.IRNORTE, 7);
		nodoEscaleraElectrica.agregarDistancias(Constantes.SUBIRNORTE, 10);
		
		listaNodos.add(nodoEscaleraElectrica);

		nodoPuertaEstadio.agregarDestinos(Constantes.IROESTE, nodoIngresoTorre);
		nodoPuertaEstadio.agregarDestinos(Constantes.IRNORTE, nodoDptoCivil);
		nodoPuertaEstadio.agregarDestinos(Constantes.IRESTE, nodoEstadio);
		
		nodoPuertaEstadio.agregarDistancias(Constantes.IROESTE, 6);
		nodoPuertaEstadio.agregarDistancias(Constantes.IRNORTE, 8);
		nodoPuertaEstadio.agregarDistancias(Constantes.IRESTE, 4);

		listaNodos.add(nodoPuertaEstadio);

		nodoEstadio.agregarDestinos(Constantes.IROESTE, nodoPuertaEstadio);
		
		nodoEstadio.agregarDistancias(Constantes.IROESTE, 4);

		listaNodos.add(nodoEstadio);

		nodoDptoIndustrial.agregarDestinos(Constantes.IRSUR, nodoAscensor);

		nodoDptoIndustrial.agregarDistancias(Constantes.IRSUR, 1);
		
		listaNodos.add(nodoDptoIndustrial);

		nodoAula20.agregarDestinos(Constantes.IRSUR, nodoEscaleraChica);
		nodoAula20.agregarDestinos(Constantes.IRNORTE, nodoAula21);

		nodoAula20.agregarDistancias(Constantes.IRSUR, 8);
		nodoAula20.agregarDistancias(Constantes.IRNORTE, 4);
		
		listaNodos.add(nodoAula20);

		nodoAula21.agregarDestinos(Constantes.IRSUR, nodoAula20);
		nodoAula21.agregarDestinos(Constantes.IRNORTE, nodoAula22);

		nodoAula21.agregarDistancias(Constantes.IRSUR, 4);
		nodoAula21.agregarDistancias(Constantes.IRNORTE, 4);
		
		listaNodos.add(nodoAula21);

		nodoAula22.agregarDestinos(Constantes.IRSUR, nodoAula21);
		nodoAula22.agregarDestinos(Constantes.IRNORTE, nodoEscaleraISI);

		nodoAula22.agregarDistancias(Constantes.IRSUR, 4);
		nodoAula22.agregarDistancias(Constantes.IRNORTE, 8);
		
		listaNodos.add(nodoAula22);

		nodoEscaleraISI.agregarDestinos(Constantes.IRSUR, nodoEscaleraChica);
		nodoEscaleraISI.agregarDestinos(Constantes.BAJARNORTE, nodoEscaleraElectrica);
		nodoEscaleraISI.agregarDestinos(Constantes.BAJARSUR, nodoAula22);
		nodoEscaleraISI.agregarDestinos(Constantes.IRESTE, nodoLab1);

		nodoEscaleraISI.agregarDistancias(Constantes.IRSUR, 10);
		nodoEscaleraISI.agregarDistancias(Constantes.BAJARNORTE, 10);
		nodoEscaleraISI.agregarDistancias(Constantes.BAJARSUR, 8);
		nodoEscaleraISI.agregarDistancias(Constantes.IRESTE, 7);

		listaNodos.add(nodoEscaleraISI);

		nodoLab1.agregarDestinos(Constantes.IROESTE, nodoEscaleraISI);
		nodoLab1.agregarDestinos(Constantes.IRSUR, nodoCIDISI);
		nodoLab1.agregarDestinos(Constantes.IRNORTE, nodoLab2);

		nodoLab1.agregarDistancias(Constantes.IROESTE, 7);
		nodoLab1.agregarDistancias(Constantes.IRSUR, 5);
		nodoLab1.agregarDistancias(Constantes.IRNORTE, 5);
		
		listaNodos.add(nodoLab1);

		nodoCIDISI.agregarDestinos(Constantes.IRNORTE, nodoLab1);
		nodoCIDISI.agregarDestinos(Constantes.IRSUR, nodoDptoISI);

		nodoCIDISI.agregarDistancias(Constantes.IRSUR, 5);
		nodoCIDISI.agregarDistancias(Constantes.IRNORTE, 5);
		
		listaNodos.add(nodoCIDISI);

		nodoLab2.agregarDestinos(Constantes.IRSUR, nodoLab1);
		nodoLab2.agregarDestinos(Constantes.IRNORTE, nodoLab3);
		
		nodoLab2.agregarDistancias(Constantes.IRSUR, 5);
		nodoLab2.agregarDistancias(Constantes.IRNORTE, 5);

		listaNodos.add(nodoLab2);

		nodoLab3.agregarDestinos(Constantes.IRSUR, nodoLab2);
		nodoLab3.agregarDestinos(Constantes.IRNORTE, nodoLabConectividad);

		nodoLab3.agregarDistancias(Constantes.IRSUR, 5);
		nodoLab3.agregarDistancias(Constantes.IRNORTE, 5);
		
		listaNodos.add(nodoLab3);

		nodoLabConectividad.agregarDestinos(Constantes.IRSUR, nodoLab3);
		nodoLabConectividad.agregarDestinos(Constantes.IRNORTE, nodoLab4);
		
		nodoLabConectividad.agregarDistancias(Constantes.IRSUR, 5);
		nodoLabConectividad.agregarDistancias(Constantes.IRNORTE, 5);

		listaNodos.add(nodoLabConectividad);

		nodoLab4.agregarDestinos(Constantes.IRSUR, nodoLabConectividad);
		nodoLab4.agregarDestinos(Constantes.IRESTE, nodoLab5);

		nodoLab4.agregarDistancias(Constantes.IRSUR, 5);
		nodoLab4.agregarDistancias(Constantes.IRESTE, 5);
		
		listaNodos.add(nodoLab4);

		nodoLab5.agregarDestinos(Constantes.IROESTE, nodoLab4);

		nodoLab5.agregarDistancias(Constantes.IROESTE, 5);
		
		listaNodos.add(nodoLab5);

		nodoDptoISI.agregarDestinos(Constantes.IRSUR, nodoTICS);
		nodoDptoISI.agregarDestinos(Constantes.IRNORTE, nodoCIDISI);

		nodoDptoISI.agregarDistancias(Constantes.IRSUR, 5);
		nodoDptoISI.agregarDistancias(Constantes.IRNORTE, 5);
		
		listaNodos.add(nodoDptoISI);

		nodoTICS.agregarDestinos(Constantes.IRNORTE, nodoDptoISI);
		nodoTICS.agregarDestinos(Constantes.IROESTE, nodoAscensor);

		nodoTICS.agregarDistancias(Constantes.IRNORTE, 5);
		nodoTICS.agregarDistancias(Constantes.IROESTE, 3);
		
		listaNodos.add(nodoTICS);

	}

	public Nodo getNodoPorNombre(String nombre) {
		Nodo nodo = new Nodo(nombre, 0, 0, false);
		return listaNodos.get(listaNodos.indexOf(nodo));
	}
}
