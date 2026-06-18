class Demo{
	public static void main(String[] args){
		System.out.println("Hello! This is Main Block.");
		Sum s = new Sum();
		System.out.println(s.fun1(5));
		System.out.println(s.fun1(5));
	}
	static {
		System.out.println("Hello! This is Static Block");
	}
	
}
class Sum{
	int fun1(int n){
		return n*(n+1)/2;
	}
}