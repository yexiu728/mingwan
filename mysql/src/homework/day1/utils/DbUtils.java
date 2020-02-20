package homework.day1.utils;

import homework.day1.entity.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Yexiu
 * @version 1.0
 * @Description 连接数据库的工具类
 * @date 2020/2/19 18:31
 */
public class DbUtils {

    // 驱动
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // 数据库地址
    private static final String URL = "jdbc:mysql://localhost:3306/yexiu?useSSL=false";
    // 用户名
    private static final String USER_NAME = "root";
    // 密码
    private static final String PASSWORD = "root";


    /**
     * @param sql SQL语句
     * @param objs 需要插入的数据
     * @return int 影响的数据行数
     * @Description 修改数据，支持 增、删、改
     * 增：insert into sys_user(id, name, password) values(null, ?, ?);
     * 删：delete from sys_user where id = ?;
     * 改：update sys_user set name=? where id=?;
     * @author Yexiu
     * @date 2020/2/19 18:59
     */
    public static int updateSql(String sql, Object... objs) {
        // SQL语句不允许为空，返回失败值0
        if (sql == null || sql.equals("")) {
            return 0;
        }

        // 获得连接
        Connection conn = getConn();
        PreparedStatement stat = null;
        int result = 0;
        // 执行语句
        try {
            stat = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    stat.setObject(i + 1, objs[i]);
                }
                result = stat.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDB(conn, stat, null);
        }

        return result;
    }

    /**
     * @param conn 数据库连接
     * @param stat 预定义对象
     * @param rs 结果集
     * @return void
     * @Description 关闭数据库连接所有对象，如果没有用到改对象，可以使用null
     * @author Yexiu
     * @date 2020/2/19 19:06
     */
    public static void closeDB(Connection conn, PreparedStatement stat, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
            if (stat != null)
                stat.close();
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param
     * @return java.sql.Connection
     * @Description 获得数据库连接
     * @author Yexiu
     * @date 2020/2/19 18:45
     */
    public static Connection getConn() {
        Connection conn = null;
        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 获得数据库连接
        try {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
