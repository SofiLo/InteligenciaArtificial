package frsf.cidisi.exercise;

import java.util.HashMap;

import frsf.cidisi.exercise.diagrama.grafo.Nodo;

public class Inicializacion {
	
	public static void inicializacion(){
		
		//Creamos los nodos
		Nodo nodoInicial = new Nodo();
		Nodo nodoCantina = new Nodo();
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
		Nodo nodoEcaleraBasicas = new Nodo();
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
		
		
		//Seteamos los nodos
		nodoInicial.setNombre("Mastil");
		nodoInicial.setIdNodo(0);
		nodoInicial.setNivel(0);
		nodoInicial.setObstaculo(false);
		
		nodoCantina.setNombre("Cantina");
		nodoCantina.setIdNodo(1);
		nodoCantina.setNivel(0);
		nodoCantina.setObstaculo(false);
		
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
		
		nodoDptoMecanica.setNombre("Departamento Mecanica");
		nodoDptoMecanica.setIdNodo(13);
		nodoDptoMecanica.setNivel(0);
		nodoDptoMecanica.setObstaculo(false);
		
		nodoPuertaPatioInterno.setNombre("Puerta a Patio Interno");
		nodoPuertaPatioInterno.setIdNodo(14);
		nodoPuertaPatioInterno.setNivel(0);
		nodoPuertaPatioInterno.setObstaculo(false);
		
		nodoDptoElectrica.setNombre("Departamento Electrica");
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
		
		nodoEcaleraBasicas.setNombre("Ecalera Basicas");
		nodoEcaleraBasicas.setIdNodo(19);
		nodoEcaleraBasicas.setNivel(0);
		nodoEcaleraBasicas.setObstaculo(false);
		
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
		
		nodoEscaleraElectrica.setNombre("Escalera Electrica");
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
		
		nodoInicial.agregarDestinos(Constantes.NORTE, nodoCantina);
		nodoInicial.agregarDestinos(Constantes.SUR, nodoPuertaPpal);

	} 
}
