package src.basic_06_24Dec;

public class Lab104 {
    public static void main(String[] args) {

        int[] int_array= {22, 33, 44, 66, 77};
        long[] l_array = {23l, 33l, 66l};
        float[] f_array = {22.44f, 44.33f, 33.55f};
        double[] d_array = {33.22, 44.3, 55.44};

        boolean[] b_array = {true, false, true, false};
        String[] s_array = {"Aryan", "arjun", "Avi", "Ajay"};
        char[] c_array = {'A', 'B', 'C', 'D'};

        for (int i = 0; i < int_array.length; i++){
            System.out.println(int_array[i]);
        }

        System.out.println(f_array.length);
        System.out.println(s_array.length);

        for (int i = 0; i < s_array.length; i++){
            System.out.println(s_array[i]);
        }
    }
}
