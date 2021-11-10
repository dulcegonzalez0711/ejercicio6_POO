/******************************************************************
Device.java
Autora: Dulce González
Clase abstracta que implemente 
******************************************************************/
import java.util.Date;

abstract class Device {
    protected double price;
	protected String serialNumber;
	protected String manufacturer;
	protected Date productionDate;
	protected String markerAR;
	protected String deviceType;

	 public double getPrecio(){
		return this.price;
	 }
	 public String getSN(){
		return this.serialNumber;
	 }
	 public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	
	public String getMarkerAR() {
		return markerAR;
	}
	
	public void setMarkerAR(String markerAR) {
		this.markerAR = markerAR;
	}
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}


}
