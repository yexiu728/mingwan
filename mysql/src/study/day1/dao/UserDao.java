package study.day1.dao;

import study.day1.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// dao层
public class UserDao {

    public static void main(String[] args) {
        new UserDao();
    }

    public UserDao() {

        // 查询数据
        /*List<User> list = select();
        list.stream().forEach(n -> {
            System.out.println(n);
        });*/

        // 添加数据
        /*User user = new User(null, "user1", "111111");
        addUser(user);*/

        // 更新数据
        /*User user = new User(4, "wang2", "password");
        updateUser(user);*/

        // 删除数据
        // deleteById(4);

    }

    // 1、驱动、账号、密码、url地址
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/yexiu";
    String user = "root";
    String password = "root";

    // 删除数据
    public void deleteById(Integer id) {
        Connection conn = null;
        PreparedStatement stat = null;

        try {
            // 1、连接
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            // 2、删除
            String sql = "delete from sys_user where id=?";
            stat = conn.prepareStatement(sql);
            stat.setObject(1, id);
            int result = stat.executeUpdate();

            // 3、结果
            System.out.println("MySQL返回：" + result);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null)
                    stat.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 更新数据
    public void updateUser(User u) {
        Connection conn = null;
        PreparedStatement stat = null;

        try {
            // 1、连接
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            // 2、修改
            String sql = "update sys_user set name=?, password=? where id=?";
            stat = conn.prepareStatement(sql);
            stat.setObject(1, u.getName());
            stat.setObject(2, u.getPassword());
            stat.setObject(3, u.getId());
            int result = stat.executeUpdate();

            // 3、结果
            System.out.println("MySQL返回：" + result);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null)
                    stat.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 添加数据
    public void addUser(User u) {
        Connection conn = null;
        PreparedStatement stat = null;

        try {
            // 1、连接
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);

            // 2、添加
            String sql = "insert into sys_user(id,name,password) values(null,?,?)";
            stat = conn.prepareStatement(sql);
            // 向问号插入数据，从1 开始
            stat.setObject(1, u.getName());
            stat.setObject(2, u.getPassword());
            int result = stat.executeUpdate();

            // 3、结果
            if (result > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stat != null)
                    stat.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 查询数据
    // 命名：list开头、find开头、select开头、query开头
    public List<User> select() {
        List<User> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            // 第一步：连接数据库
            // 1、注册驱动
            Class.forName(driver);
            // 2、获取连接
            conn = DriverManager.getConnection(url, user, password);

            // 第二步
            // 实例化 PreparedStatement
            String sql = "select id, name, password from sys_user";
            stat = conn.prepareStatement(sql);
            rs = stat.executeQuery();

            // 第三步
            // 取出结果集中的数据，放入list中
            User user = null;
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));

                list.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源（先开后关，后开先关）
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

        return list;
    }


}
