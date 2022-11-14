package oop;

public class Rectangle {
    public static final int PERIMETER_MULTIPLYING_FACTOR = 2;
    private final int height;
    private final int width;

    public Rectangle(final int height, final int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        return PERIMETER_MULTIPLYING_FACTOR * (height + width);
    }
}
