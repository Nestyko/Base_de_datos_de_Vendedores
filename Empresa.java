import java.util.ArrayList;

public class Empresa{


	public static int contador_vend = 0;

	public static void main(String[] args){

		//Declaracion del ArrayList en donde se guardara todos los vendedores
		ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

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
					ing_datos();
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


	public static void ing_datos(){
		Vendedor nuevo = new Vendedor();
		C.espacio(10);
		nuevo.set_primer_nombre(C.in_String("Primer Nombre: "));
		C.endl(1);
		nuevo.set_segundo_nombre(C.in_String("Segundo Nombre: "));
		C.endl(1);



		//Agregar el nuevo vendedor al vector
		vendedores.add(nuevo);


		}//ing_datos

}//class