package abstractClassesAndInterfaces;

public abstract class animal {
	private String name;
	private boolean isAsleep;
	private String className = this.getClass().getSimpleName();
	
	public animal(String name, boolean isAsleep) {
		this.name = name;
		this.isAsleep = isAsleep;
	}

	public String getName() {
		return name;
	}

	public boolean isAsleep() {
		return isAsleep;
	}
	
//	public String sleepMessage() {
//		return "Shhh... the " + className + " is sleeping now...";
//	}
	
	public String toString() {
		String sleepState = isAsleep ? "Sleeping...": "Awake!";
		return "\n" + className + ": " + name + ", " + sleepState;
	}
	
	public abstract void say();

}
