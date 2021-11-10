/******************************************************************
Device.java
Autora: Dulce González
******************************************************************/
import java.util.Date;

public class Device {
    protected double price;
	protected String serialNumber;
	protected String manufacturer;
	protected String productionDate;
	protected String markerAR;
	protected String deviceType;
        
        public Device(String serialNumber, String manufacturer, String productionDate, String markerAR, String deviceType ){
            this.serialNumber = serialNumber;
            this.manufacturer = manufacturer;
            this.productionDate = productionDate;
            this.markerAR = markerAR;
            this.deviceType = deviceType;
        }

	 public double getPrecio(){
		return this.price;
	 }
	 public String getSN(){
		return this.serialNumber;
	 }
	 public void setProductionDate(String productionDate) {
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
        
       public void Funcionalidades(){
           
       }


}