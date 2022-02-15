package BadDesign;

public class A
{public class B{public String D;public double E;public double F;public String j;public B(String g,double h,double i){this.D=g;this.E=h;this.F=i;}
public B(String g,double h,double i,String k){this.D=g;this.E=h;this.F=i;this.j=k;}
public void set(String l){this.j=l;}
public void set2(double w){this.F=w;}}
B[]C;int n=0;public A()
{C=new B[1];}
public void m(B o){if(n==C.length){B[]new_=new B[C.length*2];for(int i=0;i<C.length;i++){new_[i]=C[i];}
this.C=new_;}
C[n]=o;n++;}
public double[]z(){double[]x=new double[n];for(int i=0;i<n;i++){if(this.C[i].j=="h"){if(C[i].F>40){x[i]=40*C[i].E + ((C[i].F-40)*(1.5*C[i].E));}else{x[i]=C[i].F*C[i].E;}}else if(this.C[i].j=="s"){x[i]=40*C[i].E;}else{x[i]=C[i].F*C[i].E;}}
return x;}
public static void main(String[]args)
{}} 