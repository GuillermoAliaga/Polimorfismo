
public class Main {
    Shape[] v = new Shape[4];
    protected static double sum(Shape[]v){
        double acc = 0;
        for (Shape S:v){
            acc += S.area();
        }
        return acc;
    }
public static void main(String[] args) {
    Shape[] v = new Shape[4];
        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

    double res = sum(v);
    
    System.out.println("sum: " + res);


        print(v);

        sort(v);

        print(v);
    }
}