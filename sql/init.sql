CREATE DATABASE IF NOT EXISTS customerdb;
CREATE DATABASE IF NOT EXISTS contractdb;
CREATE DATABASE IF NOT EXISTS paymentdb;

USE contractdb;

INSERT INTO contract (id, customer_id, ngay_ky, so_thang_tra_gop, tien_tra_truoc, tong_gia_tri) VALUES
(1001, 1, '2025-01-01', 12, 5000000, 30000000),
(1002, 2, '2025-02-01', 10, 2000000, 25000000),
(1003, 1, '2025-03-01', 8, 3000000, 20000000),
(1004, 3, '2025-01-15', 6, 1000000, 12000000);

USE paymentb;
INSERT INTO payment (contract_id, amount, payment_date, method)VALUES
(3, 5000000, '2025-04-17', 'BANK_TRANSFER'),
(2, 5000000, '2025-04-17', 'BANK_TRANSFER'),
(1, 5000000, '2025-04-17', 'BANK_TRANSFER');

