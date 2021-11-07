package lesson_five;

public class main_app {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        float[] arr = new float[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        long singleTime = Thread_one(arr);
        long multiTime = Multi_Thread(arr);

    }

    private static long Thread_one (float[] arr){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long singleTime = System.currentTimeMillis() - startTime;

        System.out.println("One thread time: " + singleTime);

        return startTime;
    }

    private static long Multi_Thread (float[] arr){

        float[] a = new float[h];
        float[] b = new float[h];

        long startTime = System.currentTimeMillis();

        System.arraycopy(arr, 0, a, 0, h);
        System.arraycopy(arr, h, b, 0, h);

        Multi_Thread t1 = new Multi_Thread("a", a);
        Multi_Thread t2 = new Multi_Thread("b", b);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = t1.getArr();
        b = t2.getArr();

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, a.length, b.length);

        long multiTime = System.currentTimeMillis() - startTime;

        System.out.printf("Multi thread time: " + multiTime);

        return startTime;
    }
}

