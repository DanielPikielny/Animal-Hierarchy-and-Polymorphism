package abstractClassesAndInterfaces;

public class dog extends animal implements Comparable<dog>{
	private String type;
	public dog(String name, boolean isAsleep, String type) {
		super(name, isAsleep);
		this.type = type;
	}
	
	public void say() {
		String s;
		s = isAsleep() ? "Shh... Dog is sleeping..." : "Woof woof";
		System.out.println(s);
	}
	
	public String toString() {
		return super.toString() + "    (type: " + type + ")";
	}
	
	public int compareTo(dog other) {
		int x = getName().compareTo(other.getName());
		if (x == 0) {
			return this.type.compareTo(other.type);
		}
		return x;
	}
}