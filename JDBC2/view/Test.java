package B8_5.view;


import B8_5.entity.Goods;
import B8_5.service.GoodService;

import java.util.List;
import java.util.Scanner;

//表示层
public class Test {

    //表示层调用业务逻辑层
    private static GoodService goodService = new GoodService();


    public static void main(String[] args) {


        while (true) {
            System.out.println("商品管理系统-------------------------");
            System.out.println("1、查询所有商品信息" + "\t" + "2、新增商品" + "\t" + "3、修改商品信息" + "\t" + "4、删除指定商品" + "\t" + "5、退出系统");
            System.out.println("请选择：");

            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("查询所有商品信息");
                    List<Goods> allDoods = goodService.getAllDoods();
                    for (Goods good : allDoods) {
                        System.out.println(good.getId() + "\t" + good.getName() + "\t" + good.getPrice() + "\t" + good.getDesc() + "\t" + good.getListing_date());
                    }
                    continue;
                case 2:
                    System.out.println("新增商品,输入商品名称");
                    String name = sc.next();
                    System.out.println("输入商品价格");
                    double price = sc.nextDouble();
                    System.out.println("输入商品的描述");
                    String desc = sc.next();

                    goodService.addGoods(new Goods(name, price, desc));
                    continue;
                case 3:
                    System.out.println("修改商品信息,输入要修改的商品编号");
                    int id = sc.nextInt();
                    System.out.println("新增商品,输入商品名称");
                    name = sc.next();
                    System.out.println("输入商品价格");
                    price = sc.nextDouble();
                    System.out.println("输入商品的描述");
                    desc = sc.next();

                    boolean flag = goodService.editGoods(new Goods(id, name, price, desc));
                    System.out.println(flag ? "修改成功" : "修改失败");
                    continue;
                case 4:
                    System.out.println("删除指定商品,输入你要删除的商品编号");
                    id = sc.nextInt();
                    flag = goodService.deleteGoodsByID(id);
                    System.out.println(flag ? "删除成功" : "删除失败");
                    continue;
                case 5:
                    System.out.println("退出系统");

                    break;
            }

            break;
        }


    }

}
