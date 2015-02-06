

public class Vendedor{

	private static double balance;//balance de la empresa sin tomar en cuenta el IMPUESTO
	private static int contador_codigo;

	public final static String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
	"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	private double comision;
	private int codigo;
	private String primer_nombre,segundo_nombre,primer_apellido, segundo_apellido;
	private double sueldo_base;
	private double[] ventas_mensuales = new double[12];
	private double total_anual;

		//Constructor Default
	public Vendedor(){
		comision = 0.0;
		codigo = generar_codigo();
		primer_nombre = null;
		segundo_nombre = null;
		primer_apellido = null;
		segundo_apellido = null;
		sueldo_base = 0.0;
		ventas_mensuales = inicializar_vector(ventas_mensuales);
		total_anual = 0.0;
		}//Default

		//Constructor con todas las variables
	public Vendedor(String primer,
	String segundo, String primer_a, String segundo_a, double sueldo, double[] ven_men){

		this.codigo = generar_codigo();
		this.primer_nombre = primer;
		this.segundo_nombre = segundo;
		this.primer_apellido = primer_a;
		this.segundo_apellido = segundo_a;
		this.sueldo_base = sueldo;
		this.ventas_mensuales = ven_men;
		double total = 0.0;
		for(int i = 0;i<ventas_mensuales.length;i++)
			total += ventas_mensuales[i];
		this.total_anual = total;
		this.comision = calc_comision();
		balance += (total_anual - (comision+sueldo_base));


		}// TODAS LAS VARIABLES



	//Coloca en todas las posiciones del vector el valor de 0.0

public double[] inicializar_vector(double[] vec){
	for (int i = 0; i < vec.length;i++)
		vec[i]=0.0;
		return vec;
	}

			//Genera un codigo aleatorio irrepetible

public int generar_codigo(){
	contador_codigo = contador_codigo+1;
	this.codigo = contador_codigo;
	return contador_codigo;
	}

public static void comenzar(){
	contador_codigo = 10000;
	balance = 0.0;
	}


	//Muestra los datos en pantalla

public void Mostrar(){
	if(contador_codigo > 10000){

			C.outSln("Codigo: " + codigo);
			C.outSln("Vendedor: " + primer_nombre + " " + segundo_nombre + " " + primer_apellido + " " + segundo_apellido);
			C.outSln("Sueldo base: " + sueldo_base);
			C.outSln("Sueldo + comision: " +sueldo_base+ comision);

			//Imprimir los meses en forma de Fila
			C.separador();
			C.out("Meses: ");
			C.espacio(1);
			C.imprimir_fila(meses);
			C.separador();
			C.espacio(8);
			C.imprimir_fila(ventas_mensuales);
			C.endl(1);
			C.separador();
			C.out("Meses: ");
			C.espacio(1);
			C.imprimir_fila(meses,6);
			C.separador();
			C.espacio(8);
			C.imprimir_fila(ventas_mensuales, 6);
			C.endl(1);
			C.outS("Total anual: " + total_anual); C.espacio(70-13-((total_anual+"").length())-35);//Que locura ;)
			C.outSln("Comision: " + comision);
			C.endl(1);

		}
	else{

		}

	}//Mostrar



	//Calcula la comision dependiendo de las ventas anuales del vendedor;
public double calc_comision(){
		if(total_anual <= 1500000){
			return total_anual*(1.5/100);
		}
		if((total_anual > 1500000) || (total_anual <= 2150000)){
			return total_anual*(4.75/100);
		}
		if((total_anual > 2150000) || (total_anual <= 2900000)){
			return total_anual*(7.75/100);
		}
		if((total_anual > 2900000) || (total_anual <= 3350000)){
			return total_anual*(9.6/100);
		}
		if(total_anual > 3350000){
			return total_anual*(11.85/100);
		}
	return 0.0;
	}//calc_comision


		//Funciones para obtener las variables (get functions)

public final double get_comision(){
	return this.comision;
	}

public final int get_codigo(){
	return this.codigo;
	}

public final String get_primer_nombre(){
	return this.primer_nombre;
	}

public final String get_segundo_nombre(){
	return this.segundo_nombre;
	}

public final String get_primer_apellido(){
	return this.primer_apellido;
	}

public final String get_segundo_apellido(){
	return this.segundo_apellido;
	}//get_segundo_apellido

public final double get_sueldo_base(){
	return this.sueldo_base;
	}//get_sueldo_base

public final double[] get_ventas_mensuales(){
	return this.ventas_mensuales;
	}//get_ventas_mensuales

public final double get_total_anual(){
	return total_anual;
	}//get_total_anual

				//Funciones para guardar valores en las variables (set functions)

public void set_comision(double comision){
	System.out.println("Comision ingresada manualmente");
	this.comision = comision;
	}//set_comision

public void set_codigo(int cod){
	System.out.println("Codigo ingresado manualmente");
	this.codigo = cod;
	}//set_codigo

public void set_primer_nombre(String nombre){
	this.primer_nombre = nombre;
	}//set_primer_nombre

public void set_segundo_nombre(String nombre){
	this.segundo_nombre = nombre;
	}

public void set_primer_apellido(String apellido){
	this.primer_apellido = apellido;
	}

public void set_segundo_apellido(String apellido){
	this.segundo_apellido = apellido;
	}

public void set_sueldo_base(double sueldo){
	this.sueldo_base = sueldo;
	}

public void set_ventas_mensuales(double[] ven){
	if(ven.length == ventas_mensuales.length){
	try{
	this.ventas_mensuales = ven;
	}//try
	catch(Exception e){
		C.error();
		C.pausa();
		}//catch
	}//if
	else
	C.error("Los vectores no tienen las mismas direcciones");

	}

public void set_calc_total_anual(double[] ventas_mensuales){
	double total = 0.0;
			for(int i = 0;i<ventas_mensuales.length;i++)
				total += ventas_mensuales[i];
		this.total_anual = total;
	}

public void set_total_anual(double total){
	System.out.println("El total fue ingresado manualmente");
	this.total_anual = total;
	}

}//class
