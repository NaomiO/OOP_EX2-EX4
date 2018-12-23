package Packman_game;
import Geom.Point3D;
import Coords.MyCoords;

//import java.awt.*;

//import javax.imageio.ImageIO;
//import java.awt.image.BufferedImage;
//import java.io.File;

public class map
{

//	Image map;
	private Point3D max,min;
	private Point3D LeftUpCorner;
	private Point3D RightDownCorner;
	private Point3D gps1;
	private Point3D gps2;
	private Point3D gps3;
	private double width;
	private double height;
	private MyCoords Coords;


	public map()
	{
		this.max = new Point3D(max);
		this.min = new Point3D(min);
		this.LeftUpCorner = new Point3D(32.105770,  35.202469);
		this.RightDownCorner = new Point3D(32.101899, 35.211588);
		this.gps1= new Point3D(35.212405, 32.106046);
		this.gps2= new Point3D(35.202574, 32.101650);
		gps3= new Point3D(this.gps1.x(), this.gps2.y());
		this.width = this.RightDownCorner.y()-this.LeftUpCorner.y();
		this.height = this.RightDownCorner.x()-this.LeftUpCorner.x();
	}


	public Point3D GPStoPixels(Point3D p )
	{
		double diffX= this.Coords.distance3d(gps3, gps2);

		double diffY = this.Coords.distance3d( gps3,gps1);
		
//        double diffx =p.x() - min.x();
//        double diffy = p.y() - min.y();

        double heightC = max.x() - min.x();
        double widthC = max.y() - min.y();

        double x = (diffX * width) / heightC;
        double y = (diffY * height) / widthC;

        return new Point3D(x,y);
	
	}


    public Point3D PixelstoGPS(Point3D p)
    {
    	double dx = this.Coords.distance3d(gps2, gps3);
    	double lonX=((dx* p.x())/width)/*+this.min.x()*/;
		double dy = this.Coords.distance3d(gps1, gps3);
        double latY=((dy*p.y())/height)/*+this.min.y()*/;

        Point3D gpsPoint=new Point3D(lonX,latY);
        return gpsPoint;
    }
    
    public double distancePixels(Point3D p1, Point3D p2) {
    	Point3D x =  PixelstoGPS(p1);
    	Point3D y =  PixelstoGPS(p2);
    	MyCoords c = new MyCoords();
    	double result = c.distance3d(x, y);
    	return result;

    }

    public double azimut(Point3D p1, Point3D p2) {
        MyCoords myCoords = new MyCoords();
		double azi= myCoords.azimuth_elevation_dist(p1,p2)[0];
		return azi;
	}
    
    public double Angle(Point3D p1, Point3D p2) {

		Point3D pix1= new Point3D(this.PixelstoGPS( p1));
		Point3D pix2= new Point3D(this.PixelstoGPS( p2));

		double x=Math.cos(pix2.x())*Math.sin(pix2.y()-pix1.y());
		double y=(Math.cos(pix1.x())*Math.sin(pix2.x())) - (Math.sin(pix1.x())*Math.cos(pix2.x()*Math.cos(pix2.y()-pix1.y())));

		double angle=Math.atan2(x, y);
		return angle;
	}
    
}   