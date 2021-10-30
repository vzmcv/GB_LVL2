package lesson_one;

public class Human implements Player {
    private String name;

    public Human(String name, int lengthRun) {
        this.name = name;
    };


    @Override
    public void run(Track r) {
        System.out.println(name + " ran track");

    }

    @Override
    public void jump(Wall w) {
        System.out.println("Human " + name + " jumped the wall");

    }

//    @Override
//    public String info() {
//        return "Человек";
//    }

}
