public class C{

//Limpia pantalla agregando varias lineas
public static void cls(){
	for(int i = 0;i < 30;i++)
	System.out.println("\n");
}

public static void espacio_atras(int a){
	for(int i = 0;i <a;i++){
		System.out.print(bespacio());
		}//for
	}//espacio_atras

public static String bespacio(){
			return "\b";
	}

//Agrega una sangria al texto
public static void outS(String msg){
	espacio(10);
	System.out.print(msg);
	}//outSang

public static void outSln(String msg){
	espacio(10);

	System.out.println(msg);
	}//outSang

//Muestra el mensaje en el centro de la pantalla
public static void outCen(String mensaje){
	//Total de carateres de margen a margen 80
	if ((mensaje.charAt(0)==' ') || (mensaje.endsWith(" ")))
		mensaje = mensaje.trim();
	int margen = (40-(mensaje.length()/2));
	espacio(margen);
	System.out.print(mensaje);

}

public static void outCenln(String mensaje){
	//Total de carateres de margen a margen 80
	if ((mensaje.charAt(0)==' ')|| (mensaje.endsWith(" ")))
		mensaje = mensaje.trim();
	int margen = (40-(mensaje.length()/2));
	espacio(margen);
	System.out.println(mensaje);

}

//Imprime un separador
public static void separador(){
	for(int i = 0;i<80;i++)
	System.out.print("-");
	endl(1);
}

//Imprime el mensaje
public static void outln(String mensaje){
	System.out.println(mensaje);
}

public static void espacio(int n){
	for(int i = 0;i<n ;i++)
	System.out.print(" ");
}

//Imprime el mensaje
public static void out(String mensaje){
	System.out.print(mensaje);
}

public static void out(int mensaje){
	System.out.print(mensaje);
}

public static void out(double mensaje){
	System.out.print(mensaje);
}

public static void out(short mensaje){
	System.out.print(mensaje);
}

public static void out(long mensaje){
	System.out.print(mensaje);
}

public static void out(byte mensaje){
	System.out.print(mensaje);
}


//Agrega tantas lineas como lo indique n
public static void endl(int n){
	for(int i = 0;i < n;i++)
	System.out.print("\n");
}

public static void error(String errorMsg){
	endl(1);
	System.out.println("E\tR\tR\tO\tR");
	System.out.println("DESCRIPCION: " + errorMsg);
	C.endl(1);
	System.out.println("PRESIONE ENTER PARA CONTINUAR");
	KbInput.read();
}

public static void errorCen(String errorMsg){
	endl(1);
	C.espacio(24);
	C.outln("E\tR\tR\tO\tR");
	C.outCenln("DESCRIPCION: " + errorMsg);
	C.endl(1);
	C.outCenln("PRESIONE ENTER PARA CONTINUAR");
	KbInput.read();
}

public static void error(){
	endl(1);
	C.espacio(24);
	System.out.println("E\tR\tR\tO\tR");
	C.outCenln("PRESIONE ENTER PARA CONTINUAR");
	KbInput.read();
}

public static void pausa(String msg){
	C.endl(1);
	C.outCenln(msg);
	KbInput.read();
}

public static void pausa(){
	C.endl(1);
	KbInput.read();
}

