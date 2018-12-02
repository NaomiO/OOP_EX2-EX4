package GIS;
import Geom.Geom_element;
import Geom.Point3D;
import Coords.MyCoords;

/**
 * This class gets a csv file and keep every line as an "element" 
 * @author Shalhevet && Naomi
 *
 */

public class GISelement implements GIS_element{
	
	private MetaData Meta_data;	
    private Point3D Geom;
    
	private String MAC;
	private String SSID;
	private String AuthMode ;
	private String FirstSeen;
	private String Channel; 
	private String RSSI ;
	private String CurrentLatitude ;
	private String CurrentLongitude; 
	private String AltitudeMeters; 
	private String AccuracyMeters ;
	private String Type;

	public GISelement() {
		this.MAC=null;
		this.SSID=null;
		this.AuthMode=null;
		this.FirstSeen=null;
		this.Channel=null;
		this.RSSI=null;
		this.CurrentLatitude=null;
		this.CurrentLongitude=null;
		this.AltitudeMeters=null;
		this.AccuracyMeters=null;
		this.Type=null;	
	}
	
	
	public GISelement(String mac,String ssid, String authmode,String firstseen,
			String channel,String rssi,String currentlatitude,String currentLongitude, String altitudemeters
			,String accuracymeters,String type ) {
		this.RSSI=rssi;
		this.CurrentLatitude=currentlatitude;
		this.CurrentLongitude=currentLongitude;
		this.AltitudeMeters=altitudemeters;
		this.AccuracyMeters=accuracymeters;
		this.Type=type;
		this.MAC=mac;
		this.SSID=ssid;
		this.AuthMode=authmode;
		this.FirstSeen=firstseen;
		this.Channel=channel;
	
	}
	@Override
	public Geom_element getGeom() {
		return Geom;
	}

	@Override
	public Meta_data getData() {
		return Meta_data;
	}
	@Override
	public void translate(Point3D vec) { 
	Geom=new MyCoords().add(Geom,vec);	 
	}
	
	public long getUTC() {
		return Meta_data.getUTC();
	}
	
	public String get_MAC() {
		return MAC;
	}
	private void set_MAC(String _MAC) {
		this.MAC =_MAC;
	}
	
	
	public String get_SSID() {
		return SSID;
	}
	private void set_SSID(String _SSID) {
		this.SSID =_SSID;
	}
	
	
	public String get_FirstSeen() {
		return FirstSeen;
	}
	private void set_FirstSeen(String _FirstSeen) {
		this.FirstSeen =_FirstSeen;
	}
	
	
	public String get_AuthMode() {
		return AuthMode;
	}
	private void set_AuthMode(String _AuthMode) {
		this.AuthMode =_AuthMode;
	}
	
	
	public String get_Channel() {
		return Channel;
	}
	private void set_Channel(String _Channel) {
		this.Channel =_Channel;
	}
	
	
	public String get_CurrentLatitude() {
		return CurrentLatitude;
	}
	private void set_CurrentLatitude(String _CurrentLatitude) {
		this.CurrentLatitude=_CurrentLatitude;
	}
	
	public String get_RSSI() {
		return RSSI;
	}
	private void set_RSSI(String _RSSI) {
		this.RSSI =_RSSI;
	}
	
	
	
	public String get_AccuracyMeters() {
		return AccuracyMeters;
	}
	private void set_AccuracyMeters(String _AccuracyMeters) {
		this.AccuracyMeters =_AccuracyMeters;
	}
	
	public String get_Type() {
		return Type;
	}
	private void set_Type (String _Type) {
		this.Type=_Type;
	}
	
	
	public String get_AltitudeMeters() {
		return AltitudeMeters;
	}
	private void set__AccuracyMeters (String _AccuracyMeters) {
		this.AccuracyMeters=_AccuracyMeters;
	}
	public String get_CurrentLongitude() {
		return CurrentLongitude;
	}
	private void set_CurrentLongitude (String _CurrentLongitude) {
		this.CurrentLongitude=_CurrentLongitude;
	}



}