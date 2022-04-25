package thirtydayschallange;

import java.util.Scanner;

public class Inheritance {
static Scanner scanner = new Scanner(System.in);
    static class Person{

        String firstName;
        String lastName;
        int idNumber;
        int[] scores;

        public Person(String firstName, String lastName, int idNumber, int[] scores) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = idNumber;
            this.scores = scores;
        }
        public  char calc(){
            char grade;
            int average = 0;
            for (int i = 0; i < scores.length; i++){
                average += scores[i];
            }
            average /= scores.length;
            if (average<101 && average > 89){
                grade = 'O';
            }else if (average<90&&average>79){
                grade = 'E';
            }else if (average<80&&average>69){
                grade = 'A';
            }else if (average<70&&average>54){
                grade = 'P';
            }else if (average<55&&average>39){
                grade = 'D';
            }else{
                grade = 'T';
            }
            return grade;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getIdNumber() {
            return idNumber;
        }
    }
    static class Student extends Person{

        public Student(String firstName, String lastName, int idNumber, int[] scores) {
            super(firstName, lastName, idNumber, scores);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastname = scanner.nextLine();
        int idNumber = scanner.nextInt();
        int scoresCount = scanner.nextInt();
        int [] scoresArray = new int[scoresCount];

        Person student = new Student(firstName, lastname, idNumber, scoresArray);

        for (int i = 0; i < scoresArray.length; i++){
            scoresArray[i] = scanner.nextInt();
        }
        char average = student.calc();
        System.out.println("Name: " + student.getFirstName() + ", " + student.getLastName()
        +"\nID: " + student.getIdNumber()
        +"\nGrade: " + student.calc());
    }
}
