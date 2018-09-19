package CarHW;
public class CarApp  {
// App is the entry point to our application
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCarModel("Malibu");
		c1.setCarMPG("35");
		c1.setCarMilage("500000");
		c1.setCarOwner("Jon");
		
		Car c2 = new Car();
		c2.setCarModel("Prius");
		c2.setCarMPG("40");
		c2.setCarMilage("10000");
		c2.setCarOwner("Bill");
		
		Car c3 = new Car();
		c3.setCarModel("Jetta");
		c3.setCarMPG("25");
		c3.setCarMilage("100000");
		c3.setCarOwner("Bob");
		
		System.out.println(c1.getCarModel());
		System.out.println(c2.getCarOwner());
		System.out.println(c3.getCarMilage());
	}
}