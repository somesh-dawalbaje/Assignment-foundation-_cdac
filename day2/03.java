class Box{
	
	float height;
	float width;
	float breadth;

	Box(float height, float width, float breadth){
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}

	float getVolume(float a,float b,float c){
		return a*b*c;
	}	
	
	float getArea(float a,float b){
		return a*b;
	}

	public static void main(String[] args){
		Box b1=new Box(10.1f,20.2f,30.3f);
		float volume=b1.getVolume(b1.height,b1.width,b1.breadth);
		float area=b1.getArea(b1.width,b1.breadth);
		System.out.println("the volume of b1 is:"+volume);
		System.out.println("the area of b1 is:"+area);

		Box b2=new Box(50.5f,40.4f,70.7f);
		float volume1=b2.getVolume(b2.height,b2.width,b2.breadth);
		float area1=b2.getArea(b2.width,b2.breadth);
		System.out.println("the volume of b2 is:"+volume1);
		System.out.println("the area of b2 is:"+area1);
	}
}