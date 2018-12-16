public class Rectangle extends Shape{

    private int lenght;
    private int width;



    public Rectangle(String color ,int lenght, int width) {
        //super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double getArea() {
        return lenght * width;
    }

    public  void show(){
        System.out.println(this.getClass());
    }


}
