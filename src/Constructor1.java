class myEmp1{
    private int id;
    private String name;
    public myEmp1(){
        id=16;
        name="myName";
    }
    public myEmp1(int p,String q){
        id=p;
        name=q;
    }
    public myEmp1(int r){
        id=r;
        name="your name";
    }
    public void setTd(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }

    public void setName(String n) {
        this.name=n;
    }
    public String getName(){
        return name;
    }
}
public class Constructor1 {
    public static void main(String[] args) {
        myEmp1 e2=new myEmp1();
//        e2.setTd(12);
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println();

        myEmp1 e3=new myEmp1(14);
        System.out.println(e3.getId());
        System.out.println(e3.getName());
        System.out.println();

        myEmp1 e4=new myEmp1(15,"ummm");
        System.out.println(e4.getId());
        System.out.println(e4.getName());

    }
}
