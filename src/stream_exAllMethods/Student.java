package stream_exAllMethods;

public class Student {
	private String name;
	private int rollNum;
	private String brand;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(String name, int rollNum, String brand, int mark) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.brand = brand;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", brand=" + brand + ", mark=" + mark + "]";
	}
	
	

}
