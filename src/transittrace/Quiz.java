package transittrace;

public class Quiz {
    private String currentquestion;
    private String correctAnswer;
    private String answer;
    private String fact;
    private String difficulty;
        
    public Quiz(){
        currentquestion="";
        correctAnswer="";
        answer="";
        fact="";
        difficulty="";
            
    }
    Easy e=new Easy();
    Medium m=new Medium();
    Hard h=new Hard();
    Extreme E=new Extreme(); 
    
    public void setDiffiulty(String difficulty){
        this.difficulty=difficulty;
    }
    public void setCurrentquestion(String currentquestion){
        if(difficulty.equalsIgnoreCase("easy")){
            this.currentquestion = e.getQuestion();
        }
        else if(difficulty.equalsIgnoreCase("medium")){
            this.currentquestion = m.getQuestion();
        }
        else if(difficulty.equalsIgnoreCase("hard")){
            this.currentquestion = h.getQuestion();
        }
        else if(difficulty.equalsIgnoreCase("extreme")){
            this.currentquestion = E.getQuestion();
        }
    }

    public void setCorrectAnswer(String correctAnswer) {
        if(difficulty.equalsIgnoreCase("easy")){
            this.correctAnswer = e.getAnswer();
        }
        else if(difficulty.equalsIgnoreCase("medium")){
            this.correctAnswer = m.getAnswer();
        }
        else if(difficulty.equalsIgnoreCase("hard")){
            this.correctAnswer = h.getAnswer();
        }
        else if(difficulty.equalsIgnoreCase("extreme")){
            this.correctAnswer = E.getAnswer();
        }
    }
    

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void setFact(String fact) {
        this.fact = fact;
        if(difficulty.equalsIgnoreCase("easy")){
            this.fact = e.getFact();
        }
        else if(difficulty.equalsIgnoreCase("medium")){
            this.fact = m.getFact();
        }
        else if(difficulty.equalsIgnoreCase("hard")){
            this.fact = h.getFact();
        }
        else if(difficulty.equalsIgnoreCase("extreme")){
            this.fact = E.getFact();
        }
    }

    public String getCurrentquestion() {
        return currentquestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
}
        
        

