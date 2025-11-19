public class Aa {
    private int x;
    private int y;

    public Aa(){
      x = 1;
      y = 1;
    }

    public Aa(int x){
      this.x = x;
      y = 1;
    }


    public void disp(){
      System.out.println("x = " + x + ", y = " + y);
    }
  }

  class Bb extends Aa {
    private int x;
    private int y;

    public Bb(){
      x = 1;
      y = 1;
    }

    public Bb(int x){
      this.x = x;
      y = 1;
    }

    public Bb(int x, int y){
      this.x = x;
      this.y = y;
    }

    public Bb(int x1, int y1 , int x2){
      super(x2);
      x = x1;
      y = y1;
    }

    public void disp(){
      System.out.print("x = " + x + ", y = " + y + ", ");
      super.disp();
    }

  }