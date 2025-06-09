package sample;

public interface a {
	
	void one();
	default void two() {
		System.out.println("Its default method");
	}

}
