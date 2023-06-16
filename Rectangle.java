class Rectangle{
	int length = 0;
	int breadth = 0;
	Rectangle()
	{
	this.length = 0;
	this.breadth = 0;
	}
	Rectangle(int length, int breadth)
	{
	this.length = length;
	this.breadth = breadth;
	}
	Rectangle(int length)
	{
	this.length = length;
	this.breadth = length;
	}
	public int Area()
	{
	return length*breadth;
	}
	public static void main(String args[])
	{
	Rectangle obj1 = new Rectangle();
	System.out.println("Area witn no parameter:"+obj1.Area());
	Rectangle obj2 = new Rectangle(20,30);
	System.out.println("Area witn two parameter:"+obj2.Area());
	Rectangle obj3 = new Rectangle(30);
	System.out.println("Area witn one parameter:"+obj3.Area());
	}
}