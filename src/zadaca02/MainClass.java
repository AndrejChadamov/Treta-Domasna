package zadaca02;

public class MainClass {
public static void main(String[] args) {
	Fakultet f1 = new Fakultet();
	f1.nazivNaFakultet="FIKT";
	f1.brojNaSmerovi=5;
	f1.brojNaStudenti=1000;
	f1.dekan="Pece Mitrevski";
	f1.sediste="Bitola";
	
	f1.prvMetod();
	System.out.println("Namalen broj na studenti: "+f1.vtorMetod(50));
	f1.tretMetod();
	
	Fakultet f2 = new Fakultet();
	f2.nazivNaFakultet="Ekonomski";
	f2.brojNaSmerovi=4;
	f2.brojNaStudenti=500;
	f2.dekan="Marko Ilioski";
	f2.sediste="Prilep";
	
	f2.prvMetod();
	System.out.println("Namalen broj na studenti: "+f2.vtorMetod(30));
	f2.tretMetod();
	
	}
}

