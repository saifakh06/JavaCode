 import java .util.*;
 public class studentMark {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int button = sc.nextInt();
         switch(button){
             case 0: System.out.println("Stop");
             break;
             case 1:
             do
             {
                 int num=sc.nextInt();
                 if(num>=90)
                 {
                     System.out.println("This is good");
                 }
                 else if(num<=89&&num>=60)
                 {
                     System.out.println("This is also good");

                 }
                 else{
                     System.out.println("This is gud as well");
                 }
             }while(true); 
            

         }
     }
    
 }
