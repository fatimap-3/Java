package sem3cosc2006;

public class Instructor extends Person {
	private String depart;
	
	public Instructor(int id,String name,String depart) {
		super(id,name);
		this.depart=depart;
	}
	public String getDepartment() {
		return depart;
	}
	public void setDepartment() {
		this.depart=depart;
	}
	@Override
	public String toString() {
		return "Instructor[id=" + getID() + ",name=" + getName() + ",department=" + getDepartment() + "]";
		}
	
}
