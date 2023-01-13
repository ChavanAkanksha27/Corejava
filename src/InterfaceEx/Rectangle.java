package InterfaceEx;

public class Rectangle implements Polygon {

	@Override
	public Void getArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("The area of the rectangle " +(length + breadth));
		return null;
		
	}

}
