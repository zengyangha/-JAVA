package B8_5.service;


import B8_5.dao.GoodsDao;
import B8_5.entity.Goods;

import java.util.List;

//业务逻辑层
public class GoodService {

    private GoodsDao goodsDao=new GoodsDao();

    public List<Goods> getAllDoods(){

        return goodsDao.selectGoods();

    }


    public void addGoods(Goods goods){
        goodsDao.insertGoods(goods);
    }

    public boolean editGoods(Goods goods){
        return goodsDao.updateGooods(goods);

    }


    public boolean deleteGoodsByID(int id) {


        return goodsDao.deleteGoodsByid(id);
    }



}
