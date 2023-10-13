# Data-Science-Systems-Project
## Title: Analyzing Amazon’s Co-Purchasing Network With Apache Spark


## This project uses Apache Spark's GraphX library to Analyzing Amazon’s Co-Purchasing Network With Apache Spark

## Tech Stack

- [Apache Spark](https://spark.apache.org/downloads.html): An open-source distributed computing framework.Here we are using Spark 3.5.0
- [Scala](https://www.scala-lang.org/download/all.html): A programming language that integrates smoothly with Spark. Here we are using scala 2.11.12 version
- [OpenJDK](https://openjdk.java.net/): An open-source implementation of the Java Platform. 

## Workflow

The workflow of the Project is:

1. Data Loading: The project starts by loading the Wikipedia Talk network dataset using Apache Spark's GraphLoader. Download dataset [here](https://snap.stanford.edu/data/amazon0601.html) 

2. Find Connected Components: Apply the connectedComponents() function to the graph. This function identifies connected components and assigns a unique component ID to each vertex based on the ID of its lowest-numbered vertex within the component. The result is a new graph where each vertex is associated with its component ID. In your code, you stored this result in the cc variable.
3. Calculate Component Sizes: Calculate the size of each connected component. This is done by mapping each vertex to a pair with its component ID and a count of 1. Then, you reduce this dataset by summing up the counts for each component ID. The result is a collection of component IDs and their respective sizes.

4. Sort Connected Components: Sort the connected components by size in descending order. In your code, you used the sortBy method to sort the components by their sizes, with the largest components appearing first. This step helps identify the most significant clusters.

5. Print Results: Finally, you printed the connected components with their component IDs and sizes to the console, providing a clear representation of the identified clusters within the graph.

## Team Members
1. Rishabh Gautam (20bcs112@iiitdwd.ac.in)
2. Deepesh mishra (20bcs43@iiitdwd.ac.in)
3. Mahendra Puniya  (20bcs082@iiitdwd.ac.in)
4. Ravi Kanth  (20bcs110@iiitdwd.ac.in
