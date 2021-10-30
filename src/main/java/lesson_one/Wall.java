package lesson_one;


public class Wall implements Barrier{

    private int height;

    public void Wall(){
        height = 1;
    }

    @Override
    public void overcome(int overcome) {
        height=overcome;
    }
}
