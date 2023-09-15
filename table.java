import java.util.*;
public class table {
    public static void main(String args[]){

       /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        int i=1;
        for(i=1;i<=10;i++){
            int table = x*i;
            System.out.println(x+ "*" +i+ "=" +table);}     */       
    
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            int num = sc.nextInt();
            System.out.println("Enter the range ");
            int rng = sc.nextInt();
            int i = 1;
            while(i<=rng){
                int table = num*i;
                
                System.out.println(num+ "*"+i+ "="+table);
                i++;
            }
            
}
}
