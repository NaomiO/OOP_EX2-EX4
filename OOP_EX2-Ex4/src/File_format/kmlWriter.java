package File_format;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import GIS.GISproject;
import GIS.GISelement;
import java.util.Iterator;

import GIS.GIS_element;
import GIS.GIS_layer;

public class kmlWriter {
	
	/**
	 * This method gets a kml empty file and a full project from gis and fill the file with the layers from the project
	 * @param output
	 * @param pro
	 */
	public kmlWriter(String output,GISproject pro) {
		PrintWriter pw = null;
		
		try 
		{
			pw = new PrintWriter(new File(output));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		sb.append("<kml xmlns=\"http://www.opengis.net/kml/2.2\">\n<Document><Style id=\"red\"><IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/red-dot.png</href></Icon></IconStyle></Style><Style id=\"yellow\"><IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/yellow-dot.png</href></Icon></IconStyle></Style><Style id=\"green\"><IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/green-dot.png</href></Icon></IconStyle></Style><Folder><name>Wifi Networks</name>\n");
		Iterator<GIS_layer> layer = pro.iterator();
		int count=0;
		String[]col = {"green","yellow","red"};
		while(layer.hasNext()) {
			GIS_layer lay=layer.next();
			Iterator<GIS_element> element= lay.iterator();
			while(element.hasNext()){
				GIS_element elme = element.next();
				GISelement elm =(GISelement) elme;
				sb.append("<Placemark>\n");
				sb.append("<name>"+"<![CDATA["+elm.get_SSID()+"]]>"  +"</name>\n");
				sb.append("<description>"+"<![CDATA[BSSID: <b>"+elm.get_MAC()+"</b><br/>Capabilities: <b>"+elm.get_AuthMode()+"</b><br/>Timestamp: <b>"+elm.get_FirstSeen()+"</b><br/>Channel: <b>"+elm.get_Channel()+"</b><br/>RSSI: <b>"+elm.get_RSSI()+"</b><br/>AltitudeMeters: <b>"+elm.get_AltitudeMeters()+"</b><br/>AccuracyMeters: <b>"+elm.get_AccuracyMeters()+"</b><br/>Type: <b>"+elm.get_Type()+"</b><br/>Date: <b>"+elm.get_FirstSeen()+"</b>]]>"+"</description><styleUrl>#blue</styleUrl>\n");
				sb.append("<styleUrl>#placemark-"+col[count]+"</styleUrl>");
				sb.append("<Point>\n");
				sb.append("<coordinates>"+elm.get_CurrentLongitude()+","+elm.get_CurrentLatitude()+"</coordinates></Point>\n");
				sb.append("</Placemark>\n");
			}
			count++;
			if(count==3)count=0;

		}
		sb.append("</Folder>\n");
		sb.append("</Document></kml>");
		pw.write(sb.toString());
		pw.close();
		System.out.println("Your new KML file is in : \n" +output);
	}
		
	}