package tester;
import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1=new Point2D();
	    p1.accept();
		Point2D p2=new Point2D();
        p2.accept();
		
		
		if(p1.isEqual(p2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("P1 point : ");
			System.out.println(p1.getDetails());
			System.out.println("P1 point : ");
			System.out.println(p2.getDetails());
			System.out.println(p1.calculateDistanced(p2)); 
		}
		
		
	
		
		

	}

}

