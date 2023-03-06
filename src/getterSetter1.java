class myEmp{
    private int a;
    private String s;

    public void setA(int a1) {
        a = a1;
    }

    public int getA() {
        return a;
    }
    public void setS(String s1){
        s=s1;
    }

    public String getS() {
        return s;
    }
}
public class getterSetter1 {
    public static void main(String[] args) {
        myEmp e1=new myEmp();
        e1.setA(12);
        System.out.println(e1.getA());
        e1.setS("My name is Mayukhjit");
        System.out.println(e1.getS());

    }
}
