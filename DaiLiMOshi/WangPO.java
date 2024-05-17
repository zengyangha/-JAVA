package DaiLiMOshi;

//王婆为代理人
public class WangPO implements KindWomen {
    private KindWomen kindWomen;

    public WangPO() {
        this.kindWomen=new PanJinLian();
    }

    public WangPO(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyeWithMan() {
        this.kindWomen.makeEyeWithMan();
    }

    @Override
    public void plaiWithMan() {
        this.kindWomen.plaiWithMan();
    }
}
