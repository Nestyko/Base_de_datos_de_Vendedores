//Nombre: Nestor Luis Tobon Arrieta
//C.I: 23.863.118
//Seccion: N-511



import java.util.ArrayList;
import java.util.Random;

public class Empresa{

	public final static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
	"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	//Declaracion del ArrayList en donde se guardara todos los vendedores
	public static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	//Declarar el objeto de Los numeros aleatorios
	public static Random aleatorio = new Random(System.currentTimeMillis());

	public static void main(String[] args){

		//Inicializar las varialbes estaticas de la clase Vendedor
		Vendedor.comenzar();


			boolean datos_exito;
			byte opc;
			do{
			C.cls();
			opc = menu();
			C.cls();
			switch(opc){
				case 0:{
					opc = 1;
					continue;

					}
				case 1:{

					datos_exito = ing_datos();
					if(datos_exito){
						C.outSln("Los datos fueron cargados exitosamente");
						C.espacio(10);
						C.pausa("PRESIONE ENTER PARA CONTINUAR");
						opc = 0;
					    continue;
					    }
					else
						C.error("ERROR LOS DATOS NO SE CARGARON EXITOSAMENTE");
						break;


				}//case 1
				case 2:{
					if(vendedores.size() > 0){
						for(int i = 0; i < vendedores.size();i++){
						vendedores.get(i).Mostrar();
						}//for
						opc = 0;
						continue;
					}//if
					else{
						C.errorCen("No hay datos cargados");
						opc = 0;
						continue;
						}

				}//case 2
				case 3:{
					if(vendedores.size() > 0){
						Vendedor.Mostrar_balance();
						opc = 0;
						continue;
						}
					else{
					C.errorCen("No hay datos cargados");
						opc = 0;
						continue;
							}



					}//case 3
				case 4:{
						for(int i = 0; i < vendedores.size();i++){
							C.outSln("Vendedor " + (i+1) + ": " + vendedores.get(i).get_nombre_completo());
							C.outSln("Codigo: " + vendedores.get(i).get_codigo());
							C.endl(1);
							}//for
							C.espacio(10);
							byte mod = C.in_byte("Seleccione un vededor para modificar: ");
							C.endl(1);
									try{
									mod_datos(mod-1);
								}//try
								catch(Exception e){
									C.errorCen("NUMERO DE VENDEDOR INVALIDO, POR FAVOR INTENTE CON UN NUMERO ENTRE 1 Y EL NUMERO ACUTAL DE VENDEDORES REGISTRADOS");
									opc = 0;
									continue;
									}//catch


							C.pausa();
							opc = 0;
							continue;
					}//case 4
					case 5:{
							for(int i = 0; i < vendedores.size();i++){
							C.outSln("Vendedor " + (i+1) + ": " + vendedores.get(i).get_nombre_completo());
							C.outSln("Codigo: " + vendedores.get(i).get_codigo());
							C.endl(1);
							}//for
							C.espacio(10);
							byte mod = C.in_byte("Seleccione un vededor para borrar: ");
							C.endl(1);
									try{
									borrar_vendedor(mod-1);
								}//try
								catch(Exception e){
									C.errorCen("NUMERO DE VENDEDOR INVALIDO, POR FAVOR INTENTE CON UN NUMERO ENTRE 1 Y EL NUMERO ACUTAL DE VENDEDORES REGISTRADOS");
									opc = 0;
									continue;
									}//catch
							opc = 0;
							continue;
						}//case 5



				case 9:{
					ing_datos_aleatorios();
					opc = 0;
					continue;

					}//case 9

				case 10:{
					acerca_de();
					C.pausa("PRESIONE ENTER PARA CONTINUAR");
					opc = 0;
					continue;
					}//case 10
				default:{
					C.error("Seleccion Invalida");
					break;
				}//default
			}//switch
			C.espacio(10);
			opc = C.in_byte("Si desea Salir del programa Presione 1: ");

		}while(opc != 1);


	}//main


public static byte menu(){

   byte opc;
	if(vendedores.size() > 0){
			C.separador();
				C.outCenln("Empresa X");
				C.endl(1);
				C.separador();
				C.espacio(40);
				C.outln("Numero de Vendedores registrados: " + vendedores.size());
				C.endl(1);
				C.outSln("0.- Salir del Programa");
				C.outSln("1.- Ingresar datos de un Vendedor");
				C.outSln("2.- Mostrar datos de los Vendedores");
				C.outSln("3.- Mostrar las ganancias obtenidas por la empresa");
				C.outSln("4.- Modificar datos de algun vendedor");
				C.outSln("5.- Borrar a algun vendedor");
				C.endl(2);
				C.outSln("9.- Generar datos aleatorios");
				C.outSln("10.- Acerca del Programa");
				C.endl(1);
				opc = C.in_byte("Seleccione una opcion: [  ]\b\b\b");
		return opc;
							}
						else{
				C.separador();
				C.outCenln("Empresa X");
				C.endl(1);
				C.separador();
				C.espacio(40);
				C.outln("Numero de Vendedores registrados: " + vendedores.size());
				C.endl(1);
				C.outSln("0.- Salir del Programa");
				C.outSln("1.- Ingresar datos de un Vendedor");
				C.endl(2);
				C.outSln("9.- Generar datos aleatorios");
				C.outSln("10.- Acerca del Programa");
				C.endl(1);
				opc = C.in_byte("Seleccione una opcion: [  ]\b\b\b");
		return opc;
							}//else

	}//menu


