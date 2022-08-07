
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    private int limit;


    @Test

    public void testFindLast() {

        MoviesManager manager = new MoviesManager(limit = 10);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");
        manager.addMovie("movie11");
        manager.addMovie("movie12");
        manager.addMovie("movie13");
        manager.addMovie("movie14");
        manager.addMovie("movie15");

        String[] actual = manager.findLast();
        String[] expected = {"movie15", "movie14", "movie13", "movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6"};


        assertArrayEquals(expected, actual);
    }
}

