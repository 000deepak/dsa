package smartInterviewsBasic107;
//List Operations
//You are tasked with implementing a program that manipulates an empty list based on a series of commands.
//
//
//
//Input Format
//
//The first line of input contains an integer N, indicating the number of commands to follow. The next N lines contains any of the following commands:
//
//append X: Appends the integer X to the end of the list.
//count X: Count the number of occurrences of the integer X in the list.
//reverse: Reverses the order of elements in the list.
//insert Pos X: Inserts the integer X at the position Pos in the list.
//sort: Sorts the elements of the list in ascending order.
//index X: Gives the index of the first occurrence of the integer X in the list, or -1 if X is not found.
//length: Gives the length of the list.
//extend: Extends the list by appending it's current elements to itself.
//Output Format
//
//For count, index, and length command, print the result. For the remaining commands, print the updated list separated by spaces.
//
//
//
//Constraints
//
//1 <= N <= 50
//
//1 <= X <= 100
//
//0 <= Pos < length of the list
//
//
//
//Example
//
//Input
//
//10
//
//append 13
//
//append 7
//
//insert 1 6
//
//extend
//
//index 2
//
//reverse
//
//index 7
//
//length
//
//sort
//
//count 6
//
//
//
//Output
//
//13
//
//13 7
//
//13 6 7
//
//13 6 7 13 6 7
//
//-1
//
//7 6 13 7 6 13
//
//0
//
//6
//
//6 6 7 7 13 13
//
//2
//
//
//
//Explanation
//
//
//
//Self Explanatory
public class ListOpeations {
}