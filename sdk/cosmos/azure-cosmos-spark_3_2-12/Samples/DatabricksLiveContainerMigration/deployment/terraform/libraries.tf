resource "databricks_library" "cosmosspark" {
  cluster_id = databricks_cluster.this.id
  maven {
    coordinates = "com.azure.cosmos.spark:azure-cosmos-spark_3-2_2-12:4.7.0"
  }
}