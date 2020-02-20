package study.day2.DbUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Yexiu
 * @version 1.0
 * @Description
 * @date 2020/2/20 9:31
 */
public class DbUtils {

    // 数据源
    private static DataSource dataSource;

    // 加载配置文件
    static {
        try {
            Properties properties = new Properties();
            // properties.load(DbUtils.class.getResourceAsStream("/study/db.properties"));
            // String username = properties.getProperty("username");
            InputStream is = DbUtils.class.getResourceAsStream("/study/db.properties");
            properties.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取数据源
    public static DataSource getDataSource() {
        return dataSource;
    }

    // 获取连接（不用）
    public static Connection getConn() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
