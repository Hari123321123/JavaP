package Javaoops;

import java.io.IOException;

class Main {
public static void main(String[] args) {

	Area rectangle = new Area(3, 16);
	rectangle.getArea();
}
}
class Area {

int length;
int breadth;

//constructor to initialize values

Area(int length, int breadth) {
	this.length = length;
	this.breadth = breadth;
	
	
}

public void getArea() {
	int area = length * breadth;
	System.out.println("Area: " + area);
}
}


