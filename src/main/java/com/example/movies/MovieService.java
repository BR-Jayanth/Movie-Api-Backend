package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> allMovies() {
        // Retriews all movies details
        List<Movie> data = movieRepository.findAll();
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        // Retriews single movie details based on imdbId
        return movieRepository.findMovieByImdbId(imdbId);
    }

    public Movie createMovie(Movie movieBody) {
        // adds a new movie to database
        Movie movie = movieRepository.insert(movieBody);

        return movie;
    }
    public String deleteMovie(ObjectId id) {
        // adds a new movie to database
        movieRepository.deleteById(id);

        return "success";
    }

}
