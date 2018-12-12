package Map;

import GIS.GIS_element;
import GIS.Meta_data;
import Geom.Geom_element;
import Geom.Point3D;

public class Packman implements GIS_element{
	
	//private int num_packmn;
	private int num_fruits;
	private double radius;
	private double speed;
	private double weight;
	private double Alt;
	private double Lon;
	private int id;
	private String Type;
	
	//constructor 
	public Packman(){
		this.id = 0;
		this.radius = 1;
		this.speed = 1;
		this.weight = 1;
	}
	
	//constructor 
	//int num_packmn,int num_fruits,
	public Packman(double radius,double speed,double weight,double Alt,double Lon,int id,String Type) {
		//this.num_packmn = num_packmn;
		//this.num_fruits = num_fruits;
		this.radius = radius;
		this.speed = speed;
		this.weight = weight;
		this.Alt = Alt;
		this.Lon= Lon;
		this.id = id;
		this.Type = Type;
	}
	/*setters and getters*/
	
	public double getAlt() {
		return this.Alt;
	}
	private void setAlt(double alt) {
		this.Alt = alt;
	}
//	public int getNum_packmn() {
//		return this.num_packmn;
//	}
//	private void setNum_packmn(int num_packmn) {
//		this.num_packmn = num_packmn;
//	}
	public int getNum_fruits() {
		return this.num_fruits;
	}
	private void setNum_fruits(int num_fruits) {
		this.num_fruits = num_fruits;
	}
	public double getRadius() {
		return this.radius;
	}
	private void setRadius(double radius) {
		this.radius = radius;
	}
	public double getSpeed() {
		return this.speed;
	}
	private void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getWeight() {
		return this.weight;
	}
	private void setWeight(double weight) {
		this.weight = weight;
	}
	public double getLon() {
		return this.Lon;
	}
	private void setLon(double lon) {
		this.Lon = lon;
	}
	public int getId() {
		return this.id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return this.Type;
	}
	private void setType(String type) {
		this.Type = type;
	}

	@Override
	public Geom_element getGeom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meta_data getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void translate(Point3D vec) {
		// TODO Auto-generated method stub
		
	}
	
}