	public static boolean ing_datos(){

		String primer_nombre = (C.solo_letras(C.in_String("Primer Nombre: ")));
		C.endl(1);

		String segundo_nombre = (C.solo_letras(C.in_String("Segundo Nombre: ")));
		C.endl(1);

		String primer_apellido = (C.solo_letras(C.in_String("Primer Apellido: ")));
		C.endl(1);

		String segundo_apellido = (C.solo_letras(C.in_String("Segundo Apellido: ")));
		C.endl(1);

		double sueldo_base = C.unsigned((C.in_double("Sueldo Base: ")));
		C.endl(1);
		double[] vent = new double[12];
		try{
		for(int i = 0;i<12;i++){
			vent[i] = C.unsigned(C.in_double("Ventas de " + meses[i] + ": "));
			C.endl(1);
			}//for
		}//try
		catch(Exception e){
			C.error();
			C.pausa("Presione enter para continuar");
			}

		Vendedor nuevo = new Vendedor(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
			sueldo_base, vent);

		nuevo.validar_anonimato();


		int prueba = vendedores.size();
		//Agregar el nuevo vendedor al vector
		vendedores.add(nuevo);
		if(vendedores.size() == prueba+1)
		return true;
		else
		return false;
		}//ing_datos

		public static boolean ing_datos_aleatorios(){

				String primer_nombre = "MISTER";
				C.endl(1);

				String segundo_nombre = "ALEATORIO";
				C.endl(1);

				String primer_apellido = "";
				C.endl(1);

				String segundo_apellido = "";
				C.endl(1);

				double sueldo_base = aleatorio.nextInt(200000);
				C.endl(1);
				double[] vent = new double[12];
				try{
				for(int i = 0;i<12;i++){
					vent[i] = aleatorio.nextInt(400000);
					C.endl(1);
					}//for
				}//try
				catch(Exception e){
					C.error();
					C.pausa("Presione enter para continuar");
					}

				Vendedor nuevo = new Vendedor(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
					sueldo_base, vent);


				int prueba = vendedores.size();
				//Agregar el nuevo vendedor al vector
				vendedores.add(nuevo);
				if(vendedores.size() == prueba+1)
				return true;
				else
				return false;
		}//ing_datos_aleatorios

public static void mod_datos(int mod){

		vendedores.get(mod).set_primer_nombre(C.solo_letras(C.in_String("Primer Nombre: ")));
		C.endl(1);
		vendedores.get(mod).set_segundo_nombre(C.solo_letras(C.in_String("Segundo Nombre: ")));
		C.endl(1);
		vendedores.get(mod).set_primer_apellido(C.solo_letras(C.in_String("Primer Apellido: ")));
		C.endl(1);
		vendedores.get(mod).set_segundo_apellido(C.solo_letras(C.in_String("Segundo Apellido: ")));
		C.endl(1);
		vendedores.get(mod).set_sueldo_base(C.unsigned(C.in_double("Sueldo Base: ")));
		C.endl(1);

		double[] vent = new double[12];
		try{
		for(int i = 0;i<12;i++){
			vent[i] = C.unsigned(C.in_double("Ventas de " + meses[i] + ": "));
			C.endl(1);
			}//for
		}//try
		catch(Exception e){
			C.error();
			C.pausa("Presione enter para continuar");
			}

		vendedores.get(mod).set_ventas_mensuales(vent);
		vendedores.get(mod).set_calc_total_anual();
		vendedores.get(mod).set_calc_comision();
		vendedores.get(mod).validar_anonimato();


		//Agregar el nuevo vendedor al vector


		}//mod_datos

public static void borrar_vendedor(int mod){

	//Devolver a 0 todas sus ganancias
	vendedores.get(mod).set_sueldo_base(0);
	double[] vent = new double[12];
	vendedores.get(mod).set_ventas_mensuales(vent);
	vendedores.get(mod).set_calc_total_anual();
	vendedores.get(mod).set_calc_comision();

	//Borrar al vendedor
	vendedores.remove(mod);


	}//borrar_vendedor

public static final void acerca_de(){
	for(int i = 0;i<15;i++){
		System.out.println("\n\n");
		}
	System.out.print("          ");
	System.out.println("Primer Taller de Programacion 2");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Programa realizado por: Nestor Luis Tobon Arrieta");
	System.out.print("          ");
	System.out.println("Cedula de Identidad: 23.863.118");
	System.out.print("          ");
	System.out.println("Seccion N-511");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Repositorios de este programa disponibles en:\nURL: https://github.com/Nestyko/Base_de_datos_de_Vendedores");
	System.out.print("\n");
	System.out.print("          ");
	System.out.println("Descarga Directa:\nURL: https://github.com/Nestyko/Base_de_datos_de_Vendedores/archive/master.zip");

	}//acerca_de

}//class
