package entidades;
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
		System.out.println("Ingrese DNI");
		this.setDni(Integer.parseInt(s.nextLine()));
		System.out.println("Ingrese Nombre");
		this.setName(s.nextLine());
		System.out.println("Ingrese Apellido");
		this.setLastname(s.nextLine());
		System.out.println("Ingrese mail");
		this.setEmail(s.nextLine());
		System.out.println("Ingrese Salario base");
		this.setBase_salary(Double.parseDouble(s.nextLine()));
		
	}
	public abstract double getSueldo();

}
