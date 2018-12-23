package Packman_game;

import GIS.GIS_element;
import GIS.Meta_data;
import Geom.Geom_element;
import Geom.Point3D;
import java.util.ArrayList;

public class Packman {

	private double radius;
	private double speed_weight;
	private Point3D Pacman_Points;



	//constructor 
	
	public Packman(double radius,double speed_weight,Point3D Pac) {
		this.radius = radius;
		this.speed_weight = speed_weight;
		this.Pacman_Points=Pac;
	
		
	}
	/*setters and getters*/



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}



	public double getSpeed_weight() {
		return speed_weight;
	}



	public void setSpeed_weight(double speed_weight) {
		this.speed_weight = speed_weight;
	}



	public Point3D getPacman_Points() {
		return Pacman_Points;
	}



	public void setPacman_Points(Point3D Pacman_Points) {
		this.Pacman_Points = Pacman_Points;
	}
}

