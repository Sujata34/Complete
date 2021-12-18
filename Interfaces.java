package inface;
interface myInterface
{
	public void show();
	public void display();
}
public class Interfaces implements myInterface {

	@Override
	public void show() {		
		System.out.println("in show method");		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("in display method ");		// TODO Auto-generated method stub
	}
	public static void main(String []nhsgd)
	{
		myInterface i =new Interfaces();
		i.show();
		i.display();
	}
	

}
