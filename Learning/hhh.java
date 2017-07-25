package Learning;
class Counter{
	public static class test{
		int num = 0;
		int numtest = 9999;
		public void method(){
			num += 1;
			numtest = numtest + 1;
		}
	}
	public void main(){
		test tt = new test();
		test tt2 = new test();
		tt.method();
//		System.out.println(test.num);
		System.out.println(tt.num);
		System.out.println(tt.numtest);
		System.out.println(tt2.num);
		System.out.println(tt2.numtest);
		tt2.num = 10;
		System.out.println(tt2.num);
		System.out.println("ssssss");
		System.out.println(tt.num == tt2.num);
	}
}
public class hhh{
	public static void main(String []args){
		Counter ct = new Counter();
		ct.main();
	}
}
