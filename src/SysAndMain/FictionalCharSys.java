package SysAndMain;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import Comparator.FictionalCharComparator;
import HasA.Buddy;
import Inheritence.*;

public class FictionalCharSys {
	private static HashSet<FictionalChar> fc = new HashSet<>();
	private static ArrayList<FictionalChar> fixedList = new ArrayList<>();
	
	public static void addChar(FictionalChar a, String typ) { // We created add method for Characters in GUI with constructors.
		if(typ.equalsIgnoreCase("Fixed"))
			fixedList.add(a);
		else // Custom Char
			fc.add(a);
	}
	
	public static String displayByName() {
		String res = "";
		FictionalCharComparator fcc = new FictionalCharComparator();
		TreeSet<FictionalChar> fcSortedByName = new TreeSet(fcc);
		fcSortedByName.addAll(fc);
		fcSortedByName.addAll(fixedList);
		for(FictionalChar f : fcSortedByName)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static boolean readFromFile(){
		try {
			Scanner sc = new Scanner(new File("characters.txt"));
			while(sc.hasNext()) {
				String type = sc.next();
				FictionalChar ch = null;
				Buddy b = new Buddy("", 0);
				switch(type) {
				case "Wizard": ch = new Wizard(sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.next()), 
												Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
												sc.next(), sc.next()); break;
				case "Animation": ch = new Animation(sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.next()), 
						Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
						sc.next(), sc.next(), b);
						b.setName(sc.next());
						b.calcLoyalty(); break;
				case "SuperHero": ch = new SuperHero(sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.next()), 
						Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
						sc.next());break;
				case "Villain": ch = new Villain(sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.next()), 
						Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
						sc.next(), sc.next()); break;
				case "Eternal": ch = new Eternal(sc.next(), Integer.parseInt(sc.next()), Double.parseDouble(sc.next()), 
						Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
						sc.next()); break;
				}
				ch.calcPower();
				FictionalCharSys.addChar(ch, "Fixed");
			}
			
		} catch (FileNotFoundException e) {
			return false;
		}
		
		return true;
		
	}
	
	public static String displayByPower() {
		String res = "";
		
		TreeSet<FictionalChar> fcSortedByPower = new TreeSet<>();
		fcSortedByPower.addAll(fc);
		fcSortedByPower.addAll(fixedList);
		for(FictionalChar f : fcSortedByPower)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static String displayFixedByPower() {
		String res = "";
		
		TreeSet<FictionalChar> fcSortedByPower = new TreeSet<>();
		fcSortedByPower.addAll(fixedList);
		for(FictionalChar f : fcSortedByPower)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static String displayFixedByName() {
		String res = "";
		FictionalCharComparator fcc = new FictionalCharComparator();
		TreeSet<FictionalChar> fcSortedByPower = new TreeSet(fcc);
		fcSortedByPower.addAll(fixedList);
		for(FictionalChar f : fcSortedByPower)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static String displayCustomByPower() {
		String res = "";
		
		TreeSet<FictionalChar> fcSortedByPower = new TreeSet<>();
		fcSortedByPower.addAll(fc);
		for(FictionalChar f : fcSortedByPower)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static String displayCustomByName() {
		String res = "";
		FictionalCharComparator fcc = new FictionalCharComparator();
		TreeSet<FictionalChar> fcSortedByPower = new TreeSet(fcc);
		fcSortedByPower.addAll(fc);
		for(FictionalChar f : fcSortedByPower)
			res += f.toString() + "\n\n";
		return res;
	}
	
	public static FictionalChar search(String name) {
		HashSet<FictionalChar> temp = new HashSet<>();
		temp.addAll(fc);
		temp.addAll(fixedList);
		for(FictionalChar f : temp)
			if(f.getName().equalsIgnoreCase(name))
				return f;
		
		return null;
	}
	
	public static boolean delete(String name) {
		HashSet<FictionalChar> temp = new HashSet<>();
		temp.addAll(fc);
		temp.addAll(fixedList);
		for(FictionalChar f : temp)
			if(f.getName().equalsIgnoreCase(name)) {
				fc.remove(f);
				fixedList.remove(f);
				return true;
			}
		
		return false;
	}
	
	public static HashSet<FictionalChar> getFc(){
		return fc;
	}

	public static ArrayList<FictionalChar> getFixedList() {
		return fixedList;
	}
	
	
	
	
	
}
