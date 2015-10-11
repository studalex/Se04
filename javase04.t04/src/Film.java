import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Film implements Serializable{

    private ArrayList<Actors> actors;
    private String filmName;
    private GregorianCalendar date;
    private StringBuilder description;

    public ArrayList<Actors> getActors() {
        return actors;
    }

    public void setActors(Actors... actors) {
        this.actors.clear();
        for (Actors actor : actors) {
            this.actors.add(actor);
        }
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public GregorianCalendar  getDate() {
        return date;
    }

    public void setDate(GregorianCalendar  date) {
        this.date = date;
    }

    public StringBuilder getDescription() {
        return description;
    }

    public void setDescription(StringBuilder description) {
        this.description = description;
    }

    public Film() {
        this.actors = new ArrayList<Actors>();
        this.filmName = new String();
        this.date = new GregorianCalendar();
        this.description = new StringBuilder();
    }

    public Film(String filmName, GregorianCalendar  date, String description, Actors... actors) {
        this.actors = new ArrayList<Actors>();
        this.filmName = new String();
        this.date = new GregorianCalendar();
        this.description = new StringBuilder();

        setFilm(filmName, date, description, actors);
    }


    public void setFilm(String filmName, GregorianCalendar date, String description, Actors... actors) {
        this.filmName = filmName;
        this.date = date;
        this.description.append(description);
        for (Actors actor : actors) {
            this.actors.add(actor);
        }
    }

    public String getFilmInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        StringBuilder filmInfo = new StringBuilder();

        filmInfo.append("Film: "+ this.filmName);
        filmInfo.append('\n');
        filmInfo.append("Date: " + this.date.get(Calendar.YEAR));
        filmInfo.append('\n');
        for (Actors actor : actors) {
            filmInfo.append("Actor: " + actor + ", ");
        }
        filmInfo.append('\n');
        filmInfo.append("Description: " + description);
        filmInfo.append('\n');
        return filmInfo.toString();
    }
}
