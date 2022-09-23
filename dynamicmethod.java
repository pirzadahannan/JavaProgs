class apple{
	void display(){
	System.out.println("Apple");}
}

class hanan extends apple{
	void display(){
	System.out.println("Hanan");
}
}

class younis extends hanan{
	void display(){
	System.out.println("Younis");}
}

class dynamicmethod{
	public static void main (String ar[])
	{
		apple a=new apple();
		hanan b=new hanan();
		younis c=new younis();
		
		apple ref;
		ref=a;
		ref.display();
		
		
		ref=b;
		ref.display();
		
		
		ref=c;
		ref.display();
	}
}