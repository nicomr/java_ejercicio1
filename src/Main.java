package entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList <Empleado> empleados = new ArrayList <Empleado>();
		Administrator adm = new Administrator();
		Seller sell = new Seller();
		int op = 1, sel=0;


		while (op != 0) {

			do {
			System.out.println("Ingrese 1 para Administrativo. \n Ingrese 2 para Vendedor");
			sel = Integer.parseInt(s.nextLine());
			} while (sel != 1 && sel != 2);
			if (sel==1) {
				adm.cargaDatos();
				empleados.add(adm);

			}
			else {
				sell.cargaDatos();
				empleados.add(sell);

			}
			System.out.println("Ingrese 0 para terminar");
			op = Integer.parseInt(s.nextLine());

		}
		s.close();
		getList(empleados);


	}
	private static void getList(ArrayList<Empleado> empleados) {
		System.out.println("Listado de Empleados: \n");
		for (Empleado e: empleados) {
			System.out.println("DNI: " + e.getDni());
			System.out.println("Nombre: " + e.getName());
			System.out.println("Apellido: " + e.getLastname());
			System.out.println("Sueldo: " + e.getSueldo() + "\n");

		}
	}

}
