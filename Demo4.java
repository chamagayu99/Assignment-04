public class Demo4 {
    public static void main(String[] args) {
        

        int x=6;
        int a=6;
        int count=0;
        int z=0;

        while(x>0){

            count++;

            if(count==1) z=0;
            else if(count==2) z=2;
            else if(count==3) z=4;
            else if(count==4) z=4;
            else if(count==5) z=2;
            else if(count==6) z=0;

            if(x>3 || x==3){
            int y=a-z;
            
                while(y-->0){
                    if(y==1){System.out.printf("%2$s%1$s%1$s%3$s%3$s%2$s" ,"/ ","+ ","\\ ");break;}
                    else if(y==3){System.out.printf("%2$s%2$s%1$s%3$s%2$s%2$s" ,"/ ","+ ","\\ ");break;}
                    else if(y==5){System.out.printf("%s%1$s%1$s%1$s%1$s%1$s" ,"+ ");break;}
                }
            }else if(x==3 || x<3){
                int y=a-z;
            
                while(y-->0){
                    if(y==1){System.out.printf("%2$s%3$s%3$s%1$s%1$s%2$s" ,"/ ","+ ","\\ ");break;}
                    else if(y==3){System.out.printf("%2$s%2$s%3$s%1$s%2$s%2$s" ,"/ ","+ ","\\ ");break;}
                    else if(y==5){System.out.printf("%2$s%2$s%2$s%2$s%2$s%2$s" ,"/ ","+ ");break;}
                }
            }
            
            System.out.println();
            x--;
            
        }
    }
    
}
