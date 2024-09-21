package m;
public class Circle {
	private double radius;
	public Circle (double radius) {
		this.radius = radius;
	}
	
	public double getRadius(double radius){
		return radius;
	}
	public void setRadius(){
		this.radius = radius;
	}
	
	public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}