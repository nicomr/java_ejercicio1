import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Empleado[] empleados = new Empleado[20];
		Administrator adm = new Administrator();
		Seller sell = new Seller();
		int op = 1, i=0, sel=0;
			
		
		while (op != 0 && i < empleados.length) {
			
			do {
			System.out.println("Ingrese 1 para Administrativo. \n Ingrese 2 para Vendedor");
			sel = Integer.parseInt(s.nextLine());
			} while (sel != 1 && sel != 2);
			if (sel==1) {
				adm.cargaDatos();
				empleados[i] = adm;
		
			}
			else {
				sell.cargaDatos();
				empleados[i] = sell;
				
			}
			i++;
			System.out.println("Ingrese 0 para terminar");
			op = Integer.parseInt(s.nextLine());
			
		}
		s.close();
		getList(empleados, i);
		

	}
	private static void getList(Empleado[] empleados, int i) {
		System.out.println("Listado de Empleados:\n" );
		for (int j = 0; j < i; j++) {
			System.out.println("DNI: " + empleados[j].getDni());
			System.out.println("Nombre: " + empleados[j].getName());
			System.out.println("Apellido: " + empleados[j].getLastname());
			System.out.println("Sueldo: " + empleados[j].getSueldo()+ "\n");
			
		}
	}

}
