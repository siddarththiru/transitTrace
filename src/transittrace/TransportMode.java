package transittrace;

public abstract class TransportMode {
    double duration;
    
    public TransportMode(){
        duration = 0;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }
    public Double getDuration(){
        return duration;
    }
    
    public abstract void calculateCo2Emission();
    
}
