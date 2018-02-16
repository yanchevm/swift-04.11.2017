package Homework.HWLecture16.Task1;

import java.util.Scanner;

public class Task1Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        MySqlSchoolData mySqlSchoolData = new MySqlSchoolData();

        while(counter != -1) {
            System.out.println();
            System.out.println("------ Press 1 to create teacher ------ ");
            System.out.println("------ Press 2 to find teacher by ID ------ ");
            System.out.println("------ Press 3 to find all teachers with salary between X and Y ------ ");
            System.out.println("------ Press 4 to create student ------ ");
            System.out.println("------ Press 5 to find student by ID ------ ");
            System.out.println("------ Press 6 to find all students with enrollment date after date X ------ ");
            System.out.println("------ Press 7 to retrieves all disciplines he/she is teaching by teacher ID ------ ");
            System.out.println("------ Press 8 to retrieves all teachers that are teaching it by discipline name ------ ");
            System.out.print("Enter command: ");


            counter = sc.nextInt();

            if(counter == 1){
               mySqlSchoolData.insertTeacher();
            }
            else if(counter == 2){
                mySqlSchoolData.getTeacher();
            }
            else if(counter == 3){
               mySqlSchoolData.getTeachers();
            }
            else if(counter == 4){
                mySqlSchoolData.insertStudent();
            }
            else if(counter == 5){
                mySqlSchoolData.getStudent();
            }
            else if(counter == 6){
                mySqlSchoolData.getStudents();
            }
            else if(counter==7) {
               mySqlSchoolData.getDisciplinesByTeacherId();
            }
            else if(counter==8) {
                mySqlSchoolData.getTeachersByDisciplineName();
            }
            else if(counter == 0){
                return;
            }
        }



    }

}
