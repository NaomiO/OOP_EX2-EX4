package GIS;

import java.sql.Date;
import Geom.Point3D;

/**
 * This class adds information to every point in the kml files such as time,date,altitude,type,etc...
 * @author Shalhevet && Naomi
 */

public class MetaData implements Meta_data
{

	private String MAC;
	private String SSID;
	private String AuthMode;
	private String FirstSeen;
	private int Channel;
	private int RSSI;
	private int AccuracyMeters;
	private String Type;
	
	
	public MetaData(String _MAC,String _SSID,String _AuthMode,
			String _FirstSeen,String _Channel,String _RSSI,
			String _AccuracyMeters,String _Type) 
	{

		AuthMode=_AuthMode;
		
		FirstSeen=_FirstSeen;
		
		Channel=Integer.parseInt(_Channel);
		
		RSSI=Integer.parseInt(_RSSI);
		
		AccuracyMeters=Integer.parseInt(_AccuracyMeters);
		
		Type=_Type;
		
		MAC=_MAC;
		
		SSID=_SSID;
		

	}

	@Override
	/**
	 * creates time and date data for point
	 */
	public long getUTC() 
	{
		int year;
		int month;
		int day;
		int hour;
		int min;
		int i=0;

		while(FirstSeen.charAt(i) != ' ')
			i++;
		String date = FirstSeen.substring(0, i);

		String time = FirstSeen.substring(i+1, FirstSeen.length());

		String[] arr =date.split("/");

		String[] arr2 =time.split(":");

		hour=Integer.parseInt(arr2[0]);

		min=Integer.parseInt(arr2[1]);

		year=Integer.parseInt(arr[0]);

		month=Integer.parseInt(arr[1]);

		day=Integer.parseInt(arr[2]);


		String result = arr[2] + arr2[0] + arr2[1] + arr[0] + arr[1] ;

		long a = Long.parseLong(result);

		Date utc = new Date(a);

		return utc.getTime();
	}

	@Override
	public Point3D get_Orientation()
	{
		
		return null;
	}

}