package Coords;

import Geom.Point3D;

  ////degree = gps
public class MyCoords implements coords_converter
{

	static public int EARTH_RADIUS = 6371000;
	
	/**
	 * A function that connects two points and returns a point in degrees
	 * @param  local_vector_in_meter
	 * @param gps
	 */
	@Override
	public Point3D add(Point3D gps, Point3D local_vector_in_meter) 
	{
		
		Point3D pointInCart = toCartesians(gps);
		
		double pointX = pointInCart.x() + local_vector_in_meter.x();
		
		double pointY = pointInCart.y() + local_vector_in_meter.y();
		
		double pointZ = pointInCart.z() + local_vector_in_meter.z();

		Point3D newPoint = toDegrees(new Point3D (pointX , pointY ,pointZ));
		
		return newPoint;
	}
	
	
	@Override
	public double distance3d(Point3D gps0, Point3D gps1)
	{
		
		Point3D new_gps1 = toCartesians(gps1);
		
		Point3D new_gps0 = toCartesians(gps0);
		
		double distance = Math.abs(new_gps0.distance3D(new_gps1)) ;
		
			if (distance>100000)
				
				throw new RuntimeException("The distance is too large"); 
		
			else 
				
		return distance;
			
	}

	@Override
	public Point3D vector3D(Point3D gps0, Point3D gps1)
	{
	
		Point3D meters1 = toCartesians(gps1);
		
		Point3D meters0 = toCartesians(gps0);
		

		double new_x = meters1.x() - meters0.x();
		
		double new_y = meters1.y() - meters0.y();
		
		double new_z = meters1.z() - meters0.z();
		
		Point3D result = new Point3D (new_x , new_y , new_z );

		return result;
	}

	@Override
	public double[] azimuth_elevation_dist(Point3D gps0, Point3D gps1)
	{
		
		double [] azimuth = new double [3] ;
		
		azimuth[0] = gps1.north_angle(gps0);
		
		//ans[1] = Math.toDegrees(Math.asin((gps0.z()-gps1.z())/(distance3d(gps0 , gps1))));
		azimuth[1] = gps1.up_angle(gps0);	
		
		azimuth[2] = distance3d(gps1, gps0);
		
		return azimuth;
	}

	@Override
	public boolean isValid_GPS_Point(Point3D p)
	{
	
				if (p.x()<-180 || p.x()>180 ||p.y()<-90 || p.y()>90 || p.z() < -450)
				
					return false;
				
			return true;
	}

	public Point3D toCartesians(Point3D p)
	{	
		double x = (EARTH_RADIUS  + p.z()) * Math.cos(p.x()) * Math.cos(p.y());
		
		double y = (EARTH_RADIUS  + p.z()) * Math.cos(p.x()) * Math.sin(p.y());
		
		double z = (EARTH_RADIUS + p.z()) * Math.sin(p.x());
		
		Point3D result = new Point3D (x,y,z);
		
		return result;
	}
	
	public Point3D toDegrees(Point3D p)
	{
		double x = Math.asin(p.z()/EARTH_RADIUS) * 180 / Math.PI ;
		
		double y = Math.atan2( p.y() , p.x())*180 / Math.PI ;
		
		double z = Math.sqrt(Math.pow( p.x(), 2) + Math.pow(p.y() , 2) + Math.pow( p.z() , 2)) ;
		
		Point3D result = new Point3D (x,y,z);
		
		return result;
	}
	
}
