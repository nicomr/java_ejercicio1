import java.util.Scanner;

public class Seller extends Empleado {
	private double perc_com;
	public double getPerc_com() {
		return perc_com;
	}
	public void setPerc_com(double perc_com) {
		this.perc_com = perc_com;
	}
	public double getTotal_sell() {
		return total_sell;
	}
	public void setTotal_sell(double total_sell) {
		this.total_sell = total_sell;
	}
	private double total_sell;
	
	public double getSueldo(){
		
		return getBase_salary() + (getPerc_com() * getTotal_sell() /100);
		
	}
	public void cargaDatos() {
		super.cargaDatos();
	    Scanner s = new Scanner(System.in);
	    System.out.println("ingrese porcentaje comision");
	    perc_com = Double.parseDouble(s.nextLine());
	    this.setPerc_com(perc_com);
	    System.out.println("ingrese total ventas");
	    total_sell = Double.parseDouble(s.nextLine());
	    this.setTotal_sell(total_sell);
//	    s.close();
	    
	}
	

}
