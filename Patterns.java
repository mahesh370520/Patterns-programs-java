import java.io.*;
import java.lang.Math;



public class Patterns {
    

    public static void main(String[] args) {
        
        System.out.println("Pattern: 1");
        pattern1();
        System.out.println("Pattern: 2");
        pattern2();
        System.out.println("Pattern: 3");
        pattern3();
        System.out.println("Pattern: 4");
        pattern4();
        System.out.println("Pattern: 5");
        pattern5();
        System.out.println("Pattern: 6");
        pattern6();
        System.out.println("Pattern: 7");
        pattern7();
        System.out.println("Pattern:8");
        pattern8();
        System.out.println("Pattern: 9");
        pattern9();
        System.out.println("Pattern: 10");
        pattern10();
        System.out.println("Pattern: 11");
        pattern11();
        System.out.println("Pattern: 12");
        pattern12();
        System.out.println("Pattern: 13");
        pattern13();
        System.out.println("Pattern: 14");
        pattern14();
        System.out.println("Pattern: 15");
        pattern15();
        System.out.println("Pattern: 16");
        pattern16();
        System.out.println("Pattern: 17");
        pattern17();
        System.out.println("Pattern: 18");
        pattern18();
        System.out.println("Pattern: 19");
        pattern19();
        System.out.println("Pattern: 20");
        pattern20();
        System.out.println("Pattern: 21");
        pattern21();
        System.out.println("Pattern: 22");
        pattern22();
        

        
    }
public static void pattern1(){
    int n=5;
    for (int i = 0; i <n; i++) {
        for (int j= 0; j < n; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
public static void pattern2(){
    int n=5;
    for (int i = 0; i <n; i++) {
        for (int j= 0; j <=i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void pattern3(){
    int n=5;
    for (int i = 1; i <=n; i++) {
        for (int j= 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void pattern4(){
    int n=5;
    for (int i = 1; i <=n; i++) {
        for (int j=1; j <=i; j++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public static void pattern5(){
    int n=5;
    for (int i = 0; i <n; i++) {
        for (int j= 0; j <n-i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

}
public static void pattern6(){
    int n=5;
    for (int i = 1; i <=n; i++) {
        for (int j= 1; j <=n-i+1; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }

}
public static void pattern7(){
    int n=5;
    int star=1;
    for (int i = 1; i <=n; i++) {
        //space
        for (int j= 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //star
        for (int j= 1; j<=star; j++) {
            System.out.print("*");
        }
        //space
        for (int j= 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        System.out.println();
        star+=2;
    }
}
public static void pattern8(){
    int n=5;
    
    for (int i = 0; i <n; i++) {
        //space
        for (int j= 0; j <i; j++) {
            System.out.print(" ");
        }
        //star
        for (int j= 0; j<2*n-(2*i+1); j++) {
            System.out.print("*");
        }
        //space
        for (int j= 0; j <i; j++) {
            System.out.print(" ");
        }
        System.out.println();
        
    }
}
public static void pattern9(){
    int n=5;
    int star=1;
    for (int i = 1; i <=n; i++) {
        //space
        for (int j= 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        //star
        for (int j= 1; j<=star; j++) {
            System.out.print("*");
        }
        //space
        for (int j= 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        System.out.println();
        star+=2;
    }
    for (int i = 0; i <n; i++) {
        //space
        for (int j= 0; j <i; j++) {
            System.out.print(" ");
        }
        //star
        for (int j= 0; j<2*n-(2*i+1); j++) {
            System.out.print("*");
        }
        //space
        for (int j= 0; j <i; j++) {
            System.out.print(" ");
        }
        System.out.println();
        
    }
}
public static void pattern10(){
    int n=5;
    for (int i = 1; i <=2*n-1; i++) {
        int stars=i;
        if (i>n) {
            stars=2*n-i;
        }
        for (int j = 1; j<=stars; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void pattern11(){
    int n=5;
    int start=1;
    for (int i = 0; i <n; i++) {
            if (i%2==0) {
                start=0;
            }else{
                start=1;
            }
            for(int j=0;j<i;j++){
            System.out.print(start);
            start=1-start;
            }
        System.out.println();
    
    }
}
public static void pattern12(){
    int n=5;
        int Space=2*(n-1);
        for (int i = 1; i <=n; i++) {

            for (int j= 1; j<=i; j++) {
                System.out.print(j);
            }
            
            for (int j = 1; j<=Space; j++) {
                System.out.print(" ");
            }

            for (int j=i; j>=1 ;j--) {
                System.out.print(j);
            }

            System.out.println();
            Space=Space-2;
        }
    }
public static void pattern13(){
    int n=5;
    int Start=1;

    for (int i = 1; i <= n; i++) {
        for (int j =1; j <=i; j++) {
            System.out.print(Start +" ");
            Start++;
        }
        System.out.println();
    }
}
public static void pattern14(){
    int n=5;
    for(int i =1; i<=n; i++){
        char alphabet='A';
        for (int j = 1; j <=i; j++) {
            System.out.print(alphabet);
            alphabet++;
        }
        System.out.println();
    }
}
public static void pattern15(){
    int n=5;
    for(int i =1; i<=n; i++){
        char alphabet='A';
        for (int j =n; j >=i; j--) {
            System.out.print(alphabet+ " ");
            alphabet++;
        }
        System.out.println();
    }
}
public static void pattern16(){
    int n=5;
    char alphabet='A';
    for(int i =1; i<=n; i++){
        for (int j =1; j <=i; j++) {
            System.out.print(alphabet+ " "); 
        }
        System.out.println();
        alphabet++;
    }
}
public static void pattern17(){
    int n=5;
    
        for (int i = 1; i <=n; i++) {
            //Space
            for (int j= 1; j<=n-i-1; j++) {
                System.out.print(" ");
            }
            //Pattern
            char ch='A';
            int breakpoint=(2*i-1)/2;
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print(ch);
                if (j<=breakpoint) 
                    ch++;
                else
                    ch--;

            }
            //Space
            for (int j=1; j<=n-i-1 ;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
public static void pattern18(){
    int n=5;
    for(int i =1; i<=n; i++){
        char c = (char)('E' - i + 1);
        for (char ch=c; ch<='E'; ch++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
public static void pattern19(){
    int n=5;
    int space=0;
        for (int i = 1; i <=n; i++) {
            //stars
            for (int j=n; j>=i; j--) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j<=space; j++) {
                System.out.print(" " );
            }
            //stars
            for (int j=n; j>=i ;j--) {
                System.out.print("*");
            }

            System.out.println();
            space=space+2;
        }

        space=2*n-2;
        for (int i = 1; i <=n; i++) {
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j<=space; j++) {
                System.out.print(" " );
            }
            //stars
            for (int j=1; j<=i ;j++) {
                System.out.print("*");
            }

            System.out.println();
            space=space-2;
        }
    }
public static void pattern20(){
    int n=5;
    int space=2*n-2;
    for (int i = 1; i <=2*n-1; i++) {
        int stars=i;
        if (i>n) 
            stars=2*n-i;
        //starts
        for (int j = 1; j<=stars; j++) {
            System.out.print("* ");
        }
        //space
        for (int j = 1; j<=space;j++) {
            System.out.print("  ");
        }

        //stars
        for (int j = 1; j<=stars; j++) {
            System.out.print("* ");
        }

        if (i<n) {
            space-=2;
        }else{
            space+=2;
        }

        System.out.println();
    }
}
public static void pattern21(){
    int n=5;
    for (int i = 0; i <n; i++) {
        for(int j=0;j<n;j++){
        if (i==0|| i==n-1||j==0||j==n-1) {
            System.err.print("*");
        }else{
            System.out.print(" ");
        }
        }
        System.out.println();
    }
}
public static void pattern22(){
    int n=4;
    for (int i= 0; i < 2*n-1; i++) {
        for (int j = 0; j<2*n-1; j++) {
            int top=i;
            int left=j;
            int right=(2*n-2)-j;
            int bottom=(2*n-2)-i;
            System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
        }
        System.out.println();
    }
}



}


