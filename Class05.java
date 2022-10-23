package java09;
class CCount{
	static int cnt=0; //類別變數
	public CCount() {
		cnt++;
	}
	public void setZero() {
		cnt=0;
	}
	public void setValue(int n) {
		cnt=n;
	}
	public void count() {
		System.out.println(cnt);
	}
	public static void Count() {
		System.out.println(cnt);
	}                                   //count()兩者都可以
}

public class Class05 {

	public static void main(String[] args) {
		CCount a=new CCount();
		CCount b=new CCount();
		a.count();
		a.setZero();
		a.count();
		b.setValue(10);
		a.count();
		CCount.Count();
	}

}
