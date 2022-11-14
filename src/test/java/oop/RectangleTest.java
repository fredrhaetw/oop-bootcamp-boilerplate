package oop;


import org.testng.annotations.Test;

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

}
