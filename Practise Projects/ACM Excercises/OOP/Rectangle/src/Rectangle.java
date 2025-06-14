public class Rectangle {
    double width;
    double height;

    Rectangle(){
        width = 1.0;
        height = 1.0;
    }
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (width * height);
    }
    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }

    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
}
