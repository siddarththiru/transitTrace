package transittrace;
public class Train extends TransportMode{
    private boolean isElectric, isDiesel;
    private double emission;
    private String[][] emissionData;

    public Train(boolean isElectric, boolean isDiesel, double emission) {
        this.isElectric = isElectric;
        this.isDiesel = isDiesel;
        this.emission = emission;
        emissionData = new String[][]{
            {"Electric","1"}, 
        };
    }

    public Train(){
        isElectric = false;
        isDiesel = false;
        emission = 0.0;
        
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
