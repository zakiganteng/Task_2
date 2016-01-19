# Task_2
OOP ADF Task 2 : Advance Algorithm
* There are 2 exercise that you should complete in each respective class.
  * MinimumArray.java
  * OddOccurences.java
* Complete the task in group
  * write the student id of each member on the top of the each file

## Task 2 : Minimum Array
Write a method : 
  ``` 
  public int checkMinimum(int[] A, int[] B)
  ```
that, given a non-empty array A of N non-negative integers and a non-empty array B of M non-negative integers <br>
returns the minimal value that occurs in both arrays. <br>
If there is no such value, the function should return -1 <br>
<br>
* Example, given arrays A and B such that :  <br>
<t> A = { 1, 3, 2, 1 } <br>
<t> B = { 4, 2, 5, 3, 2 } <br>
<br>
your function should return 2, since 2 is the minimal value which occurs in both arrays <br>
<br>
* Example, given arrays A and B such that :  <br>
<t> A = { 2, 1 } <br>
<t> B = { 3, 3 } <br>
<br>
your function should return -1, since there is no value that occurs in both arrays<br>
<br>

## Task 2 : Odd Occurences
A non-empty array A consisting of N integers is given.<br>
The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.<br>
<br>
* Example, given array A such that:
<t> A = { 9, 3, 9, 3, 9, 7, 9 } <br>
<t><t> the elements at indexes 0 and 2 have value 9, <br>
<t><t> the elements at indexes 1 and 3 have value 3, <br>
<t><t> the elements at indexes 4 and 6 have value 9, <br>
<t><t> the element at index 5 has value 7 and is unpaired. <br>
<br>

Write a method:<br>
  ```
  public int checkOddOccurences( int[] A )
  ```
that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.<br>
as explained, Example above the method should return 7. <br>
<br>

* Example, given array A such that: <br>
<t> A = { 1, 7, 3, 3, 1, 7, 9, 1, 1 } <br>
your function should return 9, as 9 is unpaired <br>

