import java.util.Stack;

public class Pole {
	private char name;
	private Stack<Integer> disc = new Stack<>();
	
	Pole(char name, int n){
		this.name = name;
		int temp = n;
		for(int i = 0; i < n; i++) {
			disc.push(temp);
			temp--;
		}
	}
	
	Pole(char name){
		this.name = name;
	}
	
	public String toString() {
		String temp = this.name + "=(";
		for(int i = 0; i < disc.size(); i++) {
			if(i != disc.size() - 1) {
				temp += disc.get(i)+",";
			}else {
				temp += disc.get(i);
			}
		}
		return temp +=")";
	}
	
	public Stack<Integer> getDisc(){
		return disc;
	}
	
	public char getName() {
		return name;
	}
}
