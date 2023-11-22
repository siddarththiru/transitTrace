package transittrace;
public class Tram extends TransportMode{
    private double emission;
    private String emissionData;
    public Tram() {
        emission = 0;
        emissionData = "29";
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
    public void calculateCo2Emission() {}
    
}
