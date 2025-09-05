package abstractClassesAndInterfaces;

import java.util.Arrays;

public class singAlong {

	public static void main(String[] args) {
//		animal[] animalArr = {
//				new dog("Tony", false, ""),
//				new cat("Mitzy", false),
//				new fish("Goldfish"),
//				new dog("Staffi", true, "")
//		};
//		startSinging(animalArr);
		animal[] dogArr = {
				new dog("Tony", false, "poodel"),
				new dog("Bulldogile", false, "bulldog"),
				new dog("Staffi", false, "amstaf"),
				new dog("Tony", false, "rottweiler"),
				new dog("Bulldogile", false, "poodel")
		};
		System.out.println("Original array:\n");
		System.out.println(Arrays.toString(dogArr));
		Arrays.sort(dogArr);
		System.out.println("New array:\n");
		System.out.println(Arrays.toString(dogArr));
	}
	
	public static void startSinging(animal[] arr) {
		for(animal a: arr) {
			System.out.println(a);
			a.say();
		}
	} 
}
