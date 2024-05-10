package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domian.Movie;
import ru.netology.manager.ManagerMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerMovieTest {

    ManagerMovie movie = new ManagerMovie();

    private Movie movie1 = new Movie(1, "Бладшот", "боевик", false);
    private Movie movie2 = new Movie(2, "Вперёд", "мультфильм", false);
    private Movie movie3 = new Movie(3, "Отель 'Белград'", "комедия", false);
    private Movie movie4 = new Movie(4, "Джентельмены", "боевик", false);
    private Movie movie5 = new Movie(5, "Человек-невидимка", "ужасы", false);
    private Movie movie6 = new Movie(6, "Тролли. Мировой тур", "мультфильм", true);
    private Movie movie7 = new Movie(7, "Номер один", "комедия", true);
    private Movie movie8 = new Movie(8, "Человек-невидимка", "ужасы", false);
    private Movie movie9 = new Movie(9, "Тролли. Мировой тур", "мультфильм", true);
    private Movie movie10 = new Movie(10, "Номер один", "комедия", true);
    private Movie movie11 = new Movie(11, "Номер один", "комедия", true);

    @Test
    public void choiсeMovie() {
        movie.add(movie5);
        movie.add(movie6);

        Movie[] expected = {movie5, movie6};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void resetMovie() {
        Movie[] expected = {};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMovies() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);
        movie.add(movie11);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMoviesLimit() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);


        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllLimit5() {

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);


        Movie[] expected = {movie1, movie2, movie3, movie4, movie5};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovie7() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit10() {
        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenLimit5() {
        ManagerMovie movie = new ManagerMovie(5);

        movie.add(movie1);
        movie.add(movie2);
        movie.add(movie3);
        movie.add(movie4);
        movie.add(movie5);
        movie.add(movie6);
        movie.add(movie7);
        movie.add(movie8);
        movie.add(movie9);
        movie.add(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6};
        Movie[] actual = movie.findLastTen();

        assertArrayEquals(expected, actual);
    }
}
