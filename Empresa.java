import java.util.ArrayList;

public class Empresa{

	public final static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
	"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	public static int contador_vend = 0;

	public static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	public static void main(String[] args){

		//Declaracion del ArrayList en donde se guardara todos los vendedores

			boolean datos_exito;
			byte opc;
			do{
			C.cls();
			opc = menu();
			C.cls();
			switch(opc){
				case 0:{
					opc = 0;
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


				}
				case 2:{

					break;
				}
				default:{
					C.error("Seleccion Invalida");
					break;
				}
			}
			C.espacio(10);
			opc = C.in_byte("Si desea volver al Menu Inicial ingrese 1: ");

		}while(opc != 0);


	}//main


public static byte menu(){
	byte opc;
	C.separador();
	C.outCenln("Empresa X");
	C.separador();
	C.outSln("0.- Salir del Programa");
	C.outSln("1.- Ingresar datos de un Vendedor");
	C.endl(1);
	C.espacio(10);
	opc = C.in_byte("Seleccione una opcion: [ ]\b\b");
	return opc;

	}//menu


	public static boolean ing_datos(){
		
		C.espacio(10);
		String primer_nombre = (C.in_String("Primer Nombre: "));
		C.endl(1);
		C.espacio(10);
		String segundo_nombre = (C.in_String("Segundo Nombre: "));
		C.endl(1);
		C.espacio(10);
		String primer_apellido = (C.in_String("Primer Apellido: "));
		C.endl(1);
		C.espacio(10);
		String segundo_apellido = (C.in_String("Segundo Apellido: "));
		C.endl(1);
		C.espacio(10);
		double sueldo_base = (C.in_double("Sueldo Base: "));
		C.endl(1);
		double[] vent = new double[12];
		try{
		for(int i = 0;i<12;i++){
			C.espacio(10);
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

}//class
