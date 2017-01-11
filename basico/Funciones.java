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
 }
		 
