
public abstract class Main implements Weightable{
	public static void main(String[] args) {
		Weightable[] box = new Weightable[3];
		box[0] = new Dog("旺旺",60f);
		box[1] = new Powder("粉",0.1f);
		box[2] = new Plane("飛機",1000f);
		
		for(int i = 0 ; i < box.length ; i++) {
			box[i].printWeightTool();
		}
		
	}
}
