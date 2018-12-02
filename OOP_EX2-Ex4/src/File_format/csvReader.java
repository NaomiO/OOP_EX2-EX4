package File_format;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import GIS.GISelement;
import GIS.GISlayer;

/**
 * This class represents a csv reader file
 * @author Shalhevet && Naomi
 *
 */

public class csvReader {
	/**
	 * This method gets a csv file, reads it, keeps every line in GISelement and adds all of the element  into a GISlayer
	 * @param csvFile
	 * @return the layer
	 */
	public static GISlayer CVSread(String csvFile){

		String line = "";
		String cvsSplitBy = ",";
		GISlayer lay=new GISlayer();
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
		{	
			line = br.readLine();
			line = br.readLine();

			while ((line = br.readLine()) != null) 
			{
				String[] AllData = line.split(cvsSplitBy);
				GISelement e=new GISelement(AllData[0],AllData[1],AllData[2],AllData[3],AllData[4],AllData[5]
						,AllData[6],AllData[7],AllData[8],AllData[9], AllData[10]);
				lay.add(e);
			}

		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return lay;
	}}