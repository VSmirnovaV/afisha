import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();
    @BeforeEach
    public void setup() {

        manager.addFilms("Films1");
        manager.addFilms("Films2");
        manager.addFilms("Films3");
        manager.addFilms("Films4");
        manager.addFilms("Films5");
        manager.addFilms("Films6");
        manager.addFilms("Films7");
    }

    @Test
    public void findFilm() {

        String[] expected = {"Films1","Films2","Films3","Films4","Films5","Films6","Films7"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastAddFilms() {

        String[] expected = {"Films7","Films6","Films5","Films4","Films3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
