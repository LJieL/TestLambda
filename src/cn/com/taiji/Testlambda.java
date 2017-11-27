package cn.com.taiji;


import java.util.ArrayList;

public class Testlambda  {
	public static void main(String[] args) {
		double d1 = Integrate(x->x,1,2,1000);
		System.out.println(d1);
	}

	public static double Integrate(Integrable func,double x1,double x2,int numSlices) {
		if(numSlices<1)numSlices=1;
		double delta =(x2-x1)/numSlices;
		double start =x1 +delta/2;
		double sum =0 ;
		for(int i=0;i<numSlices;i++) {
			sum +=delta*func.eval(start+delta*i);
		}
		return sum;
	}

}//ArrayList list = {1,1,2,3,5,8,13,21};List<String> words = Files.lines(Paths.get(character));

