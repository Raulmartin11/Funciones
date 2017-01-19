/**
 *
 * 
 */
import basico.Funciones;
import java.util.Scanner;
public class Prueba {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int m = S.nextInt();
		int x;
		x = basico.Funciones.digitoN(n,m);
		
		System.out.print(x);
		
	}
}
