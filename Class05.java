package java09;
class CCount{
	static int cnt=0; //���O�ܼ�
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
	}                                   //count()��̳��i�H
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
