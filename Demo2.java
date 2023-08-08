public class Demo2 {
    public static void main(String[] args) {
        
        int x=4;
        int a=7;
        int count=0;
        int z=0;

        while(x>0){

            count++;

            if(count==1) z=0;
            else if(count==2) z=1;
            else if(count==3) z=3;
            else if(count==4) z=5;

            int y=a-z;
            
                while(y-->0){
                   System.out.printf("+ ");
                }
            
            System.out.println();
            x--;
            
        }
        
    }
    
}
