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
						C.pausa();
						opc = 1;
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
					}//if
					else{
						C.errorCen("No hay datos cargados");
						opc = 1;
						continue;
						}

					break;
				}//case 2
				case 3:{
					if(vendedores.size() > 0){
						Vendedor.Mostrar_balance();
						}
					else{
					C.errorCen("No hay datos cargados");
						opc = 1;
						continue;
							}

					break;

					}//case 3
				case 9:{
					ing_datos_aleatorios();
					opc = 0;
					continue;

					}//case 9
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
	C.endl(2);
	C.outSln("9.- Generar datos aleatorios");
	C.endl(1);
	opc = C.in_byte("Seleccione una opcion: [ ]\b\b");
	return opc;

	}//menu


	public static boolean ing_datos(){

		String primer_nombre = (C.in_String("Primer Nombre: "));
		C.endl(1);

		String segundo_nombre = (C.in_String("Segundo Nombre: "));
		C.endl(1);

		String primer_apellido = (C.in_String("Primer Apellido: "));
		C.endl(1);

		String segundo_apellido = (C.in_String("Segundo Apellido: "));
		C.endl(1);

		double sueldo_base = (C.in_double("Sueldo Base: "));
		C.endl(1);
		double[] vent = new double[12];
		try{
		for(int i = 0;i<12;i++){
			vent[i] = C.in_double("Ventas de " + meses[i] + ": ");
			C.endl(1);
			}//for
		}//try
		catch(Exception e){
			C.error();
			C.pausa("Presione enter para continuar");
			}

		Vendedor nuevo = new Vendedor(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
			sueldo_base, vent);



		//nuevo.set_ventas_mensuales(vent);
		//nuevo.set_calc_total_anual(nuevo.get_ventas_mensuales());



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

				double sueldo_base = aleatorio.nextInt(100000);
				C.endl(1);
				double[] vent = new double[12];
				try{
				for(int i = 0;i<12;i++){
					vent[i] = aleatorio.nextInt(9999999);
					C.endl(1);
					}//for
				}//try
				catch(Exception e){
					C.error();
					C.pausa("Presione enter para continuar");
					}

				Vendedor nuevo = new Vendedor(primer_nombre, segundo_nombre, primer_apellido, segundo_apellido,
					sueldo_base, vent);



				//nuevo.set_ventas_mensuales(vent);
				//nuevo.set_calc_total_anual(nuevo.get_ventas_mensuales());



				int prueba = vendedores.size();
				//Agregar el nuevo vendedor al vector
				vendedores.add(nuevo);
				if(vendedores.size() == prueba+1)
				return true;
				else
				return false;
		}//ing_datos_aleatorios

}//class
