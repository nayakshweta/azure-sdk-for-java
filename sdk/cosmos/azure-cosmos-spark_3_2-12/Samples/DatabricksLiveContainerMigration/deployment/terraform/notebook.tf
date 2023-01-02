variable "notebook_filename" {
  description = "The notebook's filename."
  type        = string
  default = "CosmosDBLiveSingleContainerMigration.scala"
}

variable "notebook_language" {
  description = "The language of the notebook."
  type        = string
  default = "SCALA"
}

resource "databricks_notebook" "this" {
  path     = "${data.databricks_current_user.me.home}/${var.notebook_filename}"
  language = var.notebook_language
  source   = "../../${var.notebook_filename}"
}

output "notebook_url" {
 value = databricks_notebook.this.url
}