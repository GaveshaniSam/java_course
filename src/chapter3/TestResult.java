package chapter3;

import java.util.Scanner;

public class TestResult {

    public static void main(String args[]){

        //Get the test score
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if (score < 80){
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is " +grade);
    }
}
