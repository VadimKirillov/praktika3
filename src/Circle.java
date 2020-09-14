public class Circle {

    private int radius;
    private int centrx;
    private int centry;

    public int getCentrx() {
        return centrx;
    }

    public int getCentry() {
        return centry;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCentrx(int centrx) {
        this.centrx = centrx;
    }

    public void setCentry(int centry) {
        this.centry = centry;
    }

    public Circle(int radius, int centrx, int centry) {
        this.radius = radius;
        this.centrx = centrx;
        this.centry = centry;
    }

}
