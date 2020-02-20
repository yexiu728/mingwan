package study.day1.dao;

import study.day1.entity.User;
import study.day1.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao2 {

    // 添加
    public void addUser(User u) {
        String sql = "insert into sys_user(id, name, password) values(null,?,?)";
        DbUtils.updateDML(sql, u.getName(), u.getPassword());
    }

    // 查询
    public List<User> select() {
        List<User> list = new ArrayList<>();

        // 连接
        Connection conn = DbUtils.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        String sql = "select * from sys_user";

        try {
            // 查询
            stat = conn.prepareStatement(sql);
            rs = stat.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                list.add(new User(id, name, password));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭
            DbUtils.close(conn, stat, rs);
        }

        return list;
    }
}
