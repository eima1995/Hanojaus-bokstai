import java.util.Scanner;

public class HanoiTower {
	private Pole A,B,C;
	public static int turn = 0;
	
	HanoiTower(int n){
		A = new Pole('A',n);
		B = new Pole('B');
		C = new Pole('C');
	}
	
	public String printAllPoles(){
		return A.toString() + "," + B.toString() + "," + C.toString() + ".";
	}	
	
	//int tarpai = 4;
	public void hb(Pole a, Pole b, Pole c, int n){ // a - nuo, b - tarpinis, c - tikslas, n - disku sk.
        if (n > 0) {

            hb(a, c, b, n-1);       // perkelti n-1 ant tarpinio
             
            int dics = a.getDisc().pop();   
            c.getDisc().push(dics);
            
            System.out.println(String.format("%4s", ++turn) + ". Diska " + dics + " nuo " + a.getName() + " perkelti ant " + c.getName() +  ". " + printAllPoles()); 
            
            hb(b, a, c, n-1);    // perkelti n - 1 ant tikslo
        }         

    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Iveskite n");
	
		int n = s.nextInt();
        HanoiTower tower = new HanoiTower(n);
        
        if((n > 10) | (n < 1)){
        	System.out.println("n tik nuo 1 iki 10.");
        	System.exit(0);
        }
        
        
        System.out.println("Ivestas n = " + n + ".");
        System.out.println("Pradine busena " + tower.printAllPoles());
        
        tower.hb(tower.A, tower.B, tower.C, n);
       
		s.close();
	}
	
}
