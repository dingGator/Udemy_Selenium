package automobile;

public class Cars {
	// No Modifier -accessible in the same package
int speed;
// privateSpeed Accessible only in class
private int privateSpeed;
// publicSpeed Accessible in Java World with importing the package and class
public int publicSpeed;

//protectedSpeed is accessible in same package and in sub class
protected int protectedSpeed;

int speedLimit =100;

public Cars() {
	this(0);
}
public void setPrivateSpeed(int pSpeed) {
	privateSpeed = pSpeed;
}
public Cars(int startSpeed) {
	speed =startSpeed;
}
public void increaseSpeed() {
	if(speed<100) {
	speed++;
	}
	System.out.println("Increasing Speed of Cars");
}
protected void decreaseSpeed() {
	speed--;
	System.out.println("Decreasing Speed of Cars");
}

}
