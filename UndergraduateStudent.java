public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        int averageScore = (this.getTestScores()[0] + this.getTestScores()[1] + this.getTestScores()[2]
                + this.getTestScores()[3]) / 4;

        if (averageScore < 60) {
            this.setTestResult("Fail");
        } else if (averageScore >= 60) {
            this.setTestResult("Pass");
        } else {
            this.setTestResult("Fail");
        }

    }

}
