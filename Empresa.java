public class Empresa{

	public static Vendedor[] vend = new Vendedor[50];
	public static int contador_vend = 0;

	public static void main(String[] args){
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
			opc = C.in_byte("Desea volver al Menu Inicial?");

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
		Vendedor vend[contador_vend] = new Vendedor();
		C.espacio(10);
		vend[contador_vend].set_primer_nombre(C.in_String("Ingrese el Primer Nombre: "));

		}//ing_datos

}//class