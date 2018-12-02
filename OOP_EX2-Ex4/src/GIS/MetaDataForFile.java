package GIS;
import java.util.Date;
import Geom.Point3D;

/**
 * This class adds information to every point in the kml files such as time,date,altitude,type,etc...
 * @author Shalhevet && Naomi
 */
public class MetaDataForFile implements Meta_data {
	
	private long UTC;
	
	public MetaDataForFile()
	{
		
		Date date = new Date();
		
		UTC = date.getTime();
		
	}
	
	@Override
	/**
	 * gets utc data 
	 */
	public long getUTC() 
	{
		return UTC;
		
	}
	
	@Override
	public Point3D get_Orientation() 
	
	{
		return null;
	}
	
	@Override
	public String toString() 
	{
		return "" + getUTC();
	}
}