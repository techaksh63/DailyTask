public class Operators {
    public static void main(String[] args){
     Arithmetic Arr = new Arithmetic();
     Assignment Assign = new Assignment();
     Comparison Compare = new Comparison();
     Logical Logic = new Logical();
    }
}

class Arithmetic{
    int a = 10;
    int b = 7;
    void Arr(){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(++b);
        System.out.println(--b);
    }
}

class Assignment{
    int x = 3;
    void Assign(){
        System.out.println(x=5);
        System.out.println(x+=3);
        System.out.println(x-=3);
        System.out.println(x*=3);
        System.out.println(x/=3);
        System.out.println(x%=3);
        System.out.println(x&=3);
        System.out.println(x|=3);
        System.out.println(x^=3);
        System.out.println(x>>=3);
        System.out.println(x<<=3);
    }
}

class Comparison{
    int C = 10;
    int D = 12;
    void compare(){
        System.out.println(C==D);
        System.out.println(C!=D);
        System.out.println(C>D);
        System.out.println(C<D);
        System.out.println(C<=D);
        System.out.println(C>=D);
    }
}


class Logical{
    int E = 18;
    void Logic(){
        System.out.println(E<5 && E<10);
        System.out.println(E<5 || E<10);
        System.out.println(!(E<5 || E<10));
    }
}