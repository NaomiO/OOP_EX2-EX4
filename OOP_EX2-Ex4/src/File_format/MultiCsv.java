

package File_format;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import GIS.GISlayer;
import File_format.csvReader;
import GIS.GIS_element;
import GIS.GISproject;
import java.util.ArrayList;

public class MultiCsv {
	private static GISproject pro= new GISproject();
	private static GISlayer lay=new GISlayer();
	public static ArrayList<String> CSVFiles=new ArrayList<String>(); 

	
	public static ArrayList<String>  CSVrexursia(String directoryPath){
		File[] filesInDirectory = new File(directoryPath).listFiles();
		for(File f : filesInDirectory){
			String filePath = f.getAbsolutePath();
			String fileExtenstion = filePath.substring(filePath.lastIndexOf(".") + 1,filePath.length());
			if("csv".equals(fileExtenstion)){
				CSVFiles.add(filePath);
				System.out.println("CSV file found -> " + filePath);
				// Call the method checkForCobalt(filePath);
			}
		}    
		return CSVFiles;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		GISproject pro=new GISproject();
		String directoryPath="C:\\Users\\Benjamin\\git\\OOP_EX2-EX4\\CSVFiles";
		CSVFiles=CSVrexursia(directoryPath);
		Iterator<String> CSVFile = CSVFiles.iterator();
		while (CSVFile.hasNext()) {
			lay=csvReader.CVSread(CSVFile.next());
			pro.add(lay);
		}
		System.out.println(pro.size());
		String SaveKMLTo="C:\\Users\\Benjamin\\git\\OOP_EX2-EX4\\KMLFiles\\kmlFile3.kml";
		kmlWriter kml=new kmlWriter (SaveKMLTo ,pro);
			}
}