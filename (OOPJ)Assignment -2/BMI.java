class BMICalculator
{
  
    private double height;
    private double weight;

   public  void BMICalculator()
    {
        this.height=0;
        this.weight=0;
    }
    
   
    public void setHeight(double height)
    {
         this.height=height;
    }
    public void setWeight(double weight)
    {
         this.weight=weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getWeight()
    {
        return this.weight;
    }



    public double calculateBMI()
    {
         return (this.weight / (this.height * this.height));
    }

   
}

class BMI{
    public static void main(String[] args)
   {
    BMICalculator bmi=new BMICalculator();
    bmi.setHeight(5.11);
    bmi.setWeight(70.5);
    System.out.println("Height: "+bmi.getHeight()+" Weight: "+bmi.getWeight());
    double bmi1= bmi.calculateBMI();
    System.out.println("Body Mass Index: "+bmi1);
   }
}