package fmi.informatics.SortingPackage;
import java.util.Random;
import static org.junit.Assert.assertEquals;
public class SortTest {
    @org.junit.Test
    public void selectStrings() {
        Sort selected = new Sort();
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        String resultSet = selected.selectStrings("Ivan", "Panayotov", rand_int1);
        assertEquals( "Ivan Panayotov at age " + rand_int1, resultSet);
    }
}