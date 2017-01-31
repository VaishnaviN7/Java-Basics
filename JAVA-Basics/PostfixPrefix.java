class PostfixPrefix
{
	public static void main(String[] ar)

	{
	int a,b;
	int i=5;
	
  	a=i++;
	b=++i;

	//a=++i;
	//b=i++;
	

	
	System.out.println("Postfix value is " +a);
	System.out.println("Prefix value is " +b);

	}
}