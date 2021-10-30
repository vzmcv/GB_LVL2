package lesson_one;


public class Robot implements Player {

    private String name;

    public Robot(String name, int lengthRun) {
        this.name = name;
    };

    @Override
    public void jump(Wall w) {
        System.out.println( name + " can't jumped the wall");
    }

    @Override
    public void run(Track r) {
        System.out.println(name + " run track");

    }

}
