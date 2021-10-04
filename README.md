mvn clean package spring-boot:repackage

docker build --tag=product-server:latest .

docker run -p8080:9999 product-server:latest

curl localhost:8080/products

docker-compose up
