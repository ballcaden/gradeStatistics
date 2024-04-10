import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        int highest = 0;
        int lowest = 100;
        double total = 0;
        String tempLow = "";
        String tempHigh = "";

        grades.put("Algebra", 75);
        grades.put("American Government", 100);
        grades.put("Chemistry", 78);
        grades.put("Computer Programming", 71);
        grades.put("ELA III", 93);
        grades.put("Spanish III", 68);

        System.out.println("Grades by Subject: ");
        for(String grade : grades.keySet()){
            total += grades.get(grade);
            System.out.printf("%-15s%10d",grade, grades.get(grade));
            System.out.println();
            if (grades.get(grade) >= highest){
                highest = grades.get(grade);
                tempHigh = grade;
            }
            if(grades.get(grade) <= lowest){
                lowest = grades.get(grade);
                tempLow = grade;
            }
        }

        System.out.println("\nNumber of Classes: " + grades.size());

        System.out.println("\nLowest Grade \nSubject: " + tempLow + "\nGrade: " + lowest);

        System.out.println("\nHighest Grade \nSubject: " + tempHigh + "\nGrade: " + highest);

        System.out.println("\nOverall Average: " + (total/grades.size()));


    }
}