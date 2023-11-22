package transittrace;
public class Car extends TransportMode{
    private boolean isElectric, isPetrol, isDiesel, isHybrid;
    private double emission;
    private String[][] emissionData;
    
    public Car(boolean isElectric, boolean isPetrol, boolean isDiesel, boolean isHybrid, double emission){
        this.isElectric = isElectric;
        this.isPetrol = isPetrol;
        this.isDiesel = isDiesel;
        this.isHybrid = isHybrid;
        this.emission = emission;
        emissionData = new String [][]{
            {"Electric", "47"}, {"Petrol", "170"}, {"Diesel", "171"}, {"Hybrid", "68"}
        };
    }
    
    public Car(){
        isElectric = false;
        isPetrol = false;
        isDiesel = false;
        isHybrid = false;
        emission = 0.0;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean getIsPetrol() {
        return isPetrol;
    }

    public void setIsPetrol(boolean isPetrol) {
        this.isPetrol = isPetrol;
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

    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }

    @Override
    public void calculateCo2Emission() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
