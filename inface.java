package practice;

interface MyInterface {
	public void show();
	public void display();
}

public class inface implements MyInterface {

	
	@Override
	public void show() {
		System.out.println("in show mtd of interface");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("in display mtd of interface");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m=new inface();
		m.show();
		m.display();
	}


}
