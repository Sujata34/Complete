// constructor 

class s                         
{
  public s(int a, int b)
 {
	System.out.println("constructor="+a +", "+b);
 }
 public s(int c, String d)
{	
	this(23,67);
        System.out.println("constructor="+c + " , " +d);
}
  public s()
	{
	  this(120,"sujata");
	  System.out.println("default constructor=");
	}
public static void main(String args[])
{
  s s1=new s();
}
}