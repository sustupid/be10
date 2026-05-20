package w1;

import java.util.Scanner;

public class b1 {

    static void Grade(double score, String subject){
        if (score >= 9) System.out.println("Grade: S");
        else if (score >= 8) System.out.println("Grade: A");
        else if (score >= 7) System.out.println("Grade: B");
        else if (score >= 6) System.out.println("Grade: C");
        else if (score >= 5) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter Average point of Mathematics:");
        double math = input.nextDouble();
        System.out.println("Enter Average point of English:");
        double english = input.nextDouble();
        System.out.println("Enter Average point of Literature:");
        double literature = input.nextDouble();

        input.close();

        Grade(math, "Math");
        Grade(english, "English");
        Grade(literature, "Literature");

        double average = (math + english + literature) / 3;
        double aveRound = Math.round(average * 100.0) / 100.0;
        System.out.println("Average: " + aveRound);
        // Math.round: làm tròn về số nguyên gần nhất
        // if 100 => int / int -> int ==> 100.0

//        int aveInt = (int) aveRound;
//        int lowest = (int) Math.min(math, Math.min(literature, english));
        // LOGIC
//        if (lowest < 5) aveInt = lowest;
//        else if (aveInt > lowest) aveInt = lowest + 1;

        double lowest = Math.min(math, Math.min(literature, english));

        if (lowest < 5) aveRound = lowest;
        else if (aveRound > lowest) aveRound = lowest + 1;


        if (aveRound >= 9) System.out.println("S -> Excellent student");
        else if (aveRound >= 8) System.out.println("A -> Good student");
        else if (aveRound >= 7) System.out.println("B -> Normal student");
        else if (aveRound >= 6) System.out.println("C -> Average student");
        else if (aveRound >= 5) System.out.println("D -> Not bad student");
        else System.out.println("Student Grade: F -> Fail student");

//        switch (aveInt) {
//            case 10:
//            case 9:
//                System.out.println("S -> Excellent student");
//                break;
//            case 8:
//                System.out.println("A -> Good student");
//                break;
//            case 7:
//                System.out.println("B -> Normal student");
//                break;
//            case 6:
//                System.out.println("C -> Average student");
//                break;
//            case 5:
//                System.out.println("D -> Not bad student");
//                break;
//            default:
//                System.out.println("Student Grade: F -> Fail student");
//        }
    }
}