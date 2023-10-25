
public class Powder implements Weightable {
	private String color; 
	private double weight;
	
	public Powder() {
		super();
	}
	
	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void printWeightTool() {
		System.out.println("我是粉，我使用天坪來秤重，秤出來的重量是" + this.weight + "克");
	}
	
	
}
