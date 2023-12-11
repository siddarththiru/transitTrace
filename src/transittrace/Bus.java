/*
*Bus.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/
package transittrace;

public class Bus extends TransportMode{
    private double emission;
    //Data from https://ourworldindata.org/grapher/carbon-footprint-travel-mode?tab=table (Bus Average was used)
    private final double EMISSION_VALUE = 97;
    public Bus(){
        emission = 0;
    }
    
    public Bus(double emission, boolean isElectric, boolean isPetrol, boolean isDiesel, boolean isHybrid) {
        this.emission = emission; 
    }
    
    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }

    
    @Override
    public double calculateCo2Emission() {
        emission = EMISSION_VALUE*distance;
        return emission;
    }   
}