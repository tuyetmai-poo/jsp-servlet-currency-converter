```jsp
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
    <h1>Ứng dụng chuyển đổi USD sang VND</h1>

    <form action="${pageContext.request.contextPath}/convert" method="post">
        <label for="rate">Tỷ giá (VND/USD):</label>
        <input type="number" id="rate" name="rate"
               step="any" min="0.000001" required>
        <br><br>

        <label for="usd">Số tiền USD:</label>
        <input type="number" id="usd" name="usd"
               step="any" min="0" required>
        <br><br>

        <button type="submit">Chuyển đổi</button>
    </form>
</body>
</html>
```
