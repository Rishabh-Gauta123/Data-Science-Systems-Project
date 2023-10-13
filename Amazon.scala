import org.apache.spark.graphx.{Graph, GraphLoader}
// Load the graph using your dataset file
val graph = GraphLoader.edgeListFile(sc, "D:/7th Sem/Data Science System/Project/Amazon0601.txt")

// Find the connected components
val cc = graph.connectedComponents().vertices

// Calculate the size of each connected component
val componentSizes = cc
  .map { case (_, componentId) => (componentId, 1) }
  .reduceByKey(_ + _)

// Sort the connected components by size in descending order
val sortedComponents = componentSizes
  .sortBy { case (_, size) => size }
  .collect()
  .reverse
// Print all connected components
sortedComponents.foreach { case (componentId, size) =>
  println(s"Connected Component ID: $componentId, Size: $size")
}