package lesson_one.player;

public class Human implements Run, Jump{

    private String name;

    public Human (String name){
        this.name = name;
    }

    @Override
    public void run (){
        System.out.println("Human " + name + " run");
    }
    public void jump (){
        System.out.println("Human " + name + " jump");
    }
}
