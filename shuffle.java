public class shuffle {
    public static void main(String args[]){
        int x = 3;
        while(x>0){                 // here x is greater then 0 for enter in the loop
            if(x>2){   // first condition is satisfied  (x=3)
                System.out.print("a");  // so a got printed.
            }
            x = x-1;     // till now thw x is 3, here x become 2 
            System.out.print("-");   // after this line is excute simply (no connection above statement.)
            if(x==2){     // In line 8 (x=2) and in this condition x==2 
                System.out.print("b c");   // ("b c") got printed 
            }
            if(x==1){    // Condition is not satisfied so it not get excuted. loop continues
                System.out.print("d"); // after further excution above condition is satisfied and the statement ('d') got printed.
                x = x-1;   // here x = 0 so loop got terminated.
            }
        }
    }
    
}



/*In this program we intialize x =3 then a while loop with the condition x>0
 * in that we use conditional statement x>2 then print a and then we substract x with 1 and 
 * put it in variable(x) so now the value of x = 2 then again new statement is print (-)
 * then 
 */