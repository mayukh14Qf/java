interface myGrandMother{
    void look();
    void height();
}
interface myGrandFather {
    void vocal();
    void eye();
}
class father1 implements myGrandFather{
    public void vocal(){
        System.out.println("my fathers vocal is awesome");
    }
    public void eye(){
        System.out.println("eye is glimmer");
    }
}
class dear{
    void comrade(){
        System.out.println("my dear comrade");
    }
}
class mother extends dear implements myGrandFather,myGrandMother{
    public void vocal(){
        System.out.println("my fathers vocal is awesome");
    }
    public void eye(){
        System.out.println("eye is glimmer");
    }
    public void look(){
        System.out.println("look is awesome");
    }
    public void height(){
        System.out.println("height is aww");
    }


}
public class interface1 {
    public static void main(String[] args) {
        mother m1 =new mother();
        m1.comrade();
        m1.height();

    }
}
