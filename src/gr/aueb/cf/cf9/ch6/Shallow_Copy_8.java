package gr.aueb.cf.cf9.ch6;

public class Shallow_Copy_8 {
//otan kanoume copy to reference,to copy legetai shallow kai exei side effects
public static int[] getCopy(int[] arr) {
    int[] destin = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        destin[i] = arr[i];
    }
    return destin;
}

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;  //this is the shallow copy

        arr2[0] = 1000;
        System.out.println(arr1[0]);
        //-------------------------------------------
        // DeepCopy   Defensive Copy
        int [] myar = {10,20,30};
        int [] myarCopy;

        myarCopy = getCopy(myar);
        System.out.println();
    }
}
