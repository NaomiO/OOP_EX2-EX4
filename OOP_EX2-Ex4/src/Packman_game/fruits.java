package Packman_game;

import GIS.GIS_element;
import GIS.Meta_data;
import Geom.Geom_element;
import Geom.Point3D;

public class fruits {

	private double speed_weight;
	Point3D Points;
	
	

	public fruits(double speed_weight,Point3D Points) {
		this.speed_weight = speed_weight;
		this.Points = Points;
	
	}
	
	public fruits(Point3D Point) {
	this.speed_weight = 1;
	this.Points = Point;
	
	
	}
	/*setters and getters*/

	public Point3D getPoints() {
		return Points;
	}

	public void setPoints(Point3D points) {
		Points = points;
	}



	public double getSpeed_weight() {
		return speed_weight;
	}



	public void setSpeed_weight(double speed_weight) {
		this.speed_weight = speed_weight;
	}
	
	
	
}
