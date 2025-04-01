package it.exercise.spring.best_of_the_year.models;

public class Movie {

    private int id;
    private String title;
    private int releaseYear;
    private String director;

    public Movie(int id, String title, int releaseYear, String director) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + releaseYear + " - " + director;
    }

}
