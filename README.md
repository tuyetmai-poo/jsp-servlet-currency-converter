# JSP Servlet Currency Converter

## Mô tả
Ứng dụng chuyển đổi USD sang VNĐ bằng Java JSP và Servlet.

## Chức năng
- Nhập tỉ giá VND/USD.
- Nhập lượng USD cần chuyển đổi.
- Gửi dữ liệu bằng phương thức POST.
- Servlet tính VNĐ = USD * Rate.
- Hiển thị kết quả chuyển đổi.

## Công nghệ
- Java 17
- Maven
- JSP
- Jakarta Servlet API 6.0
- Apache Tomcat 10.1+

## Cấu trúc
- index.jsp: Form nhập dữ liệu.
- ConverterServlet.java: Xử lý chuyển đổi.
- web.xml: Cấu hình ứng dụng.
- pom.xml: Cấu hình Maven.
