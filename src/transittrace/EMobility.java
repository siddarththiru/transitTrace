package transittrace;
public class EMobility extends TransportMode{
    private double emission;

    public EMobility() {
        emission=0;
    }
    
    public EMobility(double emission){
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