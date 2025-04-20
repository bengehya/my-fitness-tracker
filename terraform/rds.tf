resource "aws_db_instance" "mydb" {
  allocated_storage    = 20
  storage_type         = "gp2"
  engine               = "mysql"
  engine_version       = "8.0"
  instance_class       = "db.t2.micro"   # Pour Free Tier 100%
  db_name              = "mydatabase"
  username             = "admin"
  password             = "Lejeune200$"
  skip_final_snapshot  = true
  publicly_accessible  = false
  backup_retention_period = 7
}
