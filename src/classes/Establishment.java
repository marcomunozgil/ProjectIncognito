package classes;

import java.util.*;
public class Establishment {
    private String managerName;
    private String establishment;
    private String address;

    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String nameManager)
    {
        this.managerName = nameManager;
    }
    public String getEstablishment()
    {
        return establishment;
    }
    public void setEstablishment(String newPlace){
        this.establishment = newPlace;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }

}
