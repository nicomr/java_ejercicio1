import java.util.Scanner;

public class Administrator extends Empleado {
	private double hs_extra;
	public double getHs_extra() {
		return hs_extra;
	}
	public void setHs_extra(double hs_extra) {
		this.hs_extra = hs_extra;
	}
	public double getHs_month() {
		return hs_month;
	}
	public void setHs_month(double hs_month) {
		this.hs_month = hs_month;
	}
	private double hs_month;
	
	public double getSueldo(){
		
		return getBase_salary()*((getHs_extra() * 1.5)+ getHs_month()) / getHs_month();
		
	}
	public void cargaDatos() {
		super.cargaDatos();
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresar horas extras");
		this.setHs_extra(Double.parseDouble(s.nextLine()));
		System.out.println("Ingresar horas del mes");
		this.setHs_month(Double.parseDouble(s.nextLine()));
		
	}

}
