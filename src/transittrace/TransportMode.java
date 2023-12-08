/*
*TransportMode.java
*@author Siddarth Thirunavukkarasu
*17-11-2023
*/
package transittrace;

public abstract class TransportMode {
    double distance;
    
    public TransportMode(){
        distance = 0;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public Double getDistance(){
        return distance;
    }
    
    public abstract double calculateCo2Emission();
    
}
