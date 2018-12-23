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
import java.util.List;




public class game {
	
	public ArrayList<Packman> p = new ArrayList<>();
	public ArrayList<fruits> f = new ArrayList<>();
	public String file_directory;
	
	

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

	public void CsvSave() {

		//https://stackoverflow.com/questions/30073980/java-writing-strings-to-a-csv-file

		PrintWriter pw = null;
		StringBuilder builder = new StringBuilder();

		try {
			pw = new PrintWriter(new File(getDiractroy()+".csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		builder.append("Type,");
		builder.append("Id,");
		builder.append("Speed_weight,");
		builder.append("Radius,");
		
	
		for (int i = 0; i < this.p.size(); i++) {
			
			builder.append("P");
			builder.append(',');
			builder.append(p.get(i).getPacman_Points().x());
			builder.append(',');
			builder.append(p.get(i).getPacman_Points().y());
			builder.append(',');
			builder.append(p.get(i).getPacman_Points().z());
			builder.append(',');
			builder.append(p.get(i).getSpeed_weight());
			builder.append(',');
			builder.append(p.get(i).getRadius());
			builder.append('\n');
		}

		for (int i = 0; i < this.f.size(); i++) {
			builder.append("F");
			builder.append(',');
			builder.append(f.get(i).fruit_Points.x());
			builder.append(',');
			builder.append(f.get(i).fruit_Points.y());;
			builder.append(',');
			builder.append(f.get(i).fruit_Points.z());
			builder.append(',');	
			builder.append(f.get(i).getSpeed_weight());
			builder.append('\n');

		}

		builder.append('\n');

		pw.write(builder.toString());

		pw.close();

	}

	public  void CsvRead(String csvFile){

		String line = "";
		String cvsSplitBy = ",";
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
		{	
			line = br.readLine();

			while ((line = br.readLine()) != null) 
			{
				String[] AllData = line.split(cvsSplitBy);
				if (AllData[0].equals("P")) {
					double Lat = Double.parseDouble(AllData[2]);
					double Lon = Double.parseDouble(AllData[3]);
					double Alt = Double.parseDouble(AllData[4]);
					Point3D Pac = new Point3D(Lat,Lon,Alt);
					double speed_weight = Double.parseDouble(AllData[5]);
					double radius = Double.parseDouble(AllData[6]);
					Packman p_new = new Packman(radius, speed_weight, Pac) ;
					p.add(p_new);
					
					
					
				}
				if (AllData[0].equals("F")) {
					double Lat = Double.parseDouble(AllData[2]);
					double Lon = Double.parseDouble(AllData[3]);
					double Alt = Double.parseDouble(AllData[4]);
					Point3D Points_fruits = new Point3D(Lat,Lon,Alt);
					double speed_weight = Double.parseDouble(AllData[5]);
					fruits fruits_new =	new fruits(speed_weight,Points_fruits) ;
					f.add(fruits_new);
				}
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	return;
	}

	
public String getDiractroy() {
		return this.file_directory;
}

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
	String s = "Game : \n" + "Lat,Lon,Alt,Speed_Weight,Radius," + this.p.size() + "," + this.f.size()
	+ "\n";
	for (int i = 0; i < p.size(); i++) {
		s = s + p.get(i).toString() + "\n";
	}
	for (int i = 0; i < f.size(); i++) {
		s = s + f.get(i).toString() + "\n";
	}

	return s;

}}
