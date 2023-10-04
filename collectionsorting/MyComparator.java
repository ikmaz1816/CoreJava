package collectionsorting;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student x1, Student x2) {
		//for descending and for ascending x1-x2
		return x2.getId()-x1.getId();
	}

}
