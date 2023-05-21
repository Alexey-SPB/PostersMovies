import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PostersMoviesTest {
    PostersMoviesManager manager1 = new PostersMoviesManager();
    PostersMoviesManager manager2 = new PostersMoviesManager(3);

    PostersMovies film1 = new PostersMovies(1, "Бладшот", "боевик");
    PostersMovies film2 = new PostersMovies(2, "Вперёд", "мультфильм");
    PostersMovies film3 = new PostersMovies(3, "Отель \"Белград\"", "комедия");
    PostersMovies film4 = new PostersMovies(4, "Джентельмены", "боевик");
    PostersMovies film5 = new PostersMovies(5, "Человек-невидимка", "ужасы");
    PostersMovies film6 = new PostersMovies(6, "Тролли. Мировой тур", "мультфильм");
    PostersMovies film7 = new PostersMovies(7, "Номер один", "комедия");

    @BeforeEach
    public void setup1() {
        manager1.addNewFilm(film1);
        manager1.addNewFilm(film2);
        manager1.addNewFilm(film3);
        manager1.addNewFilm(film4);
        manager1.addNewFilm(film5);
        manager1.addNewFilm(film6);
        manager1.addNewFilm(film7);
    }

    @BeforeEach
    public void setup2() {
        manager2.addNewFilm(film1);
        manager2.addNewFilm(film2);
        manager2.addNewFilm(film3);
        manager2.addNewFilm(film4);
        manager2.addNewFilm(film5);
        manager2.addNewFilm(film6);
        manager2.addNewFilm(film7);
    }

    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager1.getLimitPosters());
    }

    @Test
    public void testLimitManagerForThree() {

        Assertions.assertEquals(3, manager2.getLimitPosters());
    }

    @Test
    public void addNewMovie() {

        PostersMovies[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PostersMovies[] actual = manager1.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        PostersMovies[] expected = {film7, film6, film5, film4, film3};
        PostersMovies[] actual = manager1.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastForThree() {

        PostersMovies[] expected = {film7, film6, film5};
        PostersMovies[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
