package Comparator;
import java.util.Comparator;
import Inheritence.FictionalChar;

public class FictionalCharComparator implements Comparator<FictionalChar>{

	@Override
	public int compare(FictionalChar o1, FictionalChar o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
