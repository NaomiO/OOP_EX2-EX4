package File_format;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import GIS.GISlayer;
import File_format.csvReader;
import GIS.GIS_element;
import GIS.GISproject;
import java.util.ArrayList;


/**
 * This class represents a converter for multiple csv files to kml files 
 * @author Shalhevet && Naomi
 *
 */


public class MultiCsv {
	
	private static GISproject project= new GISproject();
	private static GISlayer layer=new GISlayer();
	public static ArrayList<String> csvFiles=new ArrayList<String>(); 

	/**
	 * This method gets a csv file and transform it into a kml file
	 * @param directoryPath
	 * @return the new file in kml
	 */
	public static ArrayList<String>  CSVResearch(String source){
		
		File[] filesInDirectory = new File(source).listFiles();
		for(File f : filesInDirectory){
			
			String filePath = f.getAbsolutePath();
			String fileExtenstion = filePath.substring(filePath.lastIndexOf(".") + 1,filePath.length());
			if("csv".equals(fileExtenstion)){
				csvFiles.add(filePath);
				System.out.println("CSV file : " + filePath);
				
			}
		}    
		return csvFiles;
	}
	public static void main(String[] args) {
	
		GISproject project=new GISproject();
		String source="C:\\Users\\Benjamin\\git\\OOP_EX2-EX4\\CSVFiles";
		csvFiles=CSVResearch(source);
		Iterator<String> CSVFile = csvFiles.iterator();
		
		while (CSVFile.hasNext()) {
			layer=csvReader.CVSread(CSVFile.next());
			project.add(layer);
		}
		
		System.out.println();

		String SaveKMLTo="C:\\Users\\Benjamin\\git\\OOP_EX2-EX4\\KMLFiles\\kmlFile3.kml";
		
		kmlWriter kml=new kmlWriter (SaveKMLTo ,project);
			}
}