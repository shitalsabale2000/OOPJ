import java.util.Scanner;
class TemperatureSensor{
            private int temperature;
	public void setTemperature(int t){
	if(t >= 0 && t <= 100){
	  this.temperature = t;
	  }
	 else{
	 System.out.println("Invalid temperature");
	 }
	 }
	 
	 public int getTemperature(){
	   return temperature;
	}
}
public class TemperatureQ5{
public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
		 TemperatureSensor t = new  TemperatureSensor();
		
		System.out.println("Enter the temperature");
		int inttemp = sc.nextInt();
		
		t.setTemperature(inttemp);
		if (inttemp >= 0 && inttemp <= 100){
		System.out.println("temperature" + t.getTemperature());
      }
	  sc.close();
      }
}
