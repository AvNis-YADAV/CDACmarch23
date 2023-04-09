import java.util.Scanner;
class ElectricityBill
{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
     
     ElectricityBill()
     {
        this.customerName=null;
        this.unitsConsumed=0.0;
        this.billAmount=0.0;
     }

     public void setCustomerName(String customerName){
        this.customerName=customerName;
     }
      public void setUnitConsumed(double unitsConsumed){
        this.unitsConsumed=unitsConsumed;
     }
     

     public String getCustomerName()
     {
        return this.customerName;
     }
     
     public double getUnitConsumed()
     {
        return this.unitsConsumed;
     }
     public double getBillAmount()
     {
        return this.billAmount;
     }

    public double calculateBillAmount()
    {
        if(unitsConsumed<=100){
            this.billAmount=5*unitsConsumed;
            }
            else if(unitsConsumed>100 && unitsConsumed<=200){
            this.billAmount=7*unitsConsumed;
            }
            else if(unitsConsumed>200){
            this.billAmount=10*unitsConsumed;
            }
            return this.billAmount;
    }
}
class ElectricityBillCalculation{
    public static void main(String[] args)
    {    Scanner sc = new Scanner(System.in);
        ElectricityBill eb=new ElectricityBill();
        System.out.print("Enter Customer Name: ");
        eb.setCustomerName(sc.nextLine());
        System.out.print("Enter amount of Electricity Unit consumed: ");
        eb.setUnitConsumed(sc.nextDouble());

       double bill= eb.calculateBillAmount();
       System.out.print(eb.getCustomerName()+ " your total bill amount based on the number of units consumed: "+eb.calculateBillAmount());


    }
}