	//Imprime Strings de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

public static  void imprimir_fila(String[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					C.out(vec[i]);
					if(i < 6){
					C.espacio(12-((vec[i]).length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								C.out(vec[i]);
								if(i < vec.length){
								C.espacio(12-((vec[i]).length()));
							}//if
				}//for
			}//else
		}//imprimir

		//Empieza el vector desde la posicion i

public static  void imprimir_fila(String[] vec, int i){

			for (; i < vec.length;i++){
								C.out(vec[i]);
								if(i < vec.length){
								C.espacio(12-((vec[i]).length()));
							}//if
				}//for
		}//imprimir

	//Imprime Integers de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

public static  void imprimir_fila(int[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					C.out(vec[i]);
					if(i < 6){
					C.espacio(12-((vec[i]+"").length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								C.out(vec[i]);
								if(i < vec.length){
								C.espacio(12-((vec[i]+"").length()));
							}//if
				}//for
			}//else
		}//imprimir

	//Imprime Doubles de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

public static  void imprimir_fila(double[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					C.out(vec[i]);
					if(i < 6){
					C.espacio(12-((vec[i]+"").length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								C.out(vec[i]);
								if(i < vec.length){
								C.espacio(12-((vec[i]+"").length()));
							}//if
				}//for
			}
		}

		//Empieza el vector desde la posicion i

		public static  void imprimir_fila(double[] vec, int i){

					for (; i < vec.length;i++){
										C.out(vec[i]);
										if(i < vec.length){
										C.espacio(12-((vec[i]+"").length()));
									}//if
						}//for
		}//imprimir

		public static  void imprimir_fila(int[] vec, int i){

							for (; i < vec.length;i++){
												C.out(vec[i]);
												if(i < vec.length){
												C.espacio(12-((vec[i]+"").length()));
											}//if
								}//for
		}//imprimir

								//SENTENCIAS DE LECTURA


	public static double in_double(){
		double a = 0.0;
		boolean err = false;
		do{
		try {
			a = Double.parseDouble(KbInput.read());
			err = false;
		}//try
		catch(Exception e){
				error();
				err = true;
			}//catch
		}while(err);
		return a;
	}

	public static double in_double(String msg){
		double a = 0.0;
		boolean err = false;
		do{
		try {
			C.outS(msg);
			a = Double.parseDouble(KbInput.read());
			err = false;
		}//try
		catch(Exception e){
				error();
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_double

	public static int in_int(String msg){
		int a = 0;
			boolean err = false;
			do{
			try {
				C.outS(msg);
				a = Integer.parseInt(KbInput.read());
				err = false;
			}//try
			catch(Exception e){
					error();
					err = true;
				}//catch
			}while(err);

		return a;
	}//in_int

	public static int in_int(){
			int a = 0;
				boolean err = false;
				do{
				try {
					a = Integer.parseInt(KbInput.read());
					err = false;
				}//try
				catch(Exception e){
						error();
						err = true;
					}//catch
				}while(err);

			return a;
	}//in_int

	public static short in_short(String msg){
			short a = 0;
				boolean err = false;
				do{
				try {
					C.outS(msg);
					a = Short.parseShort(KbInput.read());
					err = false;
				}//try
				catch(Exception e){
						error();
						err = true;
					}//catch
				}while(err);

			return a;
	}//in_short


		public static short in_short(){
				short a = 0;
					boolean err = false;
					do{
					try {
						a = Short.parseShort(KbInput.read());
						err = false;
					}//try
					catch(Exception e){
							error();
							err = true;
						}//catch
					}while(err);

				return a;
	}//in_short

	public static byte in_byte(String msg){
			byte a = 0;
				boolean err = false;
				do{
				try {
					C.outS(msg);
					a = Byte.parseByte(KbInput.read());
					err = false;
				}//try
				catch(NumberFormatException e1){
						error("Error en el formato del numero");
						err = true;
					}
					catch(Exception e2){
							error();
							err = true;
					}
				}while(err);

			return a;
	}//in_byte

	public static byte in_byte(){
			byte a = 0;
				boolean err = false;
				do{
				try {
					a = Byte.parseByte(KbInput.read());
					err = false;
				}//try
				catch(Exception e){
						error();
						err = true;
					}//catch
				}while(err);

			return a;
	}//in_byte

	public static long in_long(String msg){
				long a = 0;
					boolean err = false;
					do{
					try {
						C.outS(msg);
						a = Long.parseLong(KbInput.read());
						err = false;
					}//try
					catch(Exception e){
							error();
							err = true;
						}//catch
					}while(err);

				return a;
	}//in_long

		public static long in_long(){
					long a = 0;
						boolean err = false;
						do{
						try {
							a = Long.parseLong(KbInput.read());
							err = false;
						}//try
						catch(Exception e){
								error();
								err = true;
							}//catch
						}while(err);

					return a;
	}//in_long

	public static String in_String(String msg){
				String a = null;
					boolean err = false;
					do{
					try {
						C.outS(msg);
						a = (KbInput.read());
						err = false;
					}//try
					catch(Exception e){
							error();
							err = true;
						}//catch
					}while(err);

				return a;
	}//in_String

	public static String in_String(){
					String a = null;
						boolean err = false;
						do{
						try {
							a = (KbInput.read());
							err = false;
						}//try
						catch(Exception e){
								error();
								err = true;
							}//catch
						}while(err);

					return a;
	}//in_String

							//LEER VECTORES
					//Los vectores tienen que estar incializado, es decir, deben de tener un tamaño prestablecido
					//String elemento: es el objeto abstracto del que esta hecho el objeto, es decir, si el vector guarda sueldos, o trabajadores, etc


	public static void in_vector (int[] vec, String elemento){
		for(int i = 0;i < vec.length;i++){
			C.in_int(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

	public static void in_vector (double[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				C.in_double(elemento + " " + (i+1) + ": ");
				}//for
		}//in_vector

	public static void in_vector (short[] vec, String elemento){
				for(int i = 0;i < vec.length;i++){
					C.in_short(elemento + " " + (i+1) + ": ");
					}//for
		}//in_vector

	public static void in_vector (long[] vec, String elemento){
				for(int i = 0;i < vec.length;i++){
					C.in_long(elemento + " " + (i+1) + ": ");
				}//for
		}//in_vector

	public static void in_vector (byte[] vec, String elemento){
					for(int i = 0;i < vec.length;i++){
						C.in_byte(elemento + " " + (i+1) + ": ");
					}//for
		}//in_vector



						//VALIDACIONES PARA POSITIVOS


	public static int unsigned (int a){
		while (a < 0){
			a = in_int("Por favor, ingrese un numero positivo: ");
			endl(1);
			}//while
			return a;
		}//unsigned

	public static double unsigned (double a){
		while (a < 0){
			a = in_double("Por favor, ingrese un numero positivo: ");
			endl(1);
			}//while
			return a;
		}//unsigned

	public static byte unsigned (byte a){
		while (a < 0){
			a = in_byte("Por favor, ingrese un numero positivo: ");
			endl(1);
			}//while
			return a;
		}//unsigned

	public static short unsigned (short a){
		while (a < 0){
			a = in_short("Por favor, ingrese un numero positivo: ");
			endl(1);
			}//while
			return a;
		}//unsigned

	public static long unsigned (long a){
		while (a < 0){
			a = in_long("Por favor, ingrese un numero positivo: ");
			endl(1);

			}//while

	return a;
	}//unsigned

				//Validar que sean solo letras

	public static String solo_letras(String a){

		boolean numero = false;
		do{
			if(a.length() == 0){
							numero = false;
				}//if
		for(int i = 0; i< a.length();i++){
			switch(a.charAt(i)){
				case '0': numero = true; break;
				case '1': numero = true;break;
				case '2': numero = true;break;
				case '3': numero = true;break;
				case '4': numero = true;break;
				case '5': numero = true;break;
				case '6': numero = true;break;
				case '7': numero = true;break;
				case '8': numero = true;break;
				case '9': numero = true;break;
				default: numero = false;break;
				}//switch
			}//for
		if(numero){
			a = in_String("Por favor ingrese solo letras: ");
		}//if
		}while ( numero);



	return a;
		}//solo_letras




}//class
