public class GraduateStudent extends Student {
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    @Override
    public void generateResult() {
        for (int i = 0; i < 4; i++) {
            if (this.getTestScores()[i] < 70) {
                this.setTestResult("Fail");
            } else if (this.getTestScores()[i] >= 70) {
                this.setTestResult("Pass");
            } else {
                this.setTestResult("Fail");
            }
        }
    }
}
