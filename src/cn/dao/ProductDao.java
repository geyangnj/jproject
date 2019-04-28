package cn.dao;

import cn.model.Product;
import cn.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

// 主要是用来完成对Product表的CRUD操作
public class ProductDao {

    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        // ctrl + / 注释当前行
        Product product = new Product();
        product.setId(1);
        product.setName("红米手机");
        product.setPrice(3999);
        product.setRemark("手机介绍");
        dao.update(product);
    }

    public List<Product> query(String name){
        return null;
    }

    // 编写一个方法用来实现数据插入功能
    public void update(Product product) {
        // sql = "delete from product where id = ? "
        String sql = "update product set name = ?,price = ?,remark = ? where id = ?";
        // 1: 获取数据库的连接对象 (Connection当前Java项目与数据库进行连接)
        Connection con = JdbcUtils.getConnection();
        // 2: 通过connection对象生成PreparedStatement对象,此对象用来接收SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            // 配置第1个?号指定参数
            pre.setString(1,product.getName());
            pre.setDouble(2,product.getPrice());
            pre.setString(3,product.getRemark());
            pre.setInt(4,product.getId());
            // 执行最后的SQL语句 update: delete,save,update
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        // sql = "delete from product where id = ? "
        String sql = "delete from product where id = ?";
        // 1: 获取数据库的连接对象 (Connection当前Java项目与数据库进行连接)
        Connection con = JdbcUtils.getConnection();
        // 2: 通过connection对象生成PreparedStatement对象,此对象用来接收SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            // 配置第1个?号指定参数
            pre.setInt(1,id);
            // 执行最后的SQL语句 update: delete,save,update
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 编写一个方法用来实现数据插入功能
    public void save(Product product) {
        String sql = "insert into product (name,price,remark ) values (?,?,?)";
        // 1: 获取数据库的连接对象 (Connection当前Java项目与数据库进行连接)
        Connection con = JdbcUtils.getConnection();
        // 2: 通过connection对象生成PreparedStatement对象,此对象用来接收SQL语句
        try {
            PreparedStatement pre = con.prepareStatement(sql);
            // 配置第1个?号指定参数
            pre.setString(1,product.getName());
            pre.setDouble(2,product.getPrice());
            pre.setString(3,product.getRemark());
            // 执行最后的SQL语句
            pre.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
