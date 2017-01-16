/**
 * 
 * 
 * @author Raul Martin
 */
 
 package basico;
 
public class Funciones {
	
	/**
	 * Devuelve la cantidad de digitos de un numero
	 * @param x un numero entero positivo
	 * @return la cantidad de digitos que tiene un numero
	 */
	 public static int digitos(int x) {
		 
		 int i;
		 
		 if(x == 0) {
			 return 1;
		 }
		 
		 for(i = 0; x > 0; i++) {
			 x = x / 10;
		 }
		 return i;
	 }
	/**
	 * Voltea un numero
	 * @param x un numero entero positivo
	 * @return el numero volteado
	 */
	 public static int volteado(int x) {
		 int n;
		 int volteado = 0;
		 for(n = 0; x > 0; n++) {
			 volteado = volteado + (x % 10);
			 x = x / 10;
			 if(x > 0) {
				volteado = volteado * 10;
			}
		 }
		 return volteado;
	 }
	 	/**
	 * Voltea un numero en long
	 * @param x un numero entero positivo
	 * @return el numero volteado
	 */
	 public static long volteadoLong(long x) {
		 int n;
		 long volteado = 0;
		 for(n = 0; x > 0; n++) {
			 volteado = volteado + (x % 10);
			 x = x / 10;
			 if(x > 0) {
				volteado = volteado * 10;
			}
		 }
		 return volteado;
	 }
	 /**
	  * Devuelve un booleano true si el numero es capicua y false si no lo es
	  * @param x un numero entero positivo
	  * @return boolean indicando si es capicua o no
	  */
	  public static boolean esCapicua(int x) {
			boolean capicua = false;
			int nVolteado = volteado(x);
			if(x == nVolteado) {
				capicua = true;
			}
			return capicua;
		}
		/**
		 * Devuelve un booleano true si el numero es primo y false si no lo es
		 * @param x un numero entero positivo
		 * @return boolean indicando si es primo o no
		 */
		public static boolean esPrimo(int x) {
			boolean primo = true;
			int n = 2;
			for(n = 2; n < x; n++) {
				if(x % n == 0) {
					primo = false;
				}
			}
			return primo;
		}
		/**
		 * Devuelve el menor primo que es mayor al número que se pasa como parámetro
		 * @param x un numero entero positivo
		 * @return el siguiente numero primo al numero introducido
		 */
		 public static int siguientePrimo(int x) {
			 int n = x + 1;
			 boolean primo = false;
			 while(primo == false) {
				 primo = esPrimo(n);
				 n++;
			}
			return n - 1;
		}
		/**
		 * Con una base y un exponente devuelve la potencia
		 * @param x un numero entero positivo y z un numero entero positivo
		 * @return la potencia de la base elevada al exponente
		 */
		public static int potencia(int x,int z) {
			int i = 0;
			int total = 1;
			for(i = 0; i < z;i++) {
				total *= x;
			}
			return total;
		}
		/**
		 * Le quita a un número n dígitos por detrás
		 * @param x, z numeros enteros positivos
		 * @return el numero con z digitos menos
		 */
		public static long quitaPorDetras(long x, int z) {
		 int n;
		 for(n = 0; n < z; n++) {
			 x = x / 10;
		 }
		 return x;
	 }
	 /**
	  * Le quita a un número n dígitos por delante
	  * @param x, z numeros enteros positivos
	  * @return el numero con z digitos menos
	  */
	  public static long quitaPorDelante(long x, int z) {
			long vuelta = volteadoLong(x);
			long XmenosZVolteado = quitaPorDetras(vuelta, z);
			long XmenosZ = volteadoLong(XmenosZVolteado);
			return XmenosZ;
		}
		/**
		 * Añade un dígito a un número por detrás.
		 * @param x, z numeros enteros positivos
		 * @return un numero con un digito detras
		 */
		 public static int pegaPorDetras(int x, int z) {
			 int masDigito = (x * 10) + z;
			 return masDigito;
		 }
		 /**
		 * Añade un dígito a un número por detrás.
		 * @param x, z numeros enteros positivos
		 * @return un numero con un digito detras
		 */
		 public static int pegaPorDelante(int x, int z) {
			 int voltereta = volteado(x);
			 int masDigitoVolteado = pegaPorDetras(voltereta, z);
			 int masDigito = volteado(masDigitoVolteado);
			 return masDigito;
		 }
	}
