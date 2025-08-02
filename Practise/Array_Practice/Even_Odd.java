package Array_Practice;

public class Even_Odd {
public static void main(String[] args) {
    int a[]={10,20,30,41};
    int c=0;
    int m=0;
    for(int i=0;i<a.length;i++){
        if(a[i]%2==0){   
            c++;
        }
        else{
            m++;
        }
    }    
        System.out.println("Even :"+c);
        System.out.println("ODD :"+m);

    
}




    
}
