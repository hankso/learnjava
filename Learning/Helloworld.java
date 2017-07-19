public class Helloworld{
	public static class Test{
		private static int num = 0;
		int numtest = 98;
		public Test method(){
			num += 1;
			numtest = numtest + 1;
			return this;
		}
	}

	static class B{
		private static char n = 'n';
	}


	public static void main(String []args){

		/*
		Test tt = new Test();
		Test tt2 = new Test();
		tt.method();
		System.out.println(Test.num);
		System.out.println(tt.num);
		System.out.println(tt.numtest);
		System.out.println(tt2.num);
		System.out.println(tt2.numtest);
		tt2.num = 10;
		System.out.println(tt2.num);
		System.out.println("ssssss");
		System.out.println(tt.num == tt2.num);
		System.out.println(tt.method().method().method().num);

		System.out.println(A.str);
		A a = new A();
		System.out.println(B.n);
		//System.out.println(Test.num);
		*/

		StringBuffer sb = new StringBuffer("i am hank");
		sb.append("aaaqa");
		int i = 1;
		if (i == 0){
			System.out.println("i equal to 0");
		}
		else{
			System.out.println("i doesn't equal to 0");
		}
		sb.reverse();
		System.out.println(sb.capacity());
	}
}

class A{
	static String str = "this var is default, accessed freely in this file";
	private String str1 = "this var is private, accessed only by this class";
	public A(){
		System.out.println(str1);
	}
}
