package it.exercise.spring.best_of_the_year.models;

public class Song {

    private int id;
    private String title;
    private int releaseYear;
    private String singer;

    public Song(int id, String title, int releaseYear, String singer) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.singer = singer;
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

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + releaseYear + " - " + singer;
    }

}
