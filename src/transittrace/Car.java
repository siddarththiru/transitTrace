/*
*Car.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/

package transittrace;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Car extends TransportMode{
    private boolean isElectric, isPetrol, isDiesel, isHybrid;
    private double emission;
    private HashMap<String, Integer> emissionValues;
    //private String[][] emissionData; - Replaced with HashMap
    
    public Car(boolean isElectric, boolean isPetrol, boolean isDiesel, boolean isHybrid, double emission){
        this.isElectric = isElectric;
        this.isPetrol = isPetrol;
        this.isDiesel = isDiesel;
        this.isHybrid = isHybrid;
        this.emission = emission;
        
        /*Emission Values from https://ourworldindata.org/travel-carbon-footprint*/
        emissionValues = new HashMap<>();
        emissionValues.put("electric", 47);
        emissionValues.put("petrol", 170);
        emissionValues.put("diesel", 171);
        emissionValues.put("hybrid", 68);
        
        /*Replaced with Hashmap
        emissionData = new String [][]{
            {"Electric", "47"}, {"Petrol", "170"}, {"Diesel", "171"}, {"Hybrid", "68"}
        };*/
    }
    
    public Car(){
        isElectric = false;
        isPetrol = false;
        isDiesel = false;
        isHybrid = false;
        emission = 0.0;
        
        emissionValues = new HashMap<>();
        emissionValues.put("electric", 47);
        emissionValues.put("petrol", 170);
        emissionValues.put("diesel", 171);
        emissionValues.put("hybrid", 68);
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    protected void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean getIsPetrol() {
        return isPetrol;
    }

    public void setIsPetrol(boolean isPetrol) {
        this.isPetrol = isPetrol;
    }

    public boolean getIsDiesel() {
        return isDiesel;
    }

    public void setIsDiesel(boolean isDiesel) {
        this.isDiesel = isDiesel;
    }

    public boolean getIsHybrid() {
        return isHybrid;
    }

    public void setIsHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }

    @Override
    public double calculateCo2Emission() {
       if (isElectric){
            emission = emissionValues.get("electric") * distance;
       }
       else if (isPetrol){
            emission = emissionValues.get("petrol") * distance;
       }
       else if (isDiesel){
            emission = emissionValues.get("diesel") * distance;
       }
       else if (isHybrid){
           return emission = emissionValues.get("hybrid") * distance;
       }
       else{
            JOptionPane.showMessageDialog(null,"Error when calculating Co2 Emissions");
       }
       return emission;
    }
    
}
