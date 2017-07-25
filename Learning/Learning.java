package Learning;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.*;
import java.util.function.IntUnaryOperator;

@SuppressWarnings("unused")
public class Learning {
	public static void main(String[] args){
		try{
			
			
			/*
			//20170718
			int t1 = 97;
			int[] t2 = {98 ,99};
			Integer t3 = new Integer(0);
			System.out.printf("%d, %f, %c \n", t1, (float)t2[0], t2[1]);
			System.out.println("t3 = 0, t3 + 'a' = 65  " + t3 + "A");
			*/
			
			
			
			/*
			//20170719
			long t = System.currentTimeMillis();
			Date date = new Date();
			Thread.sleep(1000);
			System.out.printf("Recent time: %s\n" +
					"Miliseconds since 1970/1/1: %d\n" +
					"Hashcode: %s\n",
					date.toString(),
					date.getTime(),
					date.hashCode());
			System.out.println("Time used: " + (System.currentTimeMillis() - t));
			*/
			
			
			
			/*
			//20170723
			Calendar c = Calendar.getInstance();
			c.set(1998, 4 - 1, 25);
			System.out.println(c.get(Calendar.MONTH) + 1);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i<10; i++){
				sb.append((char)(i + 'a'));
			}
			System.out.println(sb);
			System.out.println((int)(Math.random()*100 + 1));
			
			
			File folder1 = new File("javatestfolder");
			folder1.mkdir();
			folder1.delete();
			
			
			File folder2 = new File(".");
			for (String filename : folder2.list()){
				System.out.println(filename);
			}
			for (File files : folder2.listFiles()){
				if (files.isFile()){
					System.out.println("File : " + files);
				}
				else {
					System.out.println("Dire : " + files);
				}
			}
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println(1);
			if (scanner.hasNext()){
				System.out.println(scanner.next());
			}
			System.out.println(scanner.next());
			scanner.close();
			
			
			new MyThread("thread-1").start();
			new MyThread("thread-2").start();
			
			
			Properties p = System.getProperties();
			System.out.println(p.toString());
			
			
			for (int i=1; i<10; i++)
			{
				for (int j=1; j<=i; j++)
				{
					System.out.printf("%d × %d = %2d  ", j, i, i*j);
				}
				System.out.println("");
			}
			
			
			//FileWriter(String Filename, boolean append)
			BufferedWriter F = new BufferedWriter(new FileWriter("test.txt", false));
			F.write("line one: lalala\n");
			F.write("line two: nothing\n");
			F.close();
			BufferedReader I = new BufferedReader(new FileReader("test.txt"));
			String str;
			while ((str = I.readLine()) != null)
			{System.out.println(str);}
			I.close();
			
			
			Socket skt;
			for (int i=0; i<1024; i++){
				try {
					skt = new Socket("localhost", i);
					System.out.println("Port " + i + " availible");
				} catch (Exception e) {
//					System.out.println("Port" + i + " is used");
				}
			}
			*/
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("");
		}
	}
}

class test{
	private int name;
	public test(){
		name = 9;
	}
	public int getName() {
		return name;
	}
}

class MyThread extends Thread{
	private String threadname;
	public MyThread(String name) {
		threadname = name;
	}
	public void run(){
		try {
			for (int i=10; i>0; i--){
				System.out.println(threadname + "said: " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
//			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
//	public void start(){
//		new Thread(this, threadname).start();
//	}
}