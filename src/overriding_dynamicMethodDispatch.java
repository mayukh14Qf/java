class phone{
    public void call(){
        System.out.println("calling from phone");
    }
    public void time(){
        System.out.println("time on phone");
    }
}
class smartPhone extends phone{
    public void camera(){
        System.out.println("smart phone has Camera");
    }
    public void call(){
        System.out.println("Smart phone is calling");
    }
}
public class overriding_dynamicMethodDispatch {
    public static void main(String[] args) {
        smartPhone vivo=new smartPhone();
        vivo.call(); // overloading

        phone p=new smartPhone(); // Dynamic method dispatch
        p.call();
        p.time(); // allowed
//        p.camera(); not allowed

    }
}
