//package gestionpromoSE;
//
//import java.sql.Connection;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class MainGestionPromo {
//
//	public static void main(String[] args) {
//		
//		
		
//		List<Apprenant> listAprenants = new ArrayList<Apprenant>();		
//		Stagiaire stg1 = new Stagiaire(listAprenants.size() + 1, "chelhi", "farida", LocalDateTime.now(),65634296,
//				"fchelhi@cci.fr");
//		listAprenants.add(stg1);
//		Stagiaire stg2 = new Stagiaire(listAprenants.size() + 1, "chelhi", "nadia", LocalDateTime.now(),60034296,
//				"nchelhi@cci.fr");
//		listAprenants.add(stg2);
//		Stagiaire stg3 = new Stagiaire(listAprenants.size() + 1, "toto", "tata", LocalDateTime.now(),60099996,
//				"ttoto@cci.fr");
//		listAprenants.add(stg3);
//
//		Alternant app=new Alternant(listAprenants.size() + 1, "lolo", "jean", LocalDateTime.now(),688888886,
//				"jlolo@cci.fr");
//		listAprenants.add(app);
//		Alternant app1=new Alternant(listAprenants.size() + 1, "madou", "jean", LocalDateTime.now(),644444446,
//				"jmadou@cci.fr");
//		listAprenants.add(app1);
//		
//	for(Apprenant ap:listAprenants) {
//		System.out.println(ap.getClass().getName()+"  "+ap.getId_apprenant()+"  " +ap.getNom()+"  "+ap.getPrenom());
//	}
//	
//	
//	stg1.estAbsent(6);
//	app1.estEnRetard(15, false);
//	app1.estAbsent(3);
//	app.estEnRetard(20, true);
//	app1.estEnRetard(20, false);
//	app1.estAbsent(3);
//	stg1.estAbsent();
//	app1.estAbsent(3);
//	app1.totalRetard();
//	app1.totalAbsence();
//	stg1.totalRetard();
//	stg1.totalAbsence();
//	
//	
//	System.out.println(app1.listeretard().toString());
//	
////	
////	
////
//	}
//
//}