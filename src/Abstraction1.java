abstract class myName{
    void family(){
        System.out.println("This is my Family");
    }
    abstract public void myTeam();
}
class myHouse extends myName{
    @Override
    public void myTeam() {

    }
}
abstract class myCar extends myHouse{
    void myDoor(){
        System.out.println("umm...the door");
    }
}
public class Abstraction1 {
    public static void main(String[] args) {


    }
}
