package GIS;
import java.util.Date;
import Geom.Point3D;
public class MetaData1 implements Meta_data {
	
	private long UTC;
	
	public MetaData1()
	{
		
		Date date = new Date();
		
		UTC = date.getTime();
		
	}
	
	@Override
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