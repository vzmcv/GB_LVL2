package lesson_one;

public class App {

    public static void main(String[] args) {

        Player[] members ={
                new Cat("Barsik", 10),
                new Human("Igor", 12),
                new Robot("Bot", 14)
        };
        Track track = new Track(1);
        Wall wall = new Wall();
        Barrier[] barriers = {track,wall};

        for (Player m: members
        ) {
            for (Barrier b: barriers
            ) {
                if (b.equals(track)){
                    m.run(track);
                } else m.jump(wall);
            }
        }
    }
}
