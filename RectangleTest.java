class Rectangle{
	private double length;
	private double breadth;
	public Rectangle(){
		length=1;
		breadth=1;
	}
	public Rectangle(double l,double b){
		length=l;
		breadth=b;
	}
	
	public double area(){
		return  length*breadth;
	}
	public double perimeter(){
		return 2*(length+breadth);
	}
}
class RectangleTest{
	public static void main(String[] args){
		Rectangle r1=new Rectangle(2,2);
		System.out.println("Area :"+r1.area());
		System.out.println("Perimeter :"+r1.perimeter());
	}
}