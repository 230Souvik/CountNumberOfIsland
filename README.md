Find Number of Island in Java
Finding number of island problem is a standard problem usually asked in top companies coding round interview. The problem is based on the graph theory. In graph theory, we find the number of connected components. In this problem, we have to find the same. So, in this section, we will discuss the island problem statement, algorithm, and Java program to find the number of islands.

Problem Statement
In this problem, an island is nothing but a group of connected one's in Boolean 1D, 2D or multidimensional (n-D) array. In this problem, we have to find the number of islands (group of 1's) in a boolean matrix. Note that 1 denotes land.

The statement can be rewritten as follows.



Given a boolean 2D matrix in which 1's denotes land and 0's denotes water. In this matrix, we have to count the number of islands. An island is a place that is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. Assume all four edges of the grid are all surrounded by water. The following image depicts the same.

Find Number of Island in Java
In the above image, the blocks that are highlighted with green color (1's) denotes land and the blocks highlighted with yellow color (0's) denotes water. The above matrix has five islands.

The above problem is related to connected component in an undirected graph. So first, we will understand what is connected component.

Connected Components
A connected component is a graph in which each pair of nodes is connect with each other via path(s) and which is connected to no other vertices outside the subgraph. For example, consider the following graph.

Find Number of Island in Java
Example:

Consider the following matrix.

Find Number of Island in Java
In the above matrix there is only one group of connected 1's. Hence, it denotes only one island.

Solution to the Problem
There are many solutions to the problem. It can be solved either using DFS or BFS. In this section, we will solve the problem using the DFS with recursive and non-recursive approach.

Using Depth First Search (DFS)
In this approach, we will traverse all the lands (1's) of the matrix one by one. If we found any land untraversed or not visited yet, it means we have to found new islands. Once we visit the island, we will increase the number of islands by 1. Using DFS or BFS, we will mark all the lands which are connected as visited.

Algorithm

Define a Boolean array and set all the values as false.
Define a variable ans and initialize it with 0. In this variable, we will store the final answer.
Traverse over each element of the grid.
Check whether it is land (1's) or not, if land increase the variable ans by one.
After that, start either DFS or BFS traversal for that element.
