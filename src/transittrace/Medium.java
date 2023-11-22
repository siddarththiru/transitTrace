package transittrace;

import java.util.Random;

public class Medium  {
    
    private String[][] medium;
    private int i;

    public Medium() {
        medium = new String[][]{
            {"Which city was among the first to introduce a congestion charge to reduce traffic in its central areas?",
             "A) New York", "B) Tokyo","C) London", "D) Delhi",
             "C) London",
             "London introduced the congestion charge in 2003 to decrease traffic and improve air quality in the city center."},
            {"What's an advantage of using hybrid vehicles?",
             "A) They can fly", "B) They use both gasoline and electricity","C) They run on water","D) They are always self-driving",
             "B) They use both gasoline and electricity",
             "Hybrid vehicles often offer better fuel efficiency and produce fewer emissions compared to traditional gasoline vehicles."},
            {"Which energy source is primarily used for electric buses?",
             "A) Coal","B) Solar panels", "C) Batteries", "D) Wind turbines",
             "C) Batteries",
             "Electric buses typically rely on large-capacity batteries, which can be charged using renewable energy sources."}
        };
        int i=0;
    }

    public void setRandomNumber(int i){    
        this.i=i;    
    }
     public String getQuestion(){
        return medium[i][0];
    }

    public String getOptions1() {
        return medium[i][1];
    }
    public String getOptions2() {
        return medium[i][2];
    }
    public String getOptions3() {
        return medium[i][3];
    }
    public String getOptions4() {
        return medium[i][4];
    }
    

    public String getAnswer() {
        return medium[i][5];
    }

    public String getFact(){ 
        return medium[i][6];
    }
    
    
}