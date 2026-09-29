LRU Cache & Data Structures Implementation — Java

A Java-based Data Structures project implementing an LRU (Least Recently Used) Cache using custom data structures.

Project Overview

The project combines a custom Doubly Linked List and Hash Table to implement an efficient LRU Cache.

The Hash Table uses a hash function with quadratic probing for collision handling, while the Doubly Linked List maintains the order of recently used elements.

Data Structures

* Doubly Linked List
* Hash Table
* LRU Cache
* Custom Node structure

Features

* Insert elements into the Doubly Linked List
* Move accessed nodes to the front
* Remove nodes and the tail element
* Hash Table insertion, search, and removal
* Quadratic probing for collision handling
* LRU Cache get, put, and remove operations
* Automatic eviction of the least recently used element
* Updating existing cache values
* Multiple test cases for verifying the implementation

Technologies

* Java
* Data Structures
* Algorithms

Testing

The project includes console-based test cases covering:

* Doubly Linked List operations
* Hash Table operations
* LRU Cache insertion and access
* Cache eviction
* Updating existing keys
* Removing elements
* Empty cache operations
* Repeated access scenarios

How to Run

Open the project in a Java IDE such as NetBeans and run the Main.java file to execute the test cases and view the results in the console.
