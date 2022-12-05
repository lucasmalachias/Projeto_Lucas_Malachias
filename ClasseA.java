public class ClasseA{
  private int A1;
  private float A2;
  
  public int getA1(){
    return A1;
   }
   
   public float getA2(){
    return A2;
   }
   
   public void setA1(int A){
    A1 = A;
   }
   
   public void setA2(float A){
    A2 = A;
   }
   
   public void MA1(){
    System.out.println("MA1");
   }
   
   public void MA2(){
    System.out.println("MA2");
   }

   public void MA3(){
    System.out.println("Alteracao a classe A partir do clone");
   }
}
