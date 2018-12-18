package Packman_game;

import GIS.GIS_element;
import GIS.Meta_data;
import Geom.Geom_element;
import Geom.Point3D;

public class Packman {

	private double radius;
	private double speed_weight;
	private Point3D Pacman;



	//constructor 
	//(double radius,double speed_weight,double Alt,double Lon,double Lat,int id)
	public Packman(double radius,double speed_weight,Point3D Pac) {
		this.radius = radius;
		this.speed_weight = speed_weight;
		this.Pacman=Pac;
	
		//this.Type = Type;
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



	public Point3D getPacman() {
		return Pacman;
	}



	public void setPacman(Point3D pacman) {
		Pacman = pacman;
	}

}
