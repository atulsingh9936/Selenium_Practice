package Core_java_2;

public class This_keyword {
  int a =2;

  public void getdata(){
      int a =3;

      int b = a+this.a;
      System.out.println(a);
      System.out.println(this.a);
      System.out.println(b);
      // this refer to current object - object scope lies in class level
  }


    public static void main(String[] args) {
      This_keyword  tk = new This_keyword();
      tk.getdata();

    }
}
