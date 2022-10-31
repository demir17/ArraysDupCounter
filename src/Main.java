import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {5,62,34,61,2,5,64,34,2,98,5};
        int temp = 0;
        int[] dup = new int[10];
        int temp2 =0;
        int temp3 = 0;

        Arrays.sort(list);

        for(int i: list){
            temp = i;
            if(temp == temp3){
                dup[temp2] = temp;
                temp2++;

            }

            temp3 = temp;

        }

        System.out.println("Tekrar edilen sayılar. \n" + Arrays.toString(dup));


    }
}
