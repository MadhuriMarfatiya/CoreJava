package in.co.basics;

public class E4_14_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int b=7;
		add(b,a);
		}
	public static void add(int b, int a[]) {
		int p=0;
		int s=0;
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				s=i;
				p++;
			}
		}
			if(p>0) {
				System.out.println("value exsit = "+s);
			}else
			{System.out.println(-1);
			}
	}

}
