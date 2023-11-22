package transittrace;

import java.util.Random;

public class Hard{
    
    private String[][] hard;
    private int i; 
    public Hard() {
        hard = new String[][]{
            {"What transportation mode aims to reduce emissions by moving multiple containers at once, primarily over water?",
             "A) Bicycles", "B) Cargo ships", "C) Passenger planes", "D) Motorcycles",
             "B) Cargo ships",
             "Cargo ships, especially those using cleaner fuels or efficiency measures, can reduce per-container emissions compared to other long-distance transport methods."},
            {"What innovation allows electric cars to be charged in public places similar to refueling gasoline cars?",
             "A) Electric pumps", "B) Battery banks", "C) Charging stations", "D) Power sockets",
             "C) Charging stations",
             "Public EV charging stations are expanding globally, allowing for greater ease and convenience for electric vehicle owners."},
            {"Which technology captures carbon emissions directly from the air to combat climate change?",
             "A) Carbon freezing", "B) Carbon capture and storage", "C) Carbon heating", "D) Carbon propulsion",
             "B) Carbon capture and storage",
             "Carbon capture and storage (CCS) technologies can significantly reduce CO2 emissions from power plants and industrial processes."}
            
        };
        i=0;
    }

    public void setRandomNumber(int i){    
        this.i=i;    
    }
     public String getQuestion(){
        return hard[i][0];
    }

     public String getOptions1() {
        return hard[i][1];
    }
    public String getOptions2() {
        return hard[i][2];
    }
    public String getOptions3() {
        return hard[i][3];
    }
    public String getOptions4() {
        return hard[i][4];
    }
    

    public String getAnswer() {
        return hard[i][5];
    }

    public String getFact(){ 
        return hard[i][6];
    }
    
}