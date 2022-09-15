package arrays.ABC;
//step 1....match  and count

//step 2.....if count >1
// ----------check if already filtered
//-----------if yes  ,BREAK con move to next element
//-----------if not , add to filtered array
//-----------increase index & BREAK;

//step 3...repeat and iterate for other elements

//-------------------------------------IsAlreadyFiltered
//itereate through string
//check if element is non zero to compare
//convert string to integer to compare
public class RepeatingElements {
    public static void main(String[] args) {

        int[] array = new int[]{2, 5, 6, 9, 8, 7, 4, 5, 7, 8, 1, 2, 5, 4, 6, 3, 2, 9, 5, 2,};
        String[] filterd = new String[array.length]; // by default null
        int index = 0;
//-----------------------------------------------------------------------------------------------
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {                          //-----------match
                    count++;
                    if (count > 1) {                                     //----------checking element is repeating
                        if (!isAlreadyFiltered(filterd, array[i])) {     // checking if already filtered
                            filterd[index] = String.valueOf(array[i]);   //adding to filtered array
                            index++;
                        }
                        break;
                    }
                }
            }

        }

//--------------------------------------------------------------------------------------------------
        for (String i : filterd)                                //printing filtered array -----------O/P
            if (i != null)
                System.out.print(i + " ");
    }

    //---------------------------------------------------------------------------------------------------
    private static boolean isAlreadyFiltered(String[] filterd, int valueToBeChecked) {
        for (String i : filterd) {
            if (i != null) {                                    // to check if element is non zero
                if (Integer.parseInt(i) == valueToBeChecked)    //convert string to integer to & compare
                    return true;
            }
        }
        return false;
    }
}
