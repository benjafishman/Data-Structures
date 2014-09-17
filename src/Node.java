
public class Node {
	private int id;
	private int frequency;
	private String name;
	private int qIVal;
	
	public Node(int i, int f, String n){
		this.id = i;
		this.frequency = f;
		this.name = n;
		double div = 1.0/this.id; 
		//System.out.println(div);
		qIVal = (int)(this.frequency/div);
		//System.out.println(qIVal);
		
	}
	public int getQIVal(){
		return this.qIVal;
	}
	public int getID(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getFrequency(){
		return this.frequency;
	}

}
