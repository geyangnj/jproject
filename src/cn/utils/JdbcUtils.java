package cn.utils;
import java.sql.Connection;
import java.sql.DriverManager;
// 此类用来完成数据库连接操作
public class JdbcUtils {

    public static void main(String[] args) {
        Connection conn = JdbcUtils.getConnection();
        System.out.println(conn);
    }

    // 3: 返回一个连接对象(Connection)
    public static Connection getConnection(){
        // 加载驱动的Driver类(mysql驱动的入口)
        try {
            // try里面的代码有错误,将会终止后面的代码，直接跳转到catch模块
            // 1: 加载数据库驱动文件
            Class.forName("com.mysql.jdbc.Driver");
            // 驱动管理类,通过此类设置账号,密码,url地址并且返回connection对象
            Connection conn =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo",
                    "root","root");
            return conn;
        } catch (Exception e) {
            // 显示错误信息
            throw new RuntimeException(e);
        }
    }
}
