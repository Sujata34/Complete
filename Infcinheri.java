package inface;
// interface with inheritance 
interface pclaass {
	public void show();
}
interface cclass extends pclaass
{	
	int a=8,b=6;
	int c=a+b;
	public void display();
}

public class Infcinheri implements cclass {
	int a=10;
	@Override
	public void show() {
		System.out.println("show mtd from paranet class");// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(c);
		System.out.println("display mtd from child class");// TODO Auto-generated method stub
		
	}
	public static void main(String []hsgd)
	{
		cclass c= new Infcinheri();
		c.show();
		c.display();
	}

}
