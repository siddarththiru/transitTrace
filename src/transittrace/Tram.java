/*
*Tram.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/
package transittrace;
public class Tram extends TransportMode{
    private double emission;
    private double emissionValue;
    public Tram() {
        emission = 0;
        emissionValue = 29;
    }
    
    public Tram(double emission){
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
