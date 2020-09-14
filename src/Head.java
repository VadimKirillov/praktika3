public class Head {
    private int radius;
    private int iq;

    public Head(int radius, int iq) {
        this.radius = radius;
        this.iq = iq;
    }

    public int getRadius() {
        return radius;
    }

    public int getIq() {
        return iq;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Head{" +
                "radius=" + radius +
                ", iq=" + iq +
                '}';
    }
}
