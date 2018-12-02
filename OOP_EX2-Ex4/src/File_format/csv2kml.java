package File_format;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class represents a file converter, from csv to kml.
 * @author Shalhevet && Naomi
 *www.opengis.net
 */
public class csv2kml 
{
	public static void main(String[] args) 
	{
		csv2kml.CsvtoKml("C:\\Users\\Benjamin\\git\\OOP_EX2-EX4\\CSVFiles\\WigleWifi_20171201110209.csv");
		
	}
	
	/**
	 * This function takes a csv file, reads it and transform it into a kml file
	 * @param csvfile1 which is the csv first file address
	 * @param csvfile2 which is the csv second file address
	 */
	public static void CsvtoKml(String csvfile)
	{
		try 
		{
			FileReader reader = new FileReader(csvfile); 
			BufferedReader br = new BufferedReader(reader);
			FileWriter writer = new FileWriter("C:\\Users\\Benjamin\\git\\OOP_Ex2-Ex4\\KMLFiles\\kmlFile.kml");
			BufferedWriter bw = new BufferedWriter(writer);
			StringBuilder sb = new StringBuilder();
		
		//create kml file	
			String line = "";
			String[] str1 = new String[11];
			str1 = line.split(",");
		
			
			sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
			sb.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\"><Document><Style id=\"blue\"><IconStyle><Icon><href>"
					+ "http://maps.google.com/mapfiles/ms/icons/blue-dot.png</href>"
					+ "</Icon></IconStyle></Style><Style id=\"blue\"><IconStyle><Icon><href>"
					+ "http://maps.google.com/mapfiles/ms/icons/blue-dot.png</href>"
					+ "</Icon></IconStyle></Style><Style id=\"green\"><IconStyle><Icon><href>"
					+ "http://maps.google.com/mapfiles/ms/icons/green-dot.png</href>"
					+ "</Icon></IconStyle></Style><Folder><name>Wifi Networks</name>\r\n" + "");
		
			line = br.readLine();
			line = br.readLine();
			
			while((line = br.readLine())!=null)
			{
				str1 = line.split(",") ;
				sb.append("<Placemark>\n");
				sb.append("<name>"+"<![CDATA["+str1[1]+"]]>"  +"</name>\n");
				sb.append("<description>"+"<![CDATA[BSSID: <b>"+str1[0]+"</b><br/>Capabilities: <b>"
						+str1[2]+"</b><br/>Channel: <b>"+str1[4]+"</b><br/>RSSI: <b>"+str1[5]+"</b><br/>AccuracyMeters: <b>"
						+str1[9]+"</b><br/>Type: <b>"+str1[10]+"</b><br/>Date: <b>"
						+str1[3]+"</b>]]>"+"</description><styleUrl>#blue</styleUrl>\n");
				sb.append("<Point>\n");
				sb.append("<coordinates>"+str1[7]+","+str1[6]+","+str1[8]+"</coordinates></Point>\n");
				sb.append("</Placemark>\n");
				
			}
			 
			sb.append("\n</Folder>\n");
			sb.append("</Document></kml>");
			
			bw.write(sb.toString());
			bw.close();
		

			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
}

