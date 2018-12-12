package Coords;

import java.lang.reflect.Array;
import java.util.Arrays;

import Geom.Point3D;

public class tttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyCoords m=new MyCoords();
Point3D p1 = new Point3D(32.103315,35.209039,670);

Point3D p2 = new Point3D(32.106352,35.205225,650);

m.azimuth_elevation_dist(p1, p2);
System.out.println(Arrays.toString(m.azimuth_elevation_dist(p1, p2)));
	}

}
