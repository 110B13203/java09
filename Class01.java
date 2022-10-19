package java09;

class CRectangle{
	int width;
	int height;
	public CRectangle() {
		width=10;
		height=8;
		this.width=10;
		this.height=8;
	}
	public CRectangle(int w,int h) {
		width=w;
		height=h;
	}
	public void show() {
		System.out.println(width+","+height);
	}
}
public class Class01 {

	public static void main(String[] args) {
		CRectangle a=new CRectangle();
		a.show();
		a=new CRectangle(15,16);
		a.show();
	}

}
