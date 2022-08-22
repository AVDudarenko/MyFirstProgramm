public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void talk() {
		System.out.println(this.name + " talking");
	}

	public void move() {
		System.out.println("Person at " + this.age + " age, is moving");
	}
}
