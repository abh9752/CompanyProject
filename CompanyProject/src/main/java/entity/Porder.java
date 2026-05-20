package entity;

public class Porder {
	
	private int id;
	private String name;
	private int a;
	private int b;
	private int c;
	public Porder(String name, int a, int b, int c) {
		super();
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

}
