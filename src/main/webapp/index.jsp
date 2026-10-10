<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            margin-top: 100px;
            background-color: #f8fafc;
        }

        .container {
            background: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            text-align: center;
            width: 350px;
        }

        input {
            padding: 10px;
            margin: 10px 0;
            width: 90%;
            box-sizing: border-box;
        }

        button {
            background-color: #1b2a7a;
            color: white;
            padding: 12px;
            border: none;
            cursor: pointer;
            width: 90%;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Chuyển đổi USD sang VNĐ</h2>

        <form action="convert" method="POST">
            <label for="rate">Tỉ giá (VND/USD):</label>
            <input type="number" id="rate" name="rate"
                   value="25000" min="0.000001"
                   step="any" required>

            <label for="usd">Lượng USD cần đổi:</label>
            <input type="number" id="usd" name="usd"
                   min="0" step="any" required>

            <button type="submit">Chuyển đổi</button>
        </form>
    </div>
</body>
</html>
