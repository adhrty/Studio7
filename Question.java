public abstract class Question {

    private String question;
    private int points;


    public Question(String aQuestion, int numberOfPoints) {
        this.question = aQuestion;
        this.points = numberOfPoints;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void promptQuestion() {
        System.out.println(question);
    }

    public void captureAnswer(){

    }

    public void displayPossibleAnswer() {

    }

}
