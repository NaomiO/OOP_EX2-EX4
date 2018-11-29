package Coords;

import java.util.Arrays;

import Geom.Point3D;

public class Test {

	public static void main(String[] args) {
		MyCoords c=new  MyCoords();
		
		Point3D gps=new Point3D(45.28,40.99,670);
		Point3D vector=new Point3D(337.6989920612881,-359.24920693881893,-20);
		Point3D p3=new Point3D(45.55,40.8,650);
		System.out.println(c.add(gps, vector));
		System.out.println(c.distance3d(gps, p3));
		System.out.println(Arrays.toString(c.azimuth_elevation_dist(gps, p3)));

}}
