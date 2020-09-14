public class Leg {
    private String LeftorRight;
    private int length;

    public Leg(String leftorRight, int length) {
        LeftorRight = leftorRight;
        this.length = length;
    }

    public String getLeftorRight() {
        return LeftorRight;
    }

    public int getLength() {
        return length;
    }

    public void setLeftorRight(String leftorRight) {
        LeftorRight = leftorRight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "LeftorRight='" + LeftorRight + '\'' +
                ", length=" + length +
                '}';
    }
}
