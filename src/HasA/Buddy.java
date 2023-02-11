package HasA;

public class Buddy {
	public String name;
	public int loyalty;
	
	public Buddy(String name, int loyalty) {
		super();
		this.name = name;
		this.loyalty = loyalty;
	}


	
	
	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "\nBuddy \nName= " + name + "\nLoyalty= " + loyalty + "\n";
	}

	public void calcLoyalty() {
		switch(this.name) {
		case "Morty" : loyalty = 50; break;
		case "Hiccup" : loyalty = 40; break;
		case "James" : loyalty = 30; break;
		case "Patrick" : loyalty = 20; break;
		}
	}
	
}
