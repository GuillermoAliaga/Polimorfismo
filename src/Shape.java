public abstract class Shape implements Comparable <Shape> {
    public abstract double area ();
    public int compareTo (Shape S){
        return Double.compare(this.area(), S.area());
    }
}
