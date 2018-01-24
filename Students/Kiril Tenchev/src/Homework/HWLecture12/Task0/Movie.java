//package Homework.HWLecture12.Task0;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//
//public class Movie {
//
//    private String title;
//    private String director;
//    private String setActor;
//    private List<String> actors;
//    private Date realiseDate;
//
//   public Movie (String titleValue,String directorValue,String setActorValue,Date realiseDateValue, List<String> actors){
//        title=titleValue;
//        director=directorValue;
//        setActor=setActorValue;
//        this.actors = actors;
//        realiseDate=realiseDateValue;
//
//    }
//
//    public void setActors(ArrayList<String> actors) {
//        actors.add(setActor);
//    }
//
//    public void setSetActor(String setActorValue) {
//        this.setActor = setActorValue;
//    }
//
//    public void setDirector(String directorValue) {
//        this.director = directorValue;
//    }
//
//    public void setTitle(String titleValue) {
//        this.title = titleValue;
//    }
//
//    public void setRealiseDate(Date realiseDateValue) {
//        this.realiseDate = realiseDateValue;
//    }
//
//    public String getDirector() {
//        return this.director;
//    }
//
//    public ArrayList<String> getActors() {
//        return actors;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//    public Date getRealiseDate() {
//        return this.realiseDate;
//    }
//
//    public String getSetActor() {
//        return setActor;
//    }
//
//
//    public static void main(String[] args) {
//       List<String> actors = new ArrayList<>();
//        actors.add("");
//
//       Movie titanic = new Movie(actors);
//    }
//}
