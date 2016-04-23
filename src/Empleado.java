import java.util.Scanner;

public  abstract class Empleado {
	private int dni;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBase_salary() {
		return base_salary;
	}
	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}
	private String name;
	private String lastname;
	private String email;
	private double base_salary;
    
	
	public void cargaDatos() {
		Scanner s = new Scanner(System.in);
		int dni= 0;
		String name= "", lastname="", email="";
		double base_salary=0;
		System.out.println("Ingrese DNI");
		dni = Integer.parseInt(s.nextLine());
		this.setDni(dni);
		System.out.println("Ingrese Nombre");
		name = s.nextLine();
		this.setName(name);
		System.out.println("Ingrese Apellido");
		lastname = s.nextLine();
		this.setLastname(lastname);
		System.out.println("Ingrese mail");
		email = s.nextLine();
		this.setEmail(email);
		System.out.println("Ingrese Salario base");
		base_salary = Double.parseDouble(s.nextLine());
		this.setBase_salary(base_salary);
		//s.close();
		
	}
	public abstract double getSueldo();

}
