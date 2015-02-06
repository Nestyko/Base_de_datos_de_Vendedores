public class Vendedor{

	private static int cant_vendedores;
	private static double balance;

	private double comision;
	private int codigo;
	private String primer_nombre,segundo_nombre,primer_apellido, segundo_apellido;
	private double sueldo_base;
	private double[] ventas_mensuales = new double[12];
	private double total_anual;

		//Constructor Default
	public Vendedor(){
		comision = 0.0;
		codigo = 0;
		primer_nombre = null;
		segundo_nombre = null;
		primer_apellido = null;
		segundo_apellido = null;
		sueldo_base = 0.0;
		ventas_mensuales = inicializar_vector(ventas_mensuales);
		total_anual = 0.0;
		cant_vendedores++;
		}//Default

		//Constructor con todas las variables
	public Vendedor(double comision, int codigo, String primer,
	String segundo, String primer_a, String segundo_a, double sueldo, double[] ven_men, double total){
		this.comision = comision;
		this.codigo = codigo;
		this.primer_nombre = primer;
		this.segundo_nombre = segundo;
		this.primer_apellido = primer_a;
		this.segundo_apellido = segundo_a;
		this.sueldo_base = sueldo;
		this.ventas_mensuales = ven_men;
		this.total_anual = total;

		cant_vendedores++;

		}// TODAS LAS VARIABLES

	public Vendedor(double comision, String primer,
		String segundo, String primer_a, String segundo_a, double sueldo, double[] ven_men, double total){
			this.comision = comision;
			this.codigo = generar_codigo();
			this.primer_nombre = primer;
			this.segundo_nombre = segundo;
			this.primer_apellido = primer_a;
			this.segundo_apellido = segundo_a;
			this.sueldo_base = sueldo;
			this.ventas_mensuales = ven_men;
			this.total_anual = total;

			cant_vendedores++;

		}// TODAS LAS VARIABLES


	//Coloca en todas las posiciones del vector el valor de 0.0

public double[] inicializar_vector(double[] vec){
	for (int i = 0; i < vec.length;i++)
		vec[i]=0.0;
		return vec;
	}

			//Genera un codigo aleatorio

public int generar_codigo(){
	return 0;
	}

public static void comenzar(){
	cant_vendedores = 0;
	balance = 0.0;
	}


	//Calcula la comision dependiendo de las ventas anuales del vendedor;
public double clac_comision(){

	return 0;
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
	this.comision = comision;
	}//set_comision

public void set_codigo(int cod){
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
	this.ventas_mensuales = ven;
	}

public void set_total_anual(double total){
	this.total_anual = total;
	}

}//class