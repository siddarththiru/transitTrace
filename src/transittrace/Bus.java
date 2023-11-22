package transittrace;
public class Bus extends TransportMode{
    private double emission;
    private boolean isElectric, isDiesel, isHybrid;

    public Bus(){
        emission = 0;
        isElectric = false;
        isDiesel = false;
        isHybrid = false;
    }
    
    public Bus(double emission, boolean isElectric, boolean isPetrol, boolean isDiesel, boolean isHybrid) {
        this.emission = emission;
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
        this.isHybrid = isHybrid;
    }
    
    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
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

    public boolean getIsHybrid() {
        return isHybrid;
    }

    public void setIsHybrid(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }
    
    @Override
    public void calculateCo2Emission() {}
    
}
