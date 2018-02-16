package Homework.HWLecture16.Task1;

import java.sql.*;
import java.util.Scanner;

public class MySqlSchoolData {


    private static final String DBNS_CONN_STRING = "jdbc:mysql://localhost:3306/school";
    private static final String DBNS_USERNAME = "root";
    private static final String DBNS_PASSWORD = "mainata970430";

    public void insertTeacher(){
        Scanner sc = new Scanner(System.in);
        String sqlStatement = "INSERT INTO teachers (name,email,salary) VALUES (?,?,?);";
        try (Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            System.out.print("Enter name:");
            statement.setString(1,sc.nextLine());
            System.out.print("Enter e-mail:");
            statement.setString(2,sc.next());
            System.out.print("Enter salary:");
            statement.setDouble(3,sc.nextDouble());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void getTeacher(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of teacher you want to find: ");
        String sqlStatement = String.format(" SELECT * FROM teachers WHERE id = '%d';",sc.nextInt());
        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            ResultSet rs = statement.executeQuery(sqlStatement);

            while (rs.next()){
                System.out.printf("%d %s %s %.2f %d",rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getDouble("salary"),rs.getInt("address_id"));
            }

        }catch (SQLException  ex ){
            ex.printStackTrace();
        }

    }
    public void getTeachers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit of salary: ");
        double upper = sc.nextDouble();
        System.out.print("Enter lower limit of salary: ");
        double lower = sc.nextDouble();

        String sqlStatement = String.format("SELECT * FROM teachers WHERE salary BETWEEN '%.2f' AND '%.2f';",upper,lower);
        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)){
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlStatement);


            while (rs.next()){
                System.out.printf("%s %s %.2f",rs.getString("name"),rs.getString("email"),rs.getDouble("salary"));
                System.out.println();
            }

        }catch (SQLException  ex ){
            ex.printStackTrace();
        }


    }
    public void insertStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter enrollment date:");
        System.out.println();
        System.out.print("Enter year:");
        int yyyy = sc.nextInt();
        System.out.print("Enter month:");
        int mm = sc.nextInt();
        System.out.print("Enter day:");
        int dd = sc.nextInt();


        String sqlStatement =String.format("INSERT INTO students (name,enrollment_date) VALUES ('%s',"+yyyy+"-"+mm+"-"+dd+");",name);
        try (Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);

            //statement.setString(1,name);

            statement.executeUpdate(sqlStatement);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //com.mysql.jdbc.MysqlDataTruncation: Data truncation: Incorrect date value: '1989' for column 'enrollment_date' at row 1 - защо ?

    }
    public void getStudent(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of student you want to find: ");
        String sqlStatement = String.format("SELECT * FROM students WHERE id = '%d';",sc.nextInt());
        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            ResultSet rs = statement.executeQuery(sqlStatement);

            while (rs.next()){
                System.out.printf("%d %s %tY %d",rs.getInt("id"),rs.getString("name"),rs.getDate("enrollment_date"),rs.getInt("address_id"));
            }

        }catch (SQLException  ex ){
            ex.printStackTrace();
        }

    }
    public void getStudents(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter enrollment date: ");
        System.out.print("Enter year: ");
        int yyyy = sc.nextInt();
        System.out.print("Enter month: ");
        int mm = sc.nextInt();
        System.out.print("Enter day: ");
        int dd= sc.nextInt();

        String sqlStatement = "SELECT * FROM students WHERE enrollment_date >= CAST('" +yyyy+ "-" +mm+ "-" +dd+ "' AS DATE);";
        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)){
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlStatement);

                while (rs.next()){
                    System.out.printf("%d %s %tY %d",rs.getInt("id"),rs.getString("name"),rs.getDate("enrollment_date"),rs.getInt("address_id"));
                }


        }catch (SQLException  ex ){
            ex.printStackTrace();
        }

    }
    public void getDisciplinesByTeacherId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of teacher to see all disciplines he/she is teaching: ");
        String sqlStatement = String.format("SELECT * FROM disciplines_taught WHERE id_teacher = '%d';",sc.nextInt());
        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            ResultSet rs = statement.executeQuery(sqlStatement);

            while (rs.next()){
                System.out.printf("%d %d",rs.getInt("id_disciplines"),rs.getInt("id_teacher"));
                System.out.println();
            }

        }catch (SQLException  ex ){
            ex.printStackTrace();
        }



    }
    public void getTeachersByDisciplineName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter discipline name to retrieve all teachers that are teaching it: ");
        String name = sc.nextLine();
        String sqlStatement ="SELECT id FROM disciplines WHERE name = ?;";
        String sqlStatement2 = "SELECT * FROM disciplines_taught WHERE id_disciplines = ?;";

        try(Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();

           int id_dis = 0;
           if(rs.next()){
               id_dis = rs.getInt("id");
           }

            PreparedStatement statement2 = con.prepareStatement(sqlStatement2);
            statement2.setInt(1,id_dis);
            ResultSet rs2 = statement2.executeQuery();

            while (rs2.next()){
                System.out.printf("%d %d",rs2.getInt("id_disciplines"),rs2.getInt("id_teacher"));
                System.out.println();
            }

        }catch (SQLException  ex ){
            ex.printStackTrace();
        }




    }


}
