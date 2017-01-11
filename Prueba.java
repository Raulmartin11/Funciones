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
		int x;
		
		x = basico.Funciones.volteado(n);
		
		System.out.print(x);
		
	}
}
