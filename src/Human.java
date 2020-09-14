public class Human {
    private int age;
    private boolean men;
    Head head = new Head(10,200);
    Leg lleg  =  new Leg("Left",50);
    Leg rleg  =  new Leg("Right",52);
    Hand lhand = new Hand("Left", 40);
    Hand rhand = new Hand("Right", 41);

    public Human(int age, boolean men) {
        this.age = age;
        this.men = men;
    }

    public int getAge() {
        return age;
    }

    public boolean isMen() {
        return men;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMen(boolean men) {
        this.men = men;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", men=" + men +
                ", head=" + head +
                ", lleg=" + lleg +
                ", rleg=" + rleg +
                ", lhand=" + lhand +
                ", rhand=" + rhand +
                '}';
    }
}
