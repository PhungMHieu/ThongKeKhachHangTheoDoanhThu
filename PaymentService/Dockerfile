# Giai đoạn build
FROM maven:3.9.5-eclipse-temurin-17 AS builder
WORKDIR /build
COPY . .
# Kiểm tra xem pom.xml đã có trong thư mục chưa
RUN ls -al /build  # Thêm lệnh này để kiểm tra thư mục
RUN mvn clean package -DskipTests

# Giai đoạn chạy
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /build/target/PaymentService-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "app.jar"]
