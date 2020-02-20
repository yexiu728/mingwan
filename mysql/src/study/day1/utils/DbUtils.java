package study.day1.utils;

import java.sql.*;

public class DbUtils {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/yexiu";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // 获得连接
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    // 关闭连接
    public static void close(Connection conn, PreparedStatement stat, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 添加、修改、删除
    public static void updateDML(String sql, Object... objs) {
        if (sql == null || sql.equals("")) {
            return;
        }

        Connection conn = getConn();
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(sql);

            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    stat.setObject(i + 1, objs[i]);
                }
            }
            stat.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn, stat, null);
        }
    }

    // 查询

}
