package students_grades;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames= {"Anna Karenina", "Samuel Jackson", "Audrey Hepburn"};
        int[] scores= {74, 38, 90};
        char[] grades= new char[studentNames.length];

        for (int i=0; i<studentNames.length; i++){
            int score= scores[i];
            char grade= 'F';
            if (score>=90 && score<=100){
                grade = 'A';
            } else if (score>=80 && score<90) {
                grade = 'B';
            } else if (score>=70 && score<80) {
                grade = 'C';
            } else if (score>=60 && score<70) {
                grade = 'D';
            } else if (score>=50 && score<60) {
                grade = 'E';
            }

            grades[i]= grade;

            System.out.println(studentNames[i] + "'s score is " + score + " and grade is " + grade);


        }




    }
}
