public abstract class Student {
    private String studentName;
    private int[] testScore = new int[4];
    private String testResult;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public abstract void generateResult();

    // ! getters started from here...

    public String getStudentName() {
        return this.studentName;
    }

    public int[] getTestScores() {
        return this.testScore;
    }

    public String getTestResult() {
        return this.testResult;
    }

    // ! setters started from here...

    public void setTestScore(int testNumber, int testScore) {
        this.testScore[testNumber] = testScore;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
}