package Homework.HWLecture16.Task0;

import java.sql.*;
import java.util.Scanner;

public class Service {

    private static final String DBNS_CONN_STRING = "jdbc:mysql://localhost:3306/sk1";
    private static final String DBNS_USERNAME = "root";
    private static final String DBNS_PASSWORD = "mainata970430";


    public void addActor () {
        Scanner sc = new Scanner(System.in);
        String sqlStatement = "INSERT INTO actors (name) VALUES (?);";
        try (Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD);
             PreparedStatement statement = con.prepareStatement(sqlStatement)) {
            System.out.println("Enter name:");
            statement.setString(1,sc.nextLine());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addActorToFilm(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of actor: ");
        String name=sc.nextLine();
        System.out.print("Enter title of movie in which actor play: ");
        String title=sc.nextLine();

        String sqlStatement = "SELECT id FROM actors WHERE name = ?;";
        String sqlStatement1 = "SELECT id FROM film WHERE name = ?;";
        String sqlStatement2= "INSERT INTO film_actor (id_film ,id_actor) VALUES (?,?);";
        try (Connection con = DriverManager.getConnection(DBNS_CONN_STRING, DBNS_USERNAME, DBNS_PASSWORD)) {
            PreparedStatement statement = con.prepareStatement(sqlStatement);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();

            int id_actor = 0;

            if (rs.next()) {
                id_actor = rs.getInt("id");
            }


            PreparedStatement statement1 = con.prepareStatement(sqlStatement1);
            statement1.setString(1,title);
            ResultSet rs1 = statement1.executeQuery();

            int id_film = 0;

            if (rs1.next()) {
                id_film = rs1.getInt("id");
            }


            PreparedStatement statement2 = con.prepareStatement(sqlStatement2);
            statement2.setInt(1,id_film);
            statement2.setInt(2,id_actor);

            statement2.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
