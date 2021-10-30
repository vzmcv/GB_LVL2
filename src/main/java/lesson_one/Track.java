package lesson_one;


public class Track implements Barrier{
    private int length;


    public Track(int lengthTrack) {

    };

    public void Track(){
        length = 1;
    }

    @Override
    public void overcome(int overcome) {
        length = overcome;
    }

}

