package lesson_one.player;

public class Cat implements Run, Jump{
    private String name;

    public Cat (String name){
        this.name = name;
    }

    @Override
    public void run (){
        System.out.println("Cat " + name + " run");
    }
    public void jump (){
        System.out.println("Cat " + name + " jump");
    }
}
