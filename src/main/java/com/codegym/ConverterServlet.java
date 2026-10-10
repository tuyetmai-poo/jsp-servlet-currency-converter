package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ConverterServlet", urlPatterns = {"/convert"})
public class ConverterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            try {
                double rate = Double.parseDouble(
                        request.getParameter("rate"));

                double usd = Double.parseDouble(
                        request.getParameter("usd"));

                if (!Double.isFinite(rate)
                        || !Double.isFinite(usd)
                        || rate <= 0 || usd < 0) {
                    throw new NumberFormatException();
                }

                double vnd = rate * usd;

                NumberFormat nf =
                        NumberFormat.getNumberInstance(
                                new Locale("vi", "VN"));
                nf.setMaximumFractionDigits(2);

                out.println("<!DOCTYPE html>");
                out.println("<html lang='vi'>");
                out.println("<head><meta charset='UTF-8'>");
                out.println("<title>Kết quả</title></head>");
                out.println("<body style='font-family:Arial;text-align:center;margin-top:100px;'>");

                out.println("<h2>KẾT QUẢ CHUYỂN ĐỔI</h2>");
                out.println("<p>Tỉ giá: "
                        + nf.format(rate) + " VND/USD</p>");
                out.println("<p>Số tiền USD: $"
                        + nf.format(usd) + "</p>");
                out.println("<h3 style='color:green;'>Thành tiền VNĐ: "
                        + nf.format(vnd) + " VNĐ</h3>");

                out.println("<a href='index.jsp'>Quay lại</a>");
                out.println("</body></html>");

            } catch (NumberFormatException e) {
                response.setStatus(
                        HttpServletResponse.SC_BAD_REQUEST);

                out.println("<h2 style='color:red;text-align:center;'>");
                out.println("Lỗi: Vui lòng nhập tỉ giá và lượng USD hợp lệ!");
                out.println("</h2>");
                out.println("<p style='text-align:center;'>");
                out.println("<a href='index.jsp'>Quay lại</a></p>");
            }
        }
    }
}
