Recursion is a technique where a function calls itself to solve smaller subproblems.
It simplifies problems by reducing them to simpler versions of the same task. Every recursive function has two cases:

i)Base Case 

ii)Recurssive Case

Base case: 
Stops further recursive calls.
Formula: FV(0)=PV

Recursive case:
Calls itself with modified arguments. 
Formula:FV(n) = FV(n-1)×(1 + r)

TO calculate furthur value,we use the compound intrest formula:
             FV=PV*(1+r)*n;
where,
FV = Future Value,
PV = Present Value,
r  = AnnualGrowth rate,
n  = Number Of Years.

Analysis:

Time Complexity:

Recursive: O(n) — makes one recursive call per year.
Iterative: O(n) — loops through each year once.
Recursion offers a clean way to model problems like compound growth.
Always evaluate both clarity and efficiency when choosing recursion.
However, iteration is more efficient for performance and memory usage.
