package Packman_game;

import GIS.GIS_element;
import GIS.Meta_data;
import Geom.Geom_element;
import Geom.Point3D;

public class fruits {

	private double speed_weight;
	Point3D fruit_Points;
	private int id;
	
	

	public fruits(double speed_weight,Point3D fruit_Points) {
		this.speed_weight = speed_weight;
		this.fruit_Points = fruit_Points;	
	}
	
	public fruits(Point3D fruit_Points) {
	this.speed_weight = 1;
	this.fruit_Points = fruit_Points;
	
	
	}
	/*setters and getters*/

	public Point3D getfruit_Points() {
		return fruit_Points;
	}

	public void setfruit_Points(Point3D points) {
		fruit_Points = points;
	}



	public double getSpeed_weight() {
		return speed_weight;
	}



	public void setSpeed_weight(double speed_weight) {
		this.speed_weight = speed_weight;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
}
