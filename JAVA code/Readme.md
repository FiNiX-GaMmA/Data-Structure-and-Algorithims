# All the codes witten here are in **_JAVA_**

| Question | Procedure | Time complexity |
|-----|-----|----|
| Palindrome | I used the procedure of dividing the number by 10 and the remainder is the reversed didgit and then checked if the digit are the same|O(n)
| Factorial | I used two methods one _recursive_ and another _iterative_ - in recursive the base case is when n = 0 then **return 0** | Recursive => T(n) = T(n-1)+O(1) for Iterative => O(n)|
| Trailing Zeros | count the number of five so {n/5} will give the number of five that comes ones then {n/25} will give the give the nuber of 5 that comes twice and so one|takes O(log5(n) times to solve) |
| GCD of a number | Using Euclidean ALgorithm which states GCD(a,b) = GCD(a-b,b) and we do this in a recursive call| O(log(min(a,b)))|
| LCM of a number | LCM = (a x b)/(GCD(a,b)) and for the GCD i used the Eucledian algorith  | Recurssion time taken + O(1) = O(log(min(a,b)) +O(1)|
|Palindrome using recursion|**Method 2** I used recursion to check the first and last letters recursively and if they are same i returned palindrome else not|T(n) = T(n-1)+O(1) time taken|