package takeScreenshot;

import java.time.LocalDateTime;

public class S4_UsageOfTakesSceenshotAsMethod4 {
//Learn LocalDateTimeClass
	public static void main(String[] args) {
		//LocalDateTime is the built in class of Java
		//now() of LocalDataTime returns it's own type of reference
		LocalDateTime i = LocalDateTime.now();
		
		//it giver the current data and time stamp separated by letter T
		System.out.println(i);
		
		//As we cannot use the : in file name replace the : by -
		System.out.println(i.toString().replace(':', '-'));

	}

}
