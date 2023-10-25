
public class Dog implements Weightable {
	private String name;
	private double weight;
	
	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void printWeightTool() {
		System.out.println("我是狗，我使用體重計來秤重，秤出來的重量是" + this.weight + "公斤");
		
	}
	
	
	
	
}
