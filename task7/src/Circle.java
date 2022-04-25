public class Circle {
    private Point center;
    private double radius;
    public Circle(){
        this.center = new Point();
        this.radius = 1.0;
    }
    public Circle(int xCenter, int yCenter, double radius){
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }
    public String toString(){
        return "Circle[center = " + center +", radius =" + radius + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2.0 * Math.PI * radius;
    }
    public double distance(Circle another){
        return center.distance(another.center);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(1, 2, 3.3);
        System.out.println(c2);
        Circle c3 = new Circle(new Point(4,5), 6.5);
        System.out.println(c3);
        //test setters and getters
        c1.setCenter(new Point(11,12));
        c1.setRadius(13);
        System.out.println(c1.toString());
        System.out.println("center is:" + c1.getCenter());
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center x : " + c1.getCenterX());
        System.out.println("center y: " + c1.getCenterY());
        c1.setCenterXY(31,33);
        System.out.println(c1);
        System.out.println("center's x: " + c1.getCenterX());
        System.out.println("center's y: " + c1.getCenterY());

        //Test getArea() and getCircumference
        System.out.printf("Area : %.2f%n " ,c1.getArea());
        System.out.printf("Circumfence: %.2f%n", c1.getCircumference());
        //test distance
        System.out.printf("distance: %.2f%n" , c1.distance(c2));
        System.out.printf("distance: %.2f%n" , c2.distance(c1));
    }
}
