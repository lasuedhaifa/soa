package service;

public class TestBanque {

	public static void main(String[] args) {
		
		double montant = 2001;
		BanqueService bs = new BanqueService(montant);
		System.out.println(bs.conversion(montant));
	}

}