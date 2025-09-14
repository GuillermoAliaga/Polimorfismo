public abstract class Shape implements Comparable <Shape> {
    public abstract double area ();
    public int compareTo (Shape S){
        return Double.compare(this.area(), S.area());
    }
    protected static double sum(Shape[]v){
        double acc = 0;
        for (Shape S:v){
            acc += S.area();
        }
        return acc;
    }
}
