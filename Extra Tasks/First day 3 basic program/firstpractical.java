public class firstpractical {
    public static void main(String[] arg){
    
        multi m = new multi();
        m.multiple();

    }
}


class multi{

      int a = 7;
      int n = 500;

      void multiple(){
        for(int i=a; i <= n; i*=a){
            System.out.println(i);
        }       
      }
}