class Student{
	
	String name;
	int marksEng;
	int marksMath;
	int marksSci;
	
	Student(String name, int marksEng, int marksMath, int marksSci){
		this.name=name;
		this.marksEng=marksEng;
		this.marksMath=marksMath;
		this.marksSci=marksSci;
	}

	float avgMarks(int a, int b,int c){
		return (a+b+c)/3;
	}

	void info(){
		int ans=marksEng+marksMath+marksSci;
		System.out.println(name+" "+ans);
	}

	public static void main(String[] args){
		Student s1=new Student("Somesh",50,60,70);
		float avg=s1.avgMarks(s1.marksEng, s1.marksMath, s1.marksSci);
		System.out.println("average of marks is:"+avg);
		s1.info(s1.name, s1.marksEng, s1.marksMath, s1.marksSci);
		
	}
}