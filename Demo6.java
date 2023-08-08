public class Demo6 {
    public static void main(String[] args) {
        
        int x=5;
        int a=5;
        int count=0;
        int z=0;

        while(x>0){

            count++;

            if(count==1) z=4;
            else if(count==2) z=2;
            else if(count==3) z=0;
            else if(count==4) z=2;
            else if(count==5) z=4;

            if(x>3 || x==3){
            int y=a-z;
            
                while(y-->0){
                    if(y==0){System.out.printf("%1$s%1$s%2$s%1$s%1$s" ,"  ","+ ");break;}
                    else if(y==2){System.out.printf("%1$s%2$s%2$s%2$s%1$s" ,"  ","+ ");break;}
                    else if(y==4){System.out.printf("%2$s%2$s%2$s%2$s%2$s" ,"  ","+ ");break;}

                }
            }else if(x==3 || x<3){
                int y=a-z;
            
                while(y-->0){
                    if(y==0){System.out.printf("%1$s%1$s%2$s%1$s%1$s" ,"  ","+ ");break;}
                    else if(y==2){System.out.printf("%1$s%2$s%2$s%2$s%1$s" ,"  ","+ ");break;}
                    else if(y==4){System.out.printf("%2$s%2$s%2$s%2$s%2$s" ,"  ","+ ");break;}

                }
            }
            
            System.out.println();
            x--;
            
        }

    }
    
}
