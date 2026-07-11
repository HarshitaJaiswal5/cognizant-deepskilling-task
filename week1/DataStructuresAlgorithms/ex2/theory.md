1. Big O Notation

Big O notation measures how the running time of an algorithm grows as the input size increases.

O(1) – Constant time
O(log n) – Logarithmic time
O(n) – Linear time
O(n²) – Quadratic time

It helps compare the efficiency of algorithms.

Search Cases
Best Case: Item is found immediately.
Average Case: Item is found somewhere in the middle.
Worst Case: Item is at the end or not present.


Time Complexity Analysis
Algorithm	Best Case	Average Case	Worst Case
Linear Search	O(1)	O(n)	O(n)
Binary Search	O(1)	O(log n)	O(log n)

Conclusion
More suitable for an e-commerce platform: Binary Search, because product data can be maintained in sorted order, allowing searches in O(log n) time and improving performance for large inventories.