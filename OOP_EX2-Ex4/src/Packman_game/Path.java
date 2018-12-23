package Packman_game;

import java.util.ArrayList;
import java.util.Iterator;
import Coords.MyCoords;
import Geom.Point3D;

public class Path {
	
private ArrayList<Point3D> GPSPoints;
double time;

public Path() {
	GPSPoints=new ArrayList<Point3D>();
	time = 0;
}

public void add(Point3D p) {
	GPSPoints.add(p);
}

public double distance() {
	double dis = 0;
	Iterator<Point3D> itr=GPSPoints.iterator();
	MyCoords c=new MyCoords();
	Point3D p1=itr.next();
	while(itr.hasNext()) {
		
		Point3D p2=itr.next();
		dis+=c.distance3d(p1, p2);
		p1=p2;
		
	}
	return dis;
}

public void addTime(double temp) {
	time+=temp;
}

public double getTime() {
	return time;
     }
}