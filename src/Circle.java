public class Circle (double r){

    private double radius;

    public Circle(double r){
        this.radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }

}