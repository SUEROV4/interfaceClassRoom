import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dom[] array = new Dom[4];
        array[0] = new Dom("Amantur",16,"Suerov");
        array[1] = new Dom("Bael",23,"Suerov");
        array[2] = new Dom("Gulshaiyr",42,"Arapova");
        array[3] = new Dom("Aktilek",20,"Suerov");
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------");
        Dormitory[] array1 = new  Dormitory[4];
        array1[0] = new Dormitory("jhrvkhbjrv",23,"fghj");
        array1[1] = new Dormitory("dfghj",15,"dfghj");
        array1[2] = new Dormitory("fghjk",21,"dfghj");
        array1[3] = new Dormitory("fghjk",21,"dfgh");
        System.out.println(Arrays.toString(array1));
        System.out.println("---------------------");
        Hotel[] array2 = new Hotel[4];
        array2[0] = new Hotel("fghj",11,"dfghj");
        array2[1] = new Hotel("fghj",12,"dfghj");
        array2[2] = new Hotel("fghj",13,"dfghj");
        array2[3] = new Hotel("fghj",14,"dfghj");
        System.out.println(Arrays.toString(array2));

    }
}