# 📊 Thống Kê Khách Hàng Theo Doanh Thu - Microservice

Chức năng này thuộc hệ thống quản lý bán hàng, được xây dựng theo kiến trúc **Microservices** với **Spring Boot** và triển khai trên **Kubernetes (K8s)**.

---

## 🚀 Mục Tiêu

Thống kê và phân loại khách hàng dựa theo tổng doanh thu, phục vụ cho việc phân tích, chăm sóc và định hướng kinh doanh.

---

## 🧩 Kiến Trúc Microservice

Hệ thống được tách thành các service riêng biệt:

- **Customer Service**: Quản lý thông tin khách hàng.
- **Contract Service**: Quản lý thông tin hợp đồng
- **Payment Service**: Ghi nhận đơn hàng và doanh thu.
- **Statistic Service (dịch vụ này)**: Tổng hợp và phân tích dữ liệu để thống kê khách hàng theo doanh thu.

Các dịch vụ giao tiếp thông qua **Feign Clients**.

---

## ⚙️ Công Nghệ Sử Dụng

| Thành phần     | Công nghệ                         |
|----------------|-----------------------------------|
| Backend        | Spring Boot                       |
| Giao tiếp      | REST API, Feign Client            |
| Service Discovery | Eureka           |
| Config         | Spring Cloud Config               |
| CI/CD          | Jenkins / GitHub Actions          |
| Container hóa  | Docker                            |
| Orchestration  | Kubernetes (K8s)                  |
| Database       | MySQL / PostgreSQL                |

---

## 📈 Luồng Thống Kê Doanh Thu

1. **Payment Service** lưu đơn hàng và doanh thu theo từng khách hàng.
2. **Statistic Service** gọi API hoặc nhận dữ liệu từ Payment Service.
3. Tính toán tổng doanh thu từng khách hàng.
4. Trả về danh sách khách hàng được sắp xếp theo doanh thu giảm dần.

---

## 📦 Triển Khai Trên Kubernetes

1. **Dockerize** các service (`Dockerfile`)
2. Tạo **deployment YAML** cho mỗi service
3. Expose API thông qua **Ingress / NodePort**
4. Gọi thống kê từ `Statistic Service` qua API như:

```bash
GET /api/statistics/customers-by-revenue
