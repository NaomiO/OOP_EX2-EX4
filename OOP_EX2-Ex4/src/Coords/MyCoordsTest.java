package Coords;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Geom.Point3D;


class MYCoordsTest 
{
 /*Vector*/
	@Test
	void VectorTest() {
		
		MyCoords m = new MyCoords();

		Point3D p1 = new Point3D(32.103315,35.209039,670);

		Point3D p2 = new Point3D(32.106352,35.205225,650);

		Point3D act = m.vector3D( p1, p2);
		
		double tx= (int)(act.x()*1000000);
		
		double ty= (int)(act.y()*1000000);
		
		double tz= (int)(act.z()*1000000);
		
		tx = tx / 1000000;
		
		ty = ty / 1000000;
		
		tz = tz / 1000000;
		
		Point3D result = new Point3D(337.698992,-359.249206,-20);
		
		assertEquals( result.toString() , new Point3D(tx,ty,tz).toString());
	}

//******************************************************************************
	/*Add*/
	@Test
	void Add()
	{
		
		MyCoords m = new MyCoords();
		
		Point3D p = new Point3D(32.103315,35.209039,670);
		
		System.out.println(p);
		
		Point3D v = new Point3D(337.698992,-359.249206,-20);
		
		System.out.println(v);
		
		Point3D result = new Point3D(32.10635199999945,35.20522500000997,650.0);
		
		System.out.println(result);
		
		System.out.println(m.add(p,v).toString());
		
		assertEquals(result.toString(),m.add(p,v).toString());
		
	}

//******************************************************************************
	/* Distance*/
	@Test
	void DistanceTest() 
	{
		MyCoords m = new MyCoords();
		
		Point3D p1 = new Point3D(32.103315,35.20904,670);
		
		System.out.println(p1);
		
		Point3D p2 = new Point3D(32.106352,35.205223,650);
		
		System.out.println(p2);
		
		assertEquals(493,(int)(m.distance3d(p1, p2)));
	}

//******************************************************************************


	@Test
	void azimuth_elevation_dist_Test() {
		MyCoords m = new MyCoords();
		
		double[] arr;
		Point3D p2 = new Point3D(32.106352,35.205223,650);
		Point3D p1 = new Point3D(32.103315,35.20904,670);
		System.out.println(m.distance3d(p1, p2));
		arr = m.azimuth_elevation_dist(p1,p2);
		//assertEquals(132,(int)(arr[0]));
		assertEquals(0.49,(double)((int)(arr[1]))/10);
		//assertEquals(493,(int)(arr[2]));
	}
	

}
