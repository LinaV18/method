package Methodoverriding;

public class Methodoverriding {
    static int plusMethod(int x,int y){
        return x+y;
    }
    static double plusmethod(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int z = plusMethod(20,30);
        double zz = plusmethod(20.30,20.30);
        System.out.println(z);
        System.out.println(zz);

    }
    }




