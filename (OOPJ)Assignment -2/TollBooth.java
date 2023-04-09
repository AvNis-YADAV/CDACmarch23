import java.util.Scanner;

public class TollBooth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		drivermanager d=new drivermanager();
			for(;;)
			{
				System.out.println ("1.Calculate toll fee 2.Generate bill 3.showMenu 4.Exit");
				switch(sc.nextInt())
				{
					case 1:d.calculateTollFee();
					break;
					case 2:d.generateBill();
						break;
					case 3:d.showMenu();
						break;
					case 4:System.exit(0);
				}
			}
	}
}
class drivermanager{
	Scanner sc=new Scanner(System.in);
	vehicle v=new vehicle();
	
	
	void calculateTollFee()
	{
		String veh=v.getVehicleType();
		if(veh==null)
		{
			System.out.println("Enter vehicle details first");
		}
		else
		{
		if(veh.equals("car")||veh.equals("van")||veh.equals("bus"))
		{
			double t=0.25*v.getDistanceTraveled()*v.getNumAxles();
			v.setTollFee(t);
			System.out.println("Total toll fee is $-"+v.getTollFee());
		}
		else if(v.getVehicleType().equals("truck"))
		{
			double t=0.50*v.getDistanceTraveled()*v.getNumAxles();
			v.setTollFee(t);
			System.out.println("Total toll fee is $-"+v.getTollFee());
		}
		}
	}
	void generateBill()
	{
		double tollc=v.getTollFee();
		if(tollc==0)
		{
			System.out.println("Enter vehicle details first");
		}
		else
		{
			double t=tollc+2;
			v.setTotalAmountDue(t);
			System.out.println("Vehicle type="+v.getVehicleType());
			System.out.println("Number of axles="+v.getNumAxles());
			System.out.println("Distance travelled="+v.getDistanceTraveled()+" miles");
			System.out.println("toll fee="+v.getTollFee()+"$");
			System.out.println("processing fee=2$");
			System.err.println("Total due amount is $-"+v.getTotalAmountDue());
		}
	}
	void showMenu()
	{
		for(;;) {
			System.out.println("1.Enter vehicle type (car, van, bus, or truck) 2.Enter number of axles ");
			System.out.println ("3.Enter distance travelled 4.Exit");
			switch(sc.nextInt())
		{
			case 1:v.setVehicleType(sc.next());
				break;
			case 2:v.setNumAxles(sc.nextInt());
				break;
			case 3:v.setDistanceTraveled(sc.nextDouble());
				break;
			case 4:return;
		}
		}
	}
}
class vehicle {
	String vehicleType;
	int numAxles;
	double distanceTraveled;
	private double tollFee;
	private double totalAmountDue;
		
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getNumAxles() {
		return numAxles;
	}
	public void setNumAxles(int numAxles) {
		this.numAxles = numAxles;
	}
	public double getDistanceTraveled() {
		return distanceTraveled;
	}
	public void setDistanceTraveled(double distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	public double getTollFee() {
		return tollFee;
	}
	public void setTollFee(double tollFee) {
		this.tollFee = tollFee;
	}
	public double getTotalAmountDue() {
		return totalAmountDue;
	}
	public void setTotalAmountDue(double totalAmountDue) {
		this.totalAmountDue = totalAmountDue;
	}
	
}
