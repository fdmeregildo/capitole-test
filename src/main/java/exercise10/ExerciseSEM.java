package exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseSEM {

    /**
     * @param array
     * @return
     */
    public static List<Integer> getSEM(Integer[] array){

        List<Integer> newList = new ArrayList<>();
        List<Integer> list = Arrays.asList(array);

        for (int i=0; i< list.size(); i++){
            for (int j= i+1; j< list.size(); j++){

                if(list.get(i) < list.get(j)){
                    newList.add(list.get(j));
                    break;
                }
            }

            if(newList.size() < i+1){
                newList.add(-1);
            }
        }

        return newList;
    }

    public static void main(String[] args) {

        Integer[] array1 = {4, 5, 2, 25};
        Integer[] array2 = {13, 7, 6, 12};

        getSEM(array1).forEach(x-> System.out.print(x +", "));
        System.out.println();

        getSEM(array2).forEach(x-> System.out.print(x +", "));
        System.out.println();


    }
}
