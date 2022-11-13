package Zadaca01;

public class MainClass {
public static void main(String[] args) {
	Avtomobil av = new Avtomobil("Audi" , "A6" , "bela" , 20000 ,2015, "PP-1819-AA");
	av.prvMetod();
	System.out.println(av.vtorMetod());
}
}
