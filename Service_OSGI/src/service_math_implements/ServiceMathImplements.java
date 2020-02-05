package service_math_implements;

import service_math.ServiceMath;

public class ServiceMathImplements implements ServiceMath{

	@Override
	public int somme(int a, int b) {
		return a + b;
	}

	@Override
	public int moin(int a, int b) {
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		return a * b;
	}
	

}
