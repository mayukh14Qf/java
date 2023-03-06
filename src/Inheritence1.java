class grandFather{
    int a;int b;
    public grandFather(){
        System.out.println("I am base Object");
    }
    public grandFather(int a){
        System.out.println("I am also a base Object with "+a);
    }
}
class father extends grandFather{
    public father(){
        System.out.println("I am 1st Child Object ");
    }
    public father(int a,int b){
        super(a);
        System.out.println("I am 1st child object " + b);
    }
}
class me extends father {
    public me(){
               System.out.println("I am 2nd child object");
    }
    public me(int a,int b,int c){
        super(a,b);
        System.out.println("I am 2nd child object with " +c);
    }
}
public class Inheritence1 {
    public static void main(String[] args) {
        me m=new me(1,2,3);


    }
}
