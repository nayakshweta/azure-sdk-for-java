variable "databricks_host" {}

terraform {
  required_providers {
    azurerm = {
      source = "hashicorp/azurerm"
    }
    databricks = {
      source = "databricks/databricks"
    }
  }
}

provider "azurerm" {
  features {}
}

# Use Azure CLI authentication.
provider "databricks" {
  host = var.databricks_host
}