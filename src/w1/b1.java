package w1;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter Average point of Mathematics:");
        double math = input.nextDouble();

        System.out.println("Enter Average point of English:");
        double english = input.nextDouble();

        System.out.println("Enter Average point of Literature:");
        double literature = input.nextDouble();

        if (math >= 9) System.out.println("Grade of Mathematics: S");
        else if (math >= 8) System.out.println("Grade of Mathematics: A");
        else if (math >= 7) System.out.println("Grade of Mathematics: B");
        else if (math >= 6) System.out.println("Grade of Mathematics: C");
        else if (math >= 5) System.out.println("Grade of Mathematics: D");
        else System.out.println("Grade of Mathematics: F");

        if (english >= 9) System.out.println("Grade of English: S");
        else if (english >= 8) System.out.println("Grade of English: A");
        else if (english >= 7) System.out.println("Grade of English: B");
        else if (english >= 6) System.out.println("Grade of English: C");
        else if (english >= 5) System.out.println("Grade of English: D");
        else System.out.println("Grade of English: F");

        if (literature >= 9) System.out.println("Grade of Literature: S");
        else if (literature >= 8) System.out.println("Grade of Literature: A");
        else if (literature >= 7) System.out.println("Grade of Literature: B");
        else if (literature >= 6) System.out.println("Grade of Literature: C");
        else if (literature >= 5) System.out.println("Grade of Literature: D");
        else System.out.println("Grade of Literature: F");

        double average = (math + english + literature) / 3;
        double aveRound = Math.round(average * 100.0) / 100.0;
        // Math.round: làm tròn về số nguyên gần nhất
        // if 100 => int / int -> int ==> 100.0
        System.out.println("Average: " + aveRound);

//        int aveInt = (int) aveRound;
//        int lowest = (int) Math.min(math, Math.min(literature, english));

        double lowest = Math.min(math, Math.min(literature, english));
        // LOGIC
//        if (lowest < 5) aveInt = lowest;
//        else if (aveInt > lowest) aveInt = lowest + 1;

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