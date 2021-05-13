import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTests {

    @Test
    public void myFirstTest(){
        System.out.println("inside our first test.");
    }

    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
        String instructor1 = new String("Roland");
//        String instructor2 = new String("Kenneth");
        String instructor2 = instructor1;
        assertEquals(instructor1, instructor2);
        assertSame(instructor1, instructor2);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }
}
