class Vehicle{
	
	long price;
	String color;
	String model;
	
	Vehicle(long price, String color, String model){
		this.price=price;
		this.color=color;
		this.model=model;
	}

	void details(long price, String color, String model){
		System.out.println("price of car is:"+price);
		System.out.println("color of car is:"+color);
		System.out.println("model of car is:"+model);
	}
	
	public static void main(String[] args){
		Vehicle v1=new Vehicle(5000000,"black","SUV");
		v1.details(v1.price,v1.color,v1.model);
	}
}