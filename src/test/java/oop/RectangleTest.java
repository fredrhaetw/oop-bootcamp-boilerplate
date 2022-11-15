package oop;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void itShouldCalculateItsOwnPerimeter() {
        Rectangle rectangle = new Rectangle(3,4);

        assertEquals(rectangle.getPerimeter(), 14);
    }

    @Test
    public void itShouldReturnActualHeigt() {
        Rectangle rectangle = new Rectangle(3,4);

        assertEquals(rectangle.getHeight(), 3);
    }

    @Test
    public void itShouldReturnActualWidht() {
        Rectangle rectangle = new Rectangle(3,4);

        assertEquals(rectangle.getWidth(), 4);
    }

    @Test
    public void itShouldCalculateArea() {
        Rectangle rectangle = new Rectangle(3,4);

        assertEquals(rectangle.getArea(), 12);
    }

}
