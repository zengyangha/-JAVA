package B8_5.dao;

import B8_5.entity.Goods;
import B8_5.utils.Tools;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

//数据访问层
public class GoodsDao {

    private QueryRunner queryRunner = new QueryRunner(Tools.getDataSource());

    //当实体类的属性和表的列名不一致时，会查询不出，更改sql语句就好，例如;
    //select book_no as bookno,book_name  bookName,book_date bookdate from t_book_info;
    public List<Goods> selectGoods() {
        List<Goods> list = null;
        try {
            //new BeanListHandler<Goods>(Goods.class)的作用是将查询的到的数据库结果集转化成Goods.class类型,BeanListHandler中间有list，代表返回的是集合
            list = queryRunner.query("select * from goods_tb", new BeanListHandler<Goods>(Goods.class));
            //得到单个结果集
            //Goods goods=queryRunner.query("select * from goods_tb where id=?", new BeanHandler<Goods>(Goods.class),8888888);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    public void insertGoods(Goods goods) {
        try {
            queryRunner.update("insert into goods_tb values(null,?,?,?,now())", goods.getName(), goods.getPrice(), goods.getDesc());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean updateGooods(Goods goods) {
        boolean flag = false;
        try {
            int i = queryRunner.update("update goods_tb set `name`=?,`price`=?,`desc`=?,`listing_date`=now() where `id`=?", goods.getName(), goods.getPrice(), goods.getDesc(), goods.getId());
            flag = i > 0 ? true : false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return flag;

    }


    public boolean deleteGoodsByid(int id) {
        boolean flag = false;
        try {
            int i = queryRunner.update("delete from goods_tb where `id`=?", id);
            flag = i > 0 ? true : false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return flag;


    }
}
