package lesson_two;

import java.util.Arrays;

public class lesson_app {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = {{"1","1","1","1"},
                            {"1","2","0","1"},
                            {"1","1","1","1"},
                            {"1","1","1","1"}};
//        Wrong count array
//        String[][] array = {{"1","1","1","1"},
//                            {"1","2","0","1"},
//                            {"1","1","1","1"},
//                            {"1","1","1","1"}};

//        Wrong data
//        String[][] array = {{"1","1","1","1"},
//                            {"1","2","O","1"},
//                            {"1","1","1","1"},
//                            {"1","#","1","1"}};

        try {
            if(array.length != 4)throw new MyArraySizeException();
            System.out.println("Correct size");
        } catch (MyArraySizeException e){
            System.out.println("Wrong size array");
        };

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum +=Integer.parseInt(array[i][j]);
                }catch (IllegalArgumentException e1) {
                    throw new MyArrayDataException(e1 + " in row " + i + " : cell " + j);
                }
            }
        }
        System.out.println("Sum array = " + sum);
    }
}
