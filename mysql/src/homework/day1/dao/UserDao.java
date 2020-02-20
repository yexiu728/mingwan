package homework.day1.dao;

import homework.day1.entity.User;
import homework.day1.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yexiu
 * @version 1.0
 * @Description DAO层，操作数据库
 * @date 2020/2/19 19:08
 */
public class UserDao {

    public static void main(String[] args) {
        new UserDao();
    }

    public UserDao() {
        // addUser(new User(null, "九牛一毛", "jiuniu"));
        // deleteUser(2);
        // updateUser(new User(1, "一生一世", "busanbusi"));

        String sql = "select * from sys_user where 1=1 limit 0,5";
        queryUser(sql);
    }

    // 表名
    String tableName = "sys_user";

    public void queryUser(String sql, Object... objs) {

        // 创建连接
        Connection conn = DbUtils.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<>();
        try {
            // 执行查询
            stat = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    stat.setObject(i + 1, objs[i]);
                }
            }
            rs = stat.executeQuery();
            // 获得结果
            User user = null;
            while (rs.next()) {
                user = new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeDB(conn, stat, rs);
        }

        // 打印结果
        list.stream().forEach(System.out::println);

    }

    /**
     * @param user 实体类
     * @return void
     * @Description 根据实体类id修改其他字段数据
     * @author Yexiu
     * @date 2020/2/19 19:31
     */
    public void updateUser(User user) {
        String sql = "update " + tableName + " set name=?, password=? where id=?";
        int result = DbUtils.updateSql(sql, user.getName(), user.getPassword(), user.getId());
        printResult(result);
    }

    /**
     * @param id 数据对应的id
     * @return void
     * @Description 删除数据
     * @author Yexiu
     * @date 2020/2/19 19:28
     */
    public void deleteUser(Integer id) {
        String sql = "delete from " + tableName + " where id = ?";
        int result = DbUtils.updateSql(sql, id);
        printResult(result);
    }

    /**
     * @param user 实体类
     * @return void
     * @Description 向sys_user表添加数据
     * @author Yexiu
     * @date 2020/2/19 19:18
     */
    public void addUser(User user) {
        String sql = "insert into " + tableName + "(id, name, password) values(?, ?, ?)";
        int result = DbUtils.updateSql(sql, user.getId(), user.getName(), user.getPassword());
        printResult(result);
    }

    /**
     * @param result 修改结果
     * @return void
     * @Description 对结果进行处理，打印修改成功还是失败
     * @author Yexiu
     * @date 2020/2/19 19:27
     */
    public void printResult(int result) {
        if (result > 0) {
            System.out.println("执行成功，影响行数：" + result);
        } else {
            System.out.println("执行失败");
        }
    }
}
