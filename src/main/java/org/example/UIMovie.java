package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UIMovie {
    public void run() {
        List<Movie> movies = List.of(
                new Movie("Inception", 2010, 8.8),
                new Movie("The Godfather", 1972, 9.2),
                new Movie("Avengers: Endgame", 2019, 8.4),
                new Movie("Forrest Gump", 1994, 8.8)
        );
        Predicate<Movie> higherRating = movie -> movie.getRating() > 8.5;
        Comparator<Movie> sortingByRatingThenName = Comparator.comparing(Movie::getRating).thenComparing(Movie::getName);

        List<Movie> filteredAndSortedMovies = movies.stream()
                .filter(higherRating)
                .sorted(sortingByRatingThenName.reversed())
                .collect(Collectors.toList());

        Iterator<Movie> movieIterator = filteredAndSortedMovies.iterator();
        System.out.println("Filtered and Sorted Movies:");
        while (movieIterator.hasNext()) {
            Movie movie = movieIterator.next();
            if (movie.getRating() > 8.8) {
                movieIterator.remove();
            }
        }

        System.out.println("Remaining movies after removal:");
        filteredAndSortedMovies.forEach(System.out::println);
    }
}
