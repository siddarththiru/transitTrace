/*
*Metro.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/
package transittrace;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Metro extends TransportMode {
    private boolean isElectric, isDiesel;
    private double emission;
    private HashMap<String, Integer> emissionValues;
    //private String emissionData[][]; -Replaced with Hash Map
    

    public Metro(boolean isElectric, boolean isDiesel, double emission) {
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
        this.emission = emission;
        
        //Data from https://dataportal.orr.gov.uk/media/1dzb2awz/rail-emissions-2022-23.pdf
        emissionValues = new HashMap<>();
        emissionValues.put("electric", 17); //Value of Elizabeth line in London
        emissionValues.put("diesel", 92); //Value of Transport for Wales (TFW)
        
//        //Replaced with Hash Map  
//        emissionData = new String [][]{
//            {"Electric", "28"}, {"Diesel", "35"}
//        };
    }
    public Metro(){
        isElectric = false;
        isDiesel = false;
        emission = 0.0;
        
        //Data from https://dataportal.orr.gov.uk/media/1dzb2awz/rail-emissions-2022-23.pdf
        emissionValues = new HashMap<>();
        emissionValues.put("electric", 17); //Value of Elizabeth line in London
        emissionValues.put("diesel", 92); //Value of Transport for Wales (TFW)
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean getIsDiesel() {
        return isDiesel;
    }

    public void setIsDiesel(boolean isDiesel) {
        this.isDiesel = isDiesel;
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
            emission = emissionValues.get("electric")*distance;
        }
        else if (isDiesel){
            emission = emissionValues.get("diesel")*distance;
        }
        else{
            JOptionPane.showMessageDialog(null,"Error when calculating CO2 Emission for Metro");
        }
        return emission;
    }
    
}
