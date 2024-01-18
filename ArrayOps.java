public class ArrayOps {
    public static void main(String[] args) {
        //test findMissingInt
        System.out.println(findMissingInt(new int[] {3, 0, 1}));
        System.out.println(findMissingInt(new int[] {0, 1, 2, 3, 4, 6}));
        System.out.println(findMissingInt(new int[] {0}));
        //test secondMaxValue
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4}));
        System.out.println(secondMaxValue(new int[] {1, 2, 3, 4, 5}));
        System.out.println(secondMaxValue(new int[] {2, 8, 3, 7, 8}));
        System.out.println(secondMaxValue(new int[] {1, -2, 3, -4, 5}));
        System.out.println(secondMaxValue(new int[] {-202, 48, 13, 7, 8}));
        //test containTheSameElements
        System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
        System.out.println(containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3}));
        System.out.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
        System.out.println(containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}));
        //test isSorted
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        System.out.println(isSorted(new int[] {1, 2, 3}));
        System.out.println(isSorted(new int[] {1, -2, 3}));
        System.out.println(isSorted(new int[] {1, 1, 500}));
        System.out.println(isSorted(new int[] {1, 3, 2}));



    }
    
    public static int findMissingInt (int [] array) {
        //This function takes an array of integer values and returns the missing integer
        int n = array.length;
        int missing = 0;
        boolean isMissing [] = new boolean[n+1];
        for (int i=0 ; i<isMissing.length ; i++){
            isMissing[i] = true;
        }
        for (int i=0 ; i <= n ; i++){
            for (int j=0 ; j<array.length ; j++){
                if (i == array[j]){
                    isMissing[i] = false;
                }
            }
        }
        for (int i=0 ; i<isMissing.length ; i++){
            if (isMissing[i] == true){
                missing = i;
            }
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        //This function takes an array of integers, and returns the second largest number
        int Max = 0;
        int SecondMax = 0;
        int MaxLoc = 0;
        for (int i=0 ; i<array.length ; i++){
            if (array[i] > Max){
                Max = array[i];
                MaxLoc = i;
            }
        }
        for (int i=0 ; i<array.length ; i++){
            if (array[i] > SecondMax && (array[i] < Max || array[i] == Max && MaxLoc != i)){
                SecondMax = array[i];
            }
        }
        return SecondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        //This function takes two arrays of integers, and returns true if both arrays contain the same numbers
        boolean isTheSame = false;
        if (array1.length > array2.length){
            for (int i=0 ; i<array1.length ; i++){
                isTheSame = false;
                for (int j=0 ; j<array2.length ; j++){
                    if (array1[i] == array2[j]){
                        isTheSame = true;
                        break;
                    }
                }
                if (isTheSame == false){
                    return isTheSame;
                }
            }    
        } else {
            for (int i=0 ; i<array2.length ; i++){
                isTheSame = false;
                for (int j=0 ; j<array1.length ; j++){
                    if (array2[i] == array1[j]){
                        isTheSame = true;
                        break;
                    }
                }
                if (isTheSame == false){
                    return isTheSame;
                }
            }    
        }
        return isTheSame;
    }

    public static boolean isSorted(int [] array) {
        //This function takes an array of integers and checks if the array is sorted increasingly or decreasingly
        boolean isSorted = true;
        if (array[0] > array [1]){
            for (int i=0 ; i<array.length-1 ; i++){
                if (array[i] > array[i+1]){
                    isSorted = true;
                } else {
                    isSorted = false;
                }
            }
        } else { 
            for (int i=0 ; i<array.length-1 ; i++){
                if (array[i] <= array[i+1]){
                    isSorted = true;
                } else {
                    isSorted = false;
                }
            }
        }
        return isSorted;
    }

}
