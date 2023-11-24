package sem3cosc2006;

public class Student extends Person {
    private double ave;

    public Student(int id, String name, double ave) {
        super(id, name);
        this.ave = ave;
    }

    public double getAverage() {
        return ave;
    }

    public void setAverage(double ave) {
        this.ave = ave;
    }

    @Override
    public String toString() {
        return "Student[id=" + getID() + ", name=" + getName() + ", GPA=" + getAverage() + "%]";
    }

}
	