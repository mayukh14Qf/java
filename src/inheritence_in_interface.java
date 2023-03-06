interface sample1{
    void s1();
    void s2();
}
interface sample2 extends sample1{
    void s3();
    void s4();
}
class sample3 implements sample2{
    @Override
    public void s1() {
        System.out.println("s1");
    }

    @Override
    public void s2() {
        System.out.println("s2");
    }

    @Override
    public void s3() {
        System.out.println("s3");
    }

    @Override
    public void s4() {
        System.out.println("s4");
    }
}
public class inheritence_in_interface {
    public static void main(String[] args) {

    }
}
