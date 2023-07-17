import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();
    @Test
    public void findFilm() {

        manager.addFilms("Films1");
        manager.addFilms("Films2");
        manager.addFilms("Films3");
        manager.addFilms("Films4");
        manager.addFilms("Films5");
        manager.addFilms("Films6");
        manager.addFilms("Films7");

        String[] expected = {"Films1","Films2","Films3","Films4","Films5","Films6","Films7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastMoreArray() {

        manager.addFilms("Films1");
        manager.addFilms("Films2");
        manager.addFilms("Films3");
        manager.addFilms("Films4");
        manager.addFilms("Films5");
        manager.addFilms("Films6");
        manager.addFilms("Films7");

        String[] expected = {"Films7","Films6","Films5","Films4","Films3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessArray() {

        manager.addFilms("Films1");
        manager.addFilms("Films2");
        manager.addFilms("Films3");
        manager.addFilms("Films4");


        String[] expected = {"Films4","Films3","Films2","Films1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastArray() {

        manager.addFilms("Films1");
        manager.addFilms("Films2");
        manager.addFilms("Films3");
        manager.addFilms("Films4");
        manager.addFilms("Films5");


        String[] expected = {"Films5","Films4","Films3","Films2","Films1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
