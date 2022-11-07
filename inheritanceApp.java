class Calc{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
}


class Calc3 extends Calc {
	
}


class Calc2 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}




public class inheritanceApp {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.sum(2, 1));
		
		
		
		Calc3 c3 = new Calc3();
		System.out.println(c3.sum(2, 1));

	}

}