package transittrace;
public class Motorbike extends TransportMode{
    private double emission;
    private String emissionData;

    public Motorbike() {
        emission=0;
        emissionData = "114";
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
    public void calculateCo2Emission() {}
}
