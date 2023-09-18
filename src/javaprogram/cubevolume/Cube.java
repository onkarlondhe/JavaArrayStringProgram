package javaprogram.cubevolume;

public class Cube {

	int cubeLength;
	
	public Cube(int cubeLength) {
		this.cubeLength=cubeLength;
	}
	
	public void volume() {
		System.out.println(cubeLength*cubeLength*cubeLength);
	}	
}

