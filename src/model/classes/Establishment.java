package model.classes;

import model.inspections.Placard;

public class Establishment {
    private String managerName;
    private String establishmentName = "McDonald's";
    private String address;
    private boolean status = false; //this boolean will let the user know if the place has been inspected
    private Placard inspectionReport;


    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String nameManager)
    {
        this.managerName = nameManager;
    }
    public String getEstablishment()
    {
        return establishmentName;
    }
    public void setEstablishment(String newPlace){
        this.establishmentName = newPlace;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public boolean getStatus(){ return status; }
    public void setStatus(boolean status) { this.status = status; }
    public Placard getInspectionReport (){return inspectionReport; }
    public void setInspectionReport (Placard newReport) {this.inspectionReport = newReport; }
}
