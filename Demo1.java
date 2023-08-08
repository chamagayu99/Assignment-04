public class Demo1{

    public static void main(String[] args) {
        
        int a=10;
        int x=5;
        int z=2;
        
        while(a>1){
            if(a>5){
                int y=x;
                while(y-->0){
                    System.out.print("+ ");
                }
                x--;
            }
            else if(a<5 || a==5){
                int y=z;
                while(y-->0){
                    System.out.print("+ ");
                }
                z++;
            }
            System.out.println();
            a--;
            
        }
    }
}