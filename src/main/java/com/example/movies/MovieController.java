package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getAllmovies() {
        // Get API to retriew  all movie details
        List<Movie> data = movieService.allMovies();
        System.out.println(data);
        return new ResponseEntity<List<Movie>>(data, HttpStatus.OK);
    }

    @PostMapping("/api/createMovie")
    public ResponseEntity<Movie> addMovie(Movie movie) {
        // Post API to create a new movie
        return new ResponseEntity<Movie>(movieService.createMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        // Get API to retriew a single movie details based on imdbId
        Optional<Movie> data = movieService.singleMovie(imdbId);
        if (data == null) {
            return ResponseEntity.notFound().build(); // Return 404 Not Found
        }
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
