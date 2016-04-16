import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Empleado[] empleados = new Empleado[20];
		Administrator adm = new Administrator();
		int op = 1, i=0, sel=0;
			
		Scanner s = new Scanner(System.in);
		while (op != 0 && i < empleados.length) {
			
			do {
			System.out.println("Ingrese 1 para Administrativo. \n Ingrese 2 para Vendedor");
			s.nextInt(sel);
			} while (sel== 1 || sel==2);
			if (sel==1) {
				
				
				
				
			}
			else if (sel ==2) {
				
			}
			i++;
			System.out.println("Ingrese 0 para terminar");
			s.nextInt(op);
			
		}
		

	}

}
