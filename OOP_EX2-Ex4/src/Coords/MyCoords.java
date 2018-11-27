package Coords;

import Geom.Point3D;
////degree = gps
public class MyCoords implements coords_converter  {

	static public int EARTH_RADIUS = 6371000;
	
	@Override
	public Point3D add(Point3D gps, Point3D local_vector_in_meter) {
		// TODO Auto-generated method stub
		Point3D point_inCart = toCartesians(gps);
		
		double p_x = point_inCart.x()+local_vector_in_meter.x();
		double p_y = point_inCart.y()+local_vector_in_meter.y();
		double p_z = point_inCart.z()+local_vector_in_meter.z();

		Point3D new_p = toDegrees(new Point3D(p_x,p_y,p_z));
		
		return new_p;
	}

	@Override
	public double distance3d(Point3D gps0, Point3D gps1) {
		// TODO Auto-generated method stub
		
		Point3D new_gps0 =toCartesians(gps0);
		Point3D new_gps1 = toCartesians(gps1);
		
		return Math.abs(new_gps0.distance3D(new_gps1));
	}

	@Override
	public Point3D vector3D(Point3D gps0, Point3D gps1) {
		// TODO Auto-generated method stub
		
		Point3D meters0 = toCartesians(gps0);
		Point3D meters1 = toCartesians(gps1);
		

		double new_x = meters1.x()-meters0.x();
		double new_y = meters1.y()-meters0.y();
		double new_z = meters1.z()-meters0.z();


		return new Point3D (new_x,new_y,new_z);
	}

	@Override
	public double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1) {
		// TODO Auto-generated method stub
		double[] azimuth = new double[3];
		
		azimuth[0] = gps1.north_angle(gps0);
		azimuth[1] = gps1.up_angle(gps0);		  //		ans[1] = Math.toDegrees(Math.asin((gps0.z()-gps1.z())/(distance3d(gps0 , gps1))));
		azimuth[2] = distance3d(gps1, gps0);
		
		return azimuth;
	}

	@Override
	public boolean isValid_GPS_Point(Point3D p) {
		// TODO Auto-generated method stub
		
		return (p.x()<-180 || p.x() >180 ||p.y() <-90 || p.y() >90 || p.z() <-450) ? false : true;

	}

	public Point3D toCartesians(Point3D p)
	{	
		double x = (EARTH_RADIUS+p._z) * Math.cos(p._x) * Math.cos(p._y);
		double y = (EARTH_RADIUS+p._z) * Math.cos(p._x) * Math.sin(p._y);
		double z = (EARTH_RADIUS+p._z) * Math.sin(p._x);
		return new Point3D(x,y,z);
	}
	public Point3D toDegrees(Point3D p)
	{
		double x = Math.asin(p._z/EARTH_RADIUS)*180/Math.PI;
		double y = Math.atan2(p._y, p._x)*180/Math.PI;
		double z = Math.sqrt(Math.pow(p._x, 2) + Math.pow(p._y, 2) + Math.pow(p._z, 2)) ;
		return new Point3D(x,y,z);
	}
}
