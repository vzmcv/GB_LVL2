package lesson_one;

import lesson_one.Player;

public class Cat implements Player {
    private String name;

    public Cat(String name, int lengthRun) {
        this.name = name;
    };

    @Override
    public void jump(Wall w) {
        System.out.println("Cat " + name + " jumped the wall");
    }

    @Override
    public void run(Track r) {
        System.out.println("Cat " + name + " ran");
    }
}

