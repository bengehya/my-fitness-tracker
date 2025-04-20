output "bucket_name" {
  description = "The name of the S3 bucket"
  value       = aws_s3_bucket.test_bucket.id
}

output "db_instance_endpoint" {
  description = "The endpoint of the RDS instance"
  value       = aws_db_instance.mydb.endpoint
}

output "db_instance_identifier" {
  description = "The RDS instance identifier"
  value       = aws_db_instance.mydb.id
}

output "db_username" {
  description = "The master username for the RDS instance"
  value       = aws_db_instance.mydb.username
}

output "db_name" {
  description = "The database name"
  value       = aws_db_instance.mydb.db_name
}
