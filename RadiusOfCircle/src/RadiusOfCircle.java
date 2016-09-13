import java.io.*;
import java.util.*;
import java.math.*;

public class RadiusOfCircle {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is the area?_");
		double a = kbReader.nextDouble();
		double r = Math.sqrt(a / Math.PI);
		System.out.println("The radius of the circle is:\n" + r);
		
	}

}
