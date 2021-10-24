package lesson_one.player;

public class Robot implements Run, Jump{

    private String name;

    public Robot (String name){
        this.name = name;
    }

    @Override
    public void run (){
        System.out.println("Robot " + name + " run");
    }
    public void jump (){
        System.out.println("Robot " + name + " jump");
    }
}
