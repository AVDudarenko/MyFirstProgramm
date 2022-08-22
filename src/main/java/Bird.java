public interface Bird {
	// i create default methods, because, all birds can seat and fly.
	default void seat(String nameOfBird) {
		System.out.println(nameOfBird + " seat.");
	}

	default void fly(String nameOfBird) {
		System.out.println(nameOfBird + " fly.");
	}
}
