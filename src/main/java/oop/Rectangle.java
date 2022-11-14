package oop;

public class Rectangle {
    private final Integer height;
    private final Integer width;

    public Rectangle(Integer height, Integer width) {

        if(height.equals(width) || height <= 0 || width <= 0){
            throw new IllegalArgumentException("The height should be different from the width and both higher than zero.");
        }

        this.height = height;
        this.width = width;
    }
}
