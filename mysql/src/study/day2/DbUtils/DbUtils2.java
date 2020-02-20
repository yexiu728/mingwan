package study.day2.DbUtils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Yexiu
 * @version 1.0
 * @Description
 * @date 2020/2/20 10:47
 */
public class DbUtils2 {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/yexiu?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static DataSource dataSource;

    public static void main(String[] args) {
        System.out.println(getConn());
    }

    static {
        try {
            // 数据库连接池
            ComboPooledDataSource cpds = new ComboPooledDataSource();
            // 设置参数
            cpds.setDriverClass(DRIVER);
            cpds.setJdbcUrl(URL);
            cpds.setUser(USER);
            cpds.setPassword(PASSWORD);

            cpds.setInitialPoolSize(10);
            cpds.setMaxPoolSize(50);
            cpds.setMaxStatements(50);
            cpds.setMaxStatementsPerConnection(100);
            cpds.setMinPoolSize(5);


            dataSource = cpds;

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    // 获得连接
    public static Connection getConn() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
