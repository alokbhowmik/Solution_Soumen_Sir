import java.util.*;

class A{
    int arrA[]=new int[10];
    void insert(int index ,int data){
        arrA[index]=data;
    }
}

class B extends A{
    int arrB[]=new int[10];
    void insert(int index ,int data){
        arrB[index]=data;
    }
}
class C extends A{
    int arrC[]=new int[10];
    void insert(int index ,int data){
        arrC[index]=data;
    }
}
class SolutionSoumen{
    static A a;
    static B b;
    static C c;
    static void display(int index){
        int i=0;
        // A a = new A();
        // B b = new B();
        // C c = new C();
        while (i<index) {
            System.out.println("A's data :");
            System.out.println(a.arrA[i]);
            System.out.println("B's data :");
            System.out.println(b.arrB[i]);
            System.out.println("C's data :");
            System.out.println(c.arrC[i]);
            i++;
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = new A();
        b = new B();
        c= new C();
        int data,index=0;
        char ch;
        do {
            
            System.out.println("Enter the data in A");
            data = sc.nextInt();
            a.insert(index, data);
            
            System.out.println("Enter the data in B");
            data = sc.nextInt();
            b.insert(index, data);
            
            System.out.println("Enter the data in C");
            data = sc.nextInt();
            c.insert(index, data);
            System.out.println("Do you want to continue [y/n]");

            ch =sc.next().charAt(0);
            index++;
        } while (ch!='n');


        display(index);
    }
}