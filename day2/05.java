class Person{

	int age;
	float height;
	float weight;
		
	Person(){
		age=22;
		height=5.9f;
		weight=74.4f;
	}

	Person(int age, float height, float weight){
		this.age=age;
		this.height=height;
		this.weight=weight;
	}

	void details(int a, float b, float c){
		System.out.println("the age is:"+a);
		System.out.println("the heaight is:"+b);
		System.out.println("the weight is:"+c);
	}

	public static void main(String[] args){
		Person p1=new Person();
		p1.details(p1.age,p1.height,p1.weight);
		
		Person p2=new Person(20,6.1f,75.6f);
		p2.details(p2.age,p2.height,p2.weight);
	}
}