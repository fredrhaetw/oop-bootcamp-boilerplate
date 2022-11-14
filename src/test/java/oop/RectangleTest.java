package oop;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "The height should be different from the width and both higher than zero.")
    public void itShouldHaveHeightDifferentFromWidth() {
        new Rectangle(5,5);
    }


    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "The height should be different from the width and both higher than zero.")
    public void itShouldHaveHeightAndWidthHigherThanZero() {
        new Rectangle(0,0);
    }

    @Test
    public void itShouldCalculateItsOwnPerimeter() {
        Rectangle rectangle = new Rectangle(3,4);

        assertEquals(rectangle.getPerimeter(), 14);
    }

}
