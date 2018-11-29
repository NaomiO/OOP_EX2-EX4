package GIS;

import Geom.Geom_element;
import Geom.Point3D;



public class GISelement implements GIS_element {
	
	String [] csvLine;
	Point3D p;
	Meta_data data;

	@Override
	public Geom_element getGeom() {
		
		return null;
	}

	@Override
	public Meta_data getData() {
		
		return null;
	}

	@Override
	public void translate(Point3D vec) {
		
		
	}

}
