/*
*Motorbike.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/
package transittrace;
public class Motorbike extends TransportMode{
    private double emission;
    private double emissionValue;

    public Motorbike() {
        emission=0;
        //Data from https://ourworldindata.org/grapher/carbon-footprint-travel-mode?tab=table
        emissionValue = 114;
    }
    
    public Motorbike(double emission){
        this.emission=emission;
    }
    
    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }
    
    @Override
    public double calculateCo2Emission() {
        emission = emissionValue*distance;
        return emission;
    }
}
