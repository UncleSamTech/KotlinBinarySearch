import java.util.*;
class KotlinBinarySearch{
fun main(){

 fun binarySearch(vararg: Array<Int>, index: Int, value_to_find: Int): Int {
        //first step for implementing any binary search is sorting the array
        Arrays.sort(vararg)
        //the variables for index of the first,middle and last item are declared and initialized
        var firstItem = 0
        var lastItem = vararg.size - 1
        var middleItem: Int

        /**
         * A limit check is placed
         * This search continues provided the index of the first item is less than or equals last item
         * At this point cant be shrinked any further
         */
        while (firstItem <= lastItem) {
            /**
             * the index of the middle item is gotten but a check is carried out to make
             * sure we always get whole integer numbers
             * however if there are cases where we might have decimal values
             * the index values will be rounded up
             */
            middleItem =
                if ((firstItem + lastItem) % 2 == 0) (firstItem + lastItem) / 2
                else (firstItem + lastItem - 1) / 2

            /**
             * the binary search which adopts divide & conquer approach divides the array into two
             * it then compares the middle number to check if its the number we are looking for
             * if the check is true the value index will be set to the middle item
             * a message is also displayed to the user that number have been found with index number specified
             * we then break the function
             */
            if (vararg[middleItem] == value_to_find) {
                value = middleItem
                println("The value you are searching for is at position : $value")
                break
            }
            /**
             * if the prior check is false & the middle value is greater than the value we are looking for
             * we simply move the index of the last value backward just before the midddle number
             * this eliminates the other part of the array as other values higher than the middle values are invalid
             */
            else if (vararg[middleItem] > value_to_find) {
                lastItem = middleItem - 1
            }

            /**
             * if the middle value is less than the value we are looking for
             * this means the value to find is after the middle item so we move the index of the
             *first position immediately after the middle item
             */
            else if (vararg[middleItem] < value_to_find) {
                firstItem = middleItem + 1

            }

            /**
             * if none of the conditions reads to true
             * it means the number is not in the array
             * a message is displayed to the user and the index is returned as -1
             */
            else {
                println("Item not found")
                return -1
            }

        }//end of while
        return value
    }//end of binary search function
//test values
//it should return -1
    val values = arrayOf(45, 43, 67, 89, 98, 42, 67, 90, 78, 40, 73, 54)
    binarySearch(values, 0, 900)



}









}
