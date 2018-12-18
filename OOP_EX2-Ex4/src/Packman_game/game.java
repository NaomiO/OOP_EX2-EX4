package Packman_game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import GIS.GIS_element;
import GIS.GIS_layer;
import GIS.GISelement;
import GIS.GISlayer;
import GIS.Meta_data;
import Geom.Point3D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class game implements GIS_layer{

	private ArrayList <fruits> f;
	private ArrayList <Packman> p;


	public game() {
		this.f = new ArrayList<fruits>();
		this.p = new ArrayList<Packman>();
	}

	public game(ArrayList<fruits> f, ArrayList<Packman> p) {
		Iterator<fruits> iter1 = f.iterator();
		Iterator<Packman> iter2 = p.iterator();
		while (iter1.hasNext()) {
			fruits fruit = iter1.next();
			this.f.add(fruit);
		}
		while (iter2.hasNext()) {
			Packman packman1 = iter2.next();
			this.p.add(packman1);
		}
	}

/*	public game(String csvFile) {
		this.p = new ArrayList<>();
		this.f = new ArrayList<>();
		String line = "";
		String csvSplitBy = ",";
		ArrayList<String[]> data = new ArrayList<>();
		String[] dataLine;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				dataLine = line.split(csvSplitBy);
				data.add(dataLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Point3D u;
		fruits r;
		Point3D p;
		Packman t;
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i)[0].equals("P")) {
				p = new Point3D(Double.parseDouble(data.get(i)[3]), Double.parseDouble(data.get(i)[2]),
						Double.parseDouble(data.get(i)[4]));

				t = new Packman (Double.parseDouble(data.get(i)[6]),Double.parseDouble(data.get(i)[5]),
						Double.parseDouble(data.get(i)[4]),Double.parseDouble(data.get(i)[3]),
						Double.parseDouble(data.get(i)[2]),Integer.parseInt(data.get(i)[1]));
				this.p.add(t);

			}

			else if (data.get(i)[0].equals("F")) {
				u = new Point3D(Double.parseDouble(data.get(i)[3]), Double.parseDouble(data.get(i)[2]),
						Double.parseDouble(data.get(i)[4]));
				r = new fruits(Double.parseDouble(data.get(i)[6]),Double.parseDouble(data.get(i)[5]),
						Double.parseDouble(data.get(i)[4]),Double.parseDouble(data.get(i)[3]),
						Double.parseDouble(data.get(i)[2]),Integer.parseInt(data.get(i)[1]));
				this.f.add(r);
			}
		}

	}*/
/*
	public void CsvSave() {

		//https://stackoverflow.com/questions/30073980/java-writing-strings-to-a-csv-file

		PrintWriter pw = null;
		StringBuilder builder = new StringBuilder();

		try {
			pw = new PrintWriter(new File("Game.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String[] str = { "Type" , "id"	,"Lat" , "Lon", "Alt" , "Speed" , "Weight" , "Radius" };

		for (int i = 0; i < this.p.size(); i++) {
			builder.append("P");
			builder.append(',');
			builder.append(p.get(i).getId());
			builder.append(',');
			builder	.append(p.get(i).getLat());
			builder.append(',');
			builder.append(p.get(i).getLon());
			builder.append(',');
			builder.append(p.get(i).getAlt());
			builder.append(',');
			builder.append(p.get(i).getSpeed_weight());
			builder.append(',');
			builder.append(p.get(i).getRadius());
			builder.append('\n');
		}

		for (int i = 0; i < this.f.size(); i++) {
			builder.append("F");
			builder.append(',');
			builder.append(f.get(i).getId());
			builder.append(',');
			builder.append(f.get(i).getLon());
			builder.append(',');
			builder.append(f.get(i).getLat());;
			builder.append(',');
			builder.append(f.get(i).getAlt());
			builder.append(',');	
			builder.append(f.get(i).getSpeed_weight());
			builder.append('\n');

		}

		builder.append('\n');

		pw.write(builder.toString());

		pw.close();

	}

	public static void CsvRead(String csvFile){

		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader("Game.csv"))) 
		{	
			line = br.readLine();

			while ((line = br.readLine()) != null) 
			{
				String[] AllData = line.split(cvsSplitBy);
				if (AllData[0].equals("P")) {
					int id = Integer.parseInt(AllData[1]);
					double Lat = Double.parseDouble(AllData[2]);
					double Lon = Double.parseDouble(AllData[3]);
					double Alt = Double.parseDouble(AllData[4]);
					double speed_weight = Double.parseDouble(AllData[5]);
					double radius = Double.parseDouble(AllData[6]);
					Packman p = new Packman (radius,speed_weight,Alt,Lon,Lat,id);
					//Packman.add(p);
				}
				if (AllData[0].equals("F")) {
					int id = Integer.parseInt(AllData[1]);
					double Lat = Double.parseDouble(AllData[2]);
					double Lon = Double.parseDouble(AllData[3]);
					double Alt = Double.parseDouble(AllData[4]);
					double speed_weight = Double.parseDouble(AllData[5]);
					double radius = Double.parseDouble(AllData[6]);
					fruits fr = new fruits(radius,speed_weight,Alt,Lon,Lat,id);
				//	fruits.add(fr);
				}
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	return;
	}
*/
////////////////////////////////////////

public ArrayList<fruits> getfruits() {
	return f;
}

public void setFruits(ArrayList<fruits> fruits) {
	this.f = fruits;
}

public ArrayList<Packman> getPackman() {
	return p;
}

public void setPackmans(ArrayList<Packman> packman) {
	this.p = packman;
}

@Override
public String toString() {
	String s = "Game : \n" + "Type,id,Lat,Lon,Alt,Speed,Weight,Radius," + this.p.size() + "," + this.f.size()
	+ "\n";
	for (int i = 0; i < p.size(); i++) {
		s = s + p.get(i).toString() + "\n";
	}
	for (int i = 0; i < f.size(); i++) {
		s = s + f.get(i).toString() + "\n";
	}

	return s;
}



@Override
public boolean add(GIS_element arg0) {

	return false;
}
@Override
public boolean addAll(Collection<? extends GIS_element> arg0) {

	return false;
}
@Override
public void clear() {


}
@Override
public boolean contains(Object arg0) {

	return false;
}
@Override
public boolean containsAll(Collection<?> arg0) {

	return false;
}
@Override
public boolean isEmpty() {

	return false;
}
@Override
public Iterator<GIS_element> iterator() {

	return null;
}
@Override
public boolean remove(Object arg0) {

	return false;
}
@Override
public boolean removeAll(Collection<?> arg0) {

	return false;
}
@Override
public boolean retainAll(Collection<?> arg0) {

	return false;
}
@Override
public int size() {

	return 0;
}
@Override
public Object[] toArray() {

	return null;
}
@Override
public <T> T[] toArray(T[] arg0) {

	return null;
}
@Override
public Meta_data get_Meta_data() {

	return null;
}



}
