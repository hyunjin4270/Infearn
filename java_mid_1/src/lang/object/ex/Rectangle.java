package lang.object.ex;

public class Rectangle {
    private int width;
    private int height;
    
    Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
        
    }

    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }

    @Override
    public boolean equals(Object object) {
        Rectangle rectangle = (Rectangle) object;
        return this.height == rectangle.height && this.width == rectangle.width;
    }

    
}
