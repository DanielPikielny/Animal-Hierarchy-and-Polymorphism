package abstractClassesAndInterfaces;

public class fish extends animal{
//	private String name;
	
	public fish(String name) {
		super(name, false);
	}
	
	public void say() {
		//System.out.println();
	}
	
	public String toString() {
		return "\nfish: " + getName();
	}
}