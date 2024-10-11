package com.java8.stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Movie {
    private String title;
    private LocalDate releaseDate;
    private Double rating;

    public Movie(String title, LocalDate releaseDate, Double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (" + releaseDate + "), Rating: " + rating;
    }
}

 class MovieSorter {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>(Arrays.asList(
            new Movie("Movie A", LocalDate.of(2022, 7, 15), 8.1),
            new Movie("Movie B", LocalDate.of(2023, 5, 10), 7.9),
            new Movie("Movie C", LocalDate.of(2021, 8, 20), 9.3),
            new Movie("Movie D", LocalDate.of(2020, 12, 18), 6.7),
            new Movie("Movie E", LocalDate.of(2023, 7, 10), 8.5),
            new Movie("Movie F", LocalDate.of(2019, 11, 9), 7.2),
            new Movie("Movie G", LocalDate.of(2023, 3, 22), 7.8),
            new Movie("Movie H", LocalDate.of(2022, 1, 1), 6.4),
            new Movie("Movie I", LocalDate.of(2021, 6, 15), 8.6),
            new Movie("Movie J", LocalDate.of(2020, 10, 7), 7.1),
            new Movie("Movie K", LocalDate.of(2023, 4, 5), 9.0),
            new Movie("Movie L", LocalDate.of(2022, 9, 23), 8.2),
            new Movie("Movie M", LocalDate.of(2023, 8, 12), 9.1),
            new Movie("Movie N", LocalDate.of(2019, 3, 18), 6.9),
            new Movie("Movie O", LocalDate.of(2023, 2, 25), 7.4),
            new Movie("Movie P", LocalDate.of(2020, 5, 14), 7.0),
            new Movie("Movie Q", LocalDate.of(2022, 10, 29), 8.7),
            new Movie("Movie R", LocalDate.of(2021, 7, 25), 6.8),
            new Movie("Movie S", LocalDate.of(2020, 4, 17), 7.6),
            new Movie("Movie T", LocalDate.of(2022, 6, 19), 7.5),
            new Movie("Movie U", LocalDate.of(2023, 1, 15), 9.2),
            new Movie("Movie V", LocalDate.of(2019, 2, 11), 6.5),
            new Movie("Movie W", LocalDate.of(2020, 8, 22), 7.3),
            new Movie("Movie X", LocalDate.of(2022, 12, 31), 8.9),
            new Movie("Movie Y", LocalDate.of(2023, 9, 30), 8.8),
            new Movie("Movie Z", LocalDate.of(2023, 9, 15), 9.5)
        ));

        // Sort by release date (latest first), then by rating (higher first)
       
        List<Movie> sortedMovieList = movies.stream().sorted(Comparator.comparing(Movie::getReleaseDate)
        									.reversed().thenComparing(Comparator.comparing(Movie::getRating)
        									.reversed())).collect(Collectors.toList());
        
        //sortedMovieList.forEach(System.out::println);
        
        movies.stream().sorted(Comparator.comparing(Movie::getReleaseDate)
				.reversed().thenComparing(Comparator.comparing(Movie::getRating)
				.reversed())).forEach(System.out::println);
    }
}
