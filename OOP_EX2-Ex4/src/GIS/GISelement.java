package GIS;

import Geom.Geom_element;
import Geom.Point3D;



public class GISelement implements GIS_element {
	
	Meta_data data;
	Point3D p;

	private String MAC;

	private String SSID;

	private String AuthMode;

	private String Firstseen;

	private int Channel;

	private int RSSI;

	private double CurrentLatitude;

	private double CurrentLongitude;

	private double AltitudeMeters;
	
	private int AccuracyMeters;
	
	private String Type;


	public GISelement(String MAC,String SSID,String AuthMode,String Firstseen,
			String Channel,String RSSI,String CurrentLatitude,String CurrentLongitude,
			String AltitudeMeters,String AccuracyMeters,String Type) 
	{

		setMAC(MAC); 
		setSSID(SSID);
		setAuthMode(AuthMode);
		setFirstseen(Firstseen);
		setChannel(Channel);
		setRSSI(RSSI);
		setCurrentLatitude(CurrentLatitude);
		setType(Type);
	//	setP(CurrentLatitude,CurrentLongitude,AltitudeMeters);
		setChannel(Channel);
		setAccuracyMeters(AccuracyMeters);		

		//m = new Meta_Data();
	}




//	public Point3D getP() {
//		return p;
//	}
//
//	public void setP(String CurrentLatitude,String CurrentLongitude, String AltitudeMeters) {
//		this.p = p;
//	}


	/*MAC*/
	public String getMAC() {
		return MAC;
	}

	public void setMAC(String mAC) {
		this.MAC = mAC;
	}

	/*SSID*/
	public String getSSID() {
		return SSID;
	}

	public void setSSID(String sSID) {
		this.SSID = sSID;
	}


	/*AuthMode*/
	public String getAuthMode() {
		return AuthMode;
	}

	public void setAuthMode(String authMode) {
		this.AuthMode = authMode;
	}

	/*Firstseen*/
	public String getFirstseen() {
		return Firstseen;
	}

	public void setFirstseen(String firstseen) {
		this.Firstseen = firstseen;
	}

	/*Channel*/
	public int getChannel() {
		return Channel;
	}

	public void setChannel(String channel) {
		int Channel1 = Integer.parseInt(channel);
		this.Channel = Channel1;
	}
	
	
	/*RSSI*/
	public int getRSSI() {
		return RSSI;
	}

	public void setRSSI(String rSSI) {
		int RSSI1= Integer.parseInt(rSSI);
		this.RSSI = RSSI1;
	}


	/*CurrentLatitude*/
	public double getCurrentLatitude() {
		return CurrentLatitude;
	}

	public void setCurrentLatitude(String currentLatitude) {
		double currentLatitude1 = Double.parseDouble(currentLatitude);
		this.CurrentLatitude = currentLatitude1;
	}

	/*CurrentLongitude*/
	public double getCurrentLongitude() {
		return CurrentLongitude;
	}

	public void setCurrentLongitude(String currentLongitude) {
		double currentLongitude1 = Double.parseDouble(currentLongitude);
		this.CurrentLongitude = currentLongitude1;
	}
	
	
	/*AltitudeMeters*/
	public double getAltitudeMeters() {
		return AltitudeMeters;
	}

	public void setAltitudeMeters(String altitudeMeters) {
		double altitudeMeters1 = Double.parseDouble(altitudeMeters);
		this.AltitudeMeters = altitudeMeters1;
	}

   /*AccuracyMeters*/
	public int getAccuracyMeters() {
		return AccuracyMeters;
	}

	public void setAccuracyMeters(String accuracyMeters) {
		int accuracyMeters1= Integer.parseInt(accuracyMeters);
		this.AccuracyMeters = accuracyMeters1;
	}


    /*Type*/
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		this.Type = type;
	}



	public void setData(Meta_data data) {
		this.data = data;
	}



	@Override
	public Geom_element getGeom() {

		return null;
	}

	@Override
	public Meta_data getData() {

		return data;
	}

	@Override
	public void translate(Point3D vec) {


	}

}
