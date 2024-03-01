class Room{
	
	float height;
	float width;
	float breadth;
	
	Room(float a,float b,float c){
		height=a;
		width=b;
		breadth=c;
	}
	float volume(float a, float b, float c){
		return a*b*c;
	}	
	
	public static void main(String[] args){
		Room r1=new Room(10.5f,20.2f,30.3f);
		System.out.println(r1.volume(r1.height,r1.width,r1.breadth));
	}
}