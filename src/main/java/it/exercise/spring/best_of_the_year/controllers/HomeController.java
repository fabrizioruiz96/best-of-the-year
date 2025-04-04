package it.exercise.spring.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.exercise.spring.best_of_the_year.models.Movie;
import it.exercise.spring.best_of_the_year.models.Song;

@Controller
@RequestMapping("/")
public class HomeController {

    // Route per la home page
    @GetMapping
    public String bestOfTheYear(@RequestParam(name = "name") String name,
            @RequestParam(name = "surname") String surname,
            Model model) {

        model.addAttribute("name", name);
        model.addAttribute("surname", surname);

        return "/BestOfTheYear";
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Interstellar", 2014, "Christopher Nolan"));
        movies.add(new Movie(2, "Blow", 2001, "Ted Demme"));
        movies.add(new Movie(3, "Il re leone", 1994, "Rob Minkoff, Roger Allers"));
        movies.add(new Movie(4, "Aladin", 1992, "Ron Clements, John Musker"));
        movies.add(new Movie(5, "Remember me", 2010, "Allen Coulter"));
        movies.add(new Movie(6, "Challengers", 2024, "Luca Guadagnino"));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Pursuit of Happiness", 2009, "Kid Cudi"));
        songs.add(new Song(2, "La prima volta", 2011, "Salmo"));
        songs.add(new Song(3, "L'angelo caduto", 2021, "Salmo, Shari"));
        songs.add(new Song(4, "La tua futura ex moglie", 2019, "Willie Peyote"));
        songs.add(new Song(5, "Scudo", 2019, "Gio Evan"));
        songs.add(new Song(6, "Bene", 2016, "Gemitaiz"));
        songs.add(new Song(7, "Sportswear", 2016, "Dark Polo Gang"));
        return songs;
    }

    // Route per ricevere la lista di film
    @GetMapping("/movies")
    public String getMovies(Model model) {

        // ESERCIZIO STEP 1
        // List<Movie> movies = getBestMovies();
        // String moviesString = "";

        // for (Movie m : movies) {
        // moviesString += m.getTitle() + ", ";
        // }

        // moviesString = moviesString.substring(0, moviesString.length() - 2);
        // model.addAttribute("movies", moviesString);

        // return "Movies";

        // ESERCIZIO STEP 2
        List<Movie> movies = getBestMovies();

        model.addAttribute("movies", movies);

        return "Movies";
    }

    // Route per la ricerca di un film tramite id
    @GetMapping("/movies/{id}")
    public String moviesId(@PathVariable("id") int id, Model model) {

        List<Movie> movies = getBestMovies();

        for (Movie m : movies) {
            if (m.getId() == id) {
                model.addAttribute("movie", m);
                break;
            }
        }

        return "MoviesById";

    }

    // Route per ricevere la lista di canzoni
    @GetMapping("/songs")
    public String getSongs(Model model) {

        // ESERCIZIO STEP 1
        // List<Song> songs = getBestSongs();
        // String songsString = "";

        // for (Song s : songs) {
        // songsString += s.getTitle() + ", ";
        // }

        // songsString = songsString.substring(0, songsString.length() - 2);
        // model.addAttribute("songs", songsString);

        // return "Songs";

        // ESERCIZIO STEP 2
        List<Song> songs = getBestSongs();

        model.addAttribute("songs", songs);

        return "Songs";
    }

    // Route per la ricerca di una canzone tramite id
    @GetMapping("/songs/{id}")
    public String songsId(@PathVariable("id") int id, Model model) {

        List<Song> songs = getBestSongs();

        for (Song s : songs) {
            if (s.getId() == id) {
                model.addAttribute("song", s);
                break;
            }
        }

        return "SongsById";
    }

}