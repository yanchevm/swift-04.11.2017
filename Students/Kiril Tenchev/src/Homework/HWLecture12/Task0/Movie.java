package Homework.HWLecture12.Task0;

import java.util.ArrayList;
import java.util.Date;

public class Movie {

    private String title;
    private String director;
    private String setActor;
    private ArrayList<String> actors; //Милен: Тук използвай полиморфизъм! 
    private Date realiseDate;

// Милен: Къде е втората част от задачата ? Трябва да запишеш този обект и след това да го прочетеш!
   public Movie (String titleValue,String directorValue,String setActorValue,Date realiseDateValue){
        title=titleValue;
        director=directorValue;
        setActor=setActorValue;
        actors= new ArrayList<>(100);
        realiseDate=realiseDateValue;

    }

    public void setActors(ArrayList<String> actors) {
        actors.add(setActor);
    }

    public void setSetActor(String setActorValue) {
        this.setActor = setActorValue;
    }

    public void setDirector(String directorValue) {
        this.director = directorValue;
    }

    public void setTitle(String titleValue) {
        this.title = titleValue;
    }

    public void setRealiseDate(Date realiseDateValue) {
        this.realiseDate = realiseDateValue;
    }

    public String getDirector() {
        return this.director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getRealiseDate() {
        return this.realiseDate;
    }

    public String getSetActor() {
        return setActor;
    }
}
