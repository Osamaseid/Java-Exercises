//interface example lab exercise
public interface Polygon {
	
	void getArea();
//default method
	default void getsides() {
		System.out.println("i can get the sides");
	}
}
//implement the interface
class Rectangle implements Polygon{
	public void getArea() {
		int length =5;
		int width =5;
		int area = length* width;
		System.out.println("the area of the rectangle is"+ area);
	}

//overrides the getsides
public void getsides() {
	System.out.println("i have 4 sides");
}
}
//implement the interface
class Square implements Polygon{
	
	public void getArea() {
		int length = 5;
		int area = length *length;
		System.out.println("the area of sqare is"+ area);
		
	
	}
} 
 class  Main{
	 
	 public static void main(String[]  args) {
		 //creat an object of rectangle;
		 Rectangle r1 = new Rectangle();
		 r1.getArea();
		 r1.getsides();
		 
		 //creat an object of square
		 Square s1 = new Square();
		 s1.getArea();
		 s1.getsides();
		 
	 }
 }

