class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        // rectangle.setWidth(10);
        // rectangle.setHeight(5);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
    }
}

class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void setWidth(int w) {
        width = w;
    }
    
    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        height = h;
    }
    
    public int getHeight() {
        return height;
    }

    public int getArea() {
        return width * height;
    }
}

