package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    Manager manager = new Manager();

    @Test
    public void shouldAdditionToTheFirstMovie() {
        manager.addMovie("first");
        String[] actual = manager.findAll();
        String[] expected = {"first"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllThirdMovie() {
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");

        String[] expected = {"first", "second", "third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFifthMovie() {
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");
        manager.addMovie("fourth");
        manager.addMovie("fifth");

        String[] expected = {"first", "second", "third", "fourth", "fifth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllSixthMovie() {
        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");
        manager.addMovie("fourth");
        manager.addMovie("fifth");
        manager.addMovie("sixth");

        String[] expected = {"first", "second", "third", "fourth", "Fifth"};
        String[] actual = manager.findAll();
    }

    @Test
    public void shouldAdditionOfTheSecondMovie() {
        String[] movies = {"first"};
        manager.setMovies(movies);

        manager.addMovie("second");
        String[] actual = manager.findLast();
        String[] expected = {"second", "first"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFifthFilmAddition() {
        String[] movies = {"first", "second", "third", "fourth"};
        manager.setMovies(movies);

        manager.addMovie("fifth");
        String[] actual = manager.findLast();
        String[] expected = {"fifth", "fourth", "third", "second", "first"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdditionOfSixthFilm() {
        String[] movies = {"first", "second", "third", "fourth", "fifth"};
        manager.setMovies(movies);

        manager.addMovie("sixth");
        String[] actual = manager.findLast();
        String[] expected = {"sixth", "fifth", "fourth", "third", "second"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdditionOfTheEleventhFilm() {
        Manager manager = new Manager(10);

        manager.addMovie("first");
        manager.addMovie("second");
        manager.addMovie("third");
        manager.addMovie("fourth");
        manager.addMovie("fifth");
        manager.addMovie("sixth");
        manager.addMovie("seventh");
        manager.addMovie("eighth");
        manager.addMovie("ninth");
        manager.addMovie("tenth");
        manager.addMovie("eleventh");
        String[] actual = manager.findLast();
        String[] expected = {"eleventh", "tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "fourth", "third", "second"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAdditionOfTheTenthFilm() {
        Manager manager = new Manager(10);
        String[] movies = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth"};
        manager.setMovies(movies);

        manager.addMovie("tenth");
        String[] actual = manager.findLast();
        String[] expected = {"tenth", "ninth", "eighth", "seventh", "sixth", "fifth", "fourth", "third", "second", "first"};
        assertArrayEquals(expected, actual);
    }
}
