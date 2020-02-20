package study.day2.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import study.day2.DbUtils.DbUtils;
import study.day2.entity.User;

import java.util.List;

/**
 * @author Yexiu
 * @version 1.0
 * @Description
 * @date 2020/2/20 9:28
 */
public class UserDao {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        // System.out.println(userDao.getUserById(1));
        // System.out.println(userDao.getCount());
        // userDao.select("一").stream().forEach(System.out::println);
        // System.out.println(userDao.addUser(new User(null, "十全十美", "shiquan")));
        // System.out.println(userDao.update(new User(1, "一五一十", "yiwuyishi")));
        // System.out.println(userDao.delete(10));

    }

    private JdbcTemplate template = new JdbcTemplate(DbUtils.getDataSource());

    public int delete(Integer id) {
        String sql = "delete from sys_user where id=?";
        return template.update(sql, id);
    }

    // 修改
    public int update(User user) {
        String sql = "update sys_user set name=?, password=? where id=?";
        return template.update(sql, user.getName(), user.getPassword(), user.getId());
    }

    // 添加
    public int addUser(User user) {
        String sql = "insert into sys_user(id, name, password) values(?, ?, ?)";
        return template.update(sql, user.getId(), user.getName(), user.getPassword());
    }

    // 查询
    public List<User> select(String name) {
        String sql = "select id, name, password from sys_user where name like ?";
        List<User> list = template.query(sql, new BeanPropertyRowMapper<>(User.class), "%" + name + "%");

        return list;
    }

    // 查询数据量
    public Integer getCount() {
        String sql = "select count(1) from sys_user";
        return template.queryForObject(sql, Integer.class);
    }

    // 根据id查询数据
    public User getUserById(Integer id) {
        String sql = "select * from sys_user where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }

}
