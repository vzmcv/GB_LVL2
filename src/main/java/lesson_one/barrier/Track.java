package lesson_one.barrier;


import lesson_one.player.Cat;
import lesson_one.player.Human;
import lesson_one.player.Robot;

public class Track {

    protected String name;

    public void RunTrack(int Track){
        if(Track<=5){
            System.out.println(name + " пробежал");
        }
    }
}
