import java.util.Scanner;


///Method overloading


public class Overloading {


    public static void main(String[] args) {
        over("Ryan","Mwangii");
    }
    public static String over(String x,String y){


        Scanner pick;
        pick=new Scanner(System.in);
        System.out.println("Enter value of x");
        x=pick.next();
        System.out.println("Enter value of y");
        y=pick.next();
        String ans=x+" "+y;
        System.out.println(ans);
        return ans;
    }


    public void over(){
        System.out.println("Method overloading");
    }
    public static Integer over(Integer x,Integer y){


                Scanner pick;
                pick=new Scanner(System.in);
                System.out.println("Enter value of x");
                x=pick.nextInt();
                System.out.println("Enter value of y");
                y=pick.nextInt();
                Integer ans=x+y;
                System.out.println(ans);
                return ans;


    }

    public void over(int x){


                Scanner pick;
                pick=new Scanner(System.in);
                x=pick.nextInt();
                System.out.println("You entered "+x);
    }
}

