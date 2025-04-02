package com.jasper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {
        // 数据库URL、用户名和密码
        String url = "jdbc:mysql://localhost:3306/learn";
        String user = "root";
        String password = "1q2w3e4r";

        // SQL查询语句，包含两个参数占位符
        String query = "SELECT * FROM users WHERE age > ? AND city = ?";

        // 假设我们想要查找年龄大于20岁且城市为Beijing的用户
        int ageThreshold = 20;
        String city = "Boston";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1. 获取数据库连接
            conn = DriverManager.getConnection(url, user, password);

            // 2. 创建PreparedStatement对象
            pstmt = conn.prepareStatement(query);

            // 3. 设置SQL语句中的参数值
            pstmt.setInt(1, ageThreshold); // 第一个问号的位置，从1开始计数
            pstmt.setString(2, city);      // 第二个问号的位置

            // 4. 执行查询并获取结果集
            rs = pstmt.executeQuery();

            // 5. 处理结果集
            while (rs.next()) {
                System.out.println("User ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("City: " + rs.getString("city"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. 关闭资源
            try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
            try { if (pstmt != null) pstmt.close(); } catch (SQLException ignored) {}
            try { if (conn != null) conn.close(); } catch (SQLException ignored) {}
        }
    }
}