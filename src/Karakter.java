public class Karakter {

    int assignmentPoints = 0;
    int examPoints =0;
    int projectPoints =0;


    int addAssignmentPoints(int points) {
        assignmentPoints+= points;
        return assignmentPoints;
    }

    int addExamPoints(int points) {
        examPoints +=points;
        return examPoints;
    }

    int addProjectPoints(int points) {
        projectPoints += points;
        return projectPoints;
    }

    void printTotal() {
        int totalPoints = assignmentPoints + examPoints +projectPoints;

        System.out.println("Assignment points: " + assignmentPoints);
        System.out.println("Exam points: " +examPoints);
        System.out.println("Project points: " + projectPoints);
        System.out.println("Total points: " + totalPoints );

    }


    void main() {
        addAssignmentPoints(25);
        addExamPoints(40);
        addProjectPoints(30);
        printTotal();
    }
}

