variable "cluster_name" {
  description = "A name for the cluster."
  type        = string
  default     = "My Cluster"
}

variable "cluster_autotermination_minutes" {
  description = "How many minutes before automatically terminating due to inactivity."
  type        = number
  default     = 60
}

variable "cluster_num_workers" {
  description = "The number of workers."
  type        = number
  default     = 4
}

data "databricks_node_type" "ds3v2" {
  local_disk = true
  min_cores = 4
  gb_per_core = 14
  category = "General Purpose"
}

# Long Term Support (LTS) version.
data "databricks_spark_version" "LTS104" {
  long_term_support = true
  scala = "2.12"
  spark_version = "3.2.1"

}

resource "databricks_cluster" "this" {
  cluster_name            = var.cluster_name
  node_type_id            = data.databricks_node_type.ds3v2.id
  spark_version           = data.databricks_spark_version.LTS104.id
  autotermination_minutes = var.cluster_autotermination_minutes
  num_workers             = var.cluster_num_workers
}

output "cluster_url" {
 value = databricks_cluster.this.url
}