package sber_practice;


public abstract class Figure {
    private double a;
    private double b;
    private double c;
    private double h;
    private int x;
    private int y;

    public Figure(double a, double b, double c, double h, int x, int y) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.x = x;
        this.y = y;
    }

    public void setValueA(double a){
        this.a = a;
    }
    public double getValueA(){
        return a;
    }


    public void setValueB(double b){
        this.b = b;
    }
    public double getValueB(double b){
        return b;
    }


    public void setValueC(double c){
        this.c = c;
    }
    public double getValueC(double c){
        return c;
    }


    public void setValueH(double h){
        this.h = h;
    }
    public double getValueH(double h){
        return h;
    }


    public void setValueX(int x){
        this.x = x;
    }
    public int getValueX(int x){
        return x;
    }


    public void setValueY(int y){
        this.y = y;
    }
    public int getValueY(int y){
        return y;
    }




    public abstract void perimeter();

    public abstract void area();

}
