public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString() {
        return "Point: " + label + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Object obj){
        //guard
        if(!(obj instanceof Point)){
            return false;
        }
        Point point = (Point) obj; //cast
        return (this.x == point.x &&
                this.y == point.y);

    }
}
