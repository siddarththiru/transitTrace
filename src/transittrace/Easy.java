package transittrace;
import java.lang.Math;
public class Easy{
    
    /*private String questions[];
    private String answers[];
    private String fact[];*/
    private String easy[][];
    private int i;
    public Easy(){
       /* questions= new String[]{
            "Which mode of transport produces zero emissions at the tailpipe?",
            "Which of these is a sustainable alternative to driving alone?",
            "What can cities implement to encourage walking and cycling?"
        
        };
        fact= new String[]{
            "Electric cars produce zero tailpipe emissions, helping in reducing air pollution in urban areas",
            "Carpooling helps in reducing the number of vehicles on the road, leading to fewer emissions and less traffic",
            "Pedestrian zones reduce traffic congestion and promote healthier modes of transportation."
        
        };*/
       i=0;
        /*easy=new String[][]{
            {"Which mode of transport produces zero emissions at the tailpipe?","Diesel Bus","Gasoline Car","Electric Car","Jet Plane","Electric car","Electric cars produce zero tailpipe emissions, helping in reducing air pollution in urban areas"},
            {"Which of these is a sustainable alternative to driving alone?","Carpooling", "Taking a jet","Driving two cars","Buying more cars","Carpooling","Carpooling helps in reducing the number of vehicles on the road, leading to fewer emissions and less traffic"},
            {"What can cities implement to encourage walking and cycling?","More highways","Wider parking spaces","Pedestrian zones","Larger airports","Pedestrian zones","Pedestrian zones reduce traffic congestion and promote healthier modes of transportation."}
        
        };*/
        
    easy = new String[][]{
        {
            "Which mode of transport produces zero emissions at the tailpipe?",
            "A) Diesel Bus","B) Gasoline Car","C) Electric Car","D) Jet Plane",
            "C) Electric Car",
            "Electric cars produce zero tailpipe emissions, helping in reducing air pollution in urban areas."
        },
        {
            "Which of these is a sustainable alternative to driving alone?",
            "A) Carpooling","B) Taking a jet","C) Driving two cars","D) Buying more cars",
            "A) Carpooling",
            "Carpooling helps in reducing the number of vehicles on the road, leading to fewer emissions and less traffic."
        },
        {
            "What can cities implement to encourage walking and cycling?",
            "A) More highways","B) Wider parking spaces","C) Pedestrian zones","D) Larger airports",
            "C) Pedestrian zones",
            "Pedestrian zones reduce traffic congestion and promote healthier modes of transportation."
        }
    };
    }
    public void setRandomNumber(int i){    
        this.i=i;    
    }
     public String getQuestion(){
        return easy[i][0];
    }

    public String getOptions1() {
        return easy[i][1];
    }
    public String getOptions2() {
        return easy[i][2];
    }
    public String getOptions3() {
        return easy[i][3];
    }
    public String getOptions4() {
        return easy[i][4];
    }
    

    public String getAnswer() {
        return easy[i][5];
    }

    public String getFact(){ 
        return easy[i][6];
    }
    
}
