package Day_2;

public class PenDivider {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent = totalPens / numberOfStudents;

        int remainingPens = totalPens % numberOfStudents;
        System.out.println("Each student will get " + pensPerStudent + " pens.");
        System.out.println("Remaining pens that cannot be distributed equally: " + remainingPens);
    }
}

