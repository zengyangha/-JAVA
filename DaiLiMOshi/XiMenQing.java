package DaiLiMOshi;

public class XiMenQing {

    public static void main(String[] args) {

        WangPO wangPO = new WangPO();

        wangPO.plaiWithMan();
        wangPO.makeEyeWithMan();

        System.out.println("-----------------");

        JiaShi jiaShi = new JiaShi();

        WangPO wangPO1 = new WangPO(jiaShi);

        wangPO1.plaiWithMan();
        wangPO1.makeEyeWithMan();


    }


}
