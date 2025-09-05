package abstractClassesAndInterfaces;

public class cat extends animal{
//	private String name;
//	private boolean isAsleep;
	
	public cat(String name, boolean isAsleep) {
		super(name, isAsleep);
	}
	
	public void say() {
		String s;
		s = isAsleep() ? "Shh... Cat is sleeping..." : "Meow meow";
		System.out.println(s);
	}
}