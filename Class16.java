package java09;
class CCircle        // 定義類別CCircle
{
   private static double pi=3.14;
   private double radius;

   public CCircle(double r)       // CCircle建構元
   {
      radius=r;
   }
   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
public class Class16
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[6];
      for(int i=0;i<6;i++) {
    	  cir[i]=new CCircle(i);
    	  cir[i].show();
      }

   }
}