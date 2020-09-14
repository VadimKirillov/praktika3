public class Hand {
    private String LeftorRight;
    private int length;

    public Hand(String leftorRight, int length) {
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
        return "Hand{" +
                "LeftorRight='" + LeftorRight + '\'' +
                ", length=" + length +
                '}';
    }
}
