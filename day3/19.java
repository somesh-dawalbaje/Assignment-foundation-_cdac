class Demo{
	public static void main(String[] args){
		
        	int number;

        	for (;;) {
            		System.out.println("Enter a number (0 to exit): ");
            		number = 0;

            		if (number == 0)
                	break;
            

            		System.out.println("You entered: " + number);
        	}

        	System.out.println("Program exited");
	}
}