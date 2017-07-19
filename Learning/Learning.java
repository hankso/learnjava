package Learning;
import java.util.Date;

public class Learning {
	public static void main(String[] args){
		
		
		/*
		//20170718
		int t1 = 97;
		int[] t2 = {98 ,99};
		Integer t3 = new Integer(0);
		System.out.printf("%d, %f, %c \n", t1, (float)t2[0], t2[1]);
		System.out.println("t3 = 0, t3 + 'a' = 65  " + t3 + "A");
		*/
		
		//20170719
		Date date = new Date();
		System.out.println("recent time: " + date.toString());
		System.out.println("miliseconds since 1970/1/1: " + date.getTime());
		System.out.println("hashcode: " + date.hashCode());
	}
}
