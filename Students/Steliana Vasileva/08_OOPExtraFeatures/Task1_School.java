package com.company;

public class Task1_School {


   class Class{
       
        private int classNumber;
    }

    class Student extends Task1_School{

        private int studentNumber;

        public Student(){
        }
        public int getStudentNumber(){
            return studentNumber;
        }

        public void setStudentNumber(int studentNumber) {
            this.studentNumber = studentNumber;
        }


    }

    class Teacher extends Task1_School {
        Discipline discipline;
        private String teacherName;

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

        public String getTeacherName() {
            return teacherName;
        }
    }


        class Discipline extends Teacher {
            private String disciplineName;
            private int hoursPerWeek;

            public Discipline(){
            }
            public String getDisciplineName(String disciplineName){
                return disciplineName;
            }

            public void setDisciplineName(String disciplineName) {
                this.disciplineName = disciplineName;
            }

            public int getHoursPerWeek(int hoursPerWeek){
                return hoursPerWeek;
            }

            public void setHoursPerWeek(int hoursPerWeek) {
                this.hoursPerWeek = hoursPerWeek;
            }
        }

    }

