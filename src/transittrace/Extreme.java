package transittrace;

import java.util.Random;

public class Extreme{
    
    private String[][] extreme;
    private int i;

    public Extreme() {
        extreme = new String[][]{
            {"What's the term for the deliberate reduction in the consumption of goods to reduce environmental impact?",
             "A) Consumerism", "B) Minimalism", "C) Capitalism", "D) Decoupling",
             "B) Minimalism",
             "Minimalism focuses on reducing excess and intentionally consuming, which can lead to a smaller environmental footprint."},
            {"Which gas, other than CO2, has significant global warming potential and is released from agriculture and waste management?",
             "A) Nitrogen", "B) Methane"," C) Oxygen", "D) Argon",
             "B) Methane",
             "Methane has a global warming potential many times greater than CO2, making its management crucial in climate change mitigation."},
            {"In urban planning, what concept promotes compact city design to make services and work more accessible and reduce the need for cars?",
             "A) Urban sprawl", "B) Urban decay","C) Urban densification", "D) Urban drifting",
             "C) Urban densification",
             "Urban densification can lead to reduced vehicle emissions by minimizing the need for long commutes and promoting walking or cycling."}
        };
        i=0;
    }

    
    public void setRandomNumber(int i){    
        this.i=i;    
    }
    public String getQuestion(){
        return extreme[i][0];
    }

   public String getOptions1() {
        return extreme[i][1];
    }
    public String getOptions2() {
        return extreme[i][2];
    }
    public String getOptions3() {
        return extreme[i][3];
    }
    public String getOptions4() {
        return extreme[i][4];
    }
    

    public String getAnswer() {
        return extreme[i][5];
    }

    public String getFact(){ 
        return extreme[i][6];
    }
    
}
    

