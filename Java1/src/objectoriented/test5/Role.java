package objectoriented.test5;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;//长相是随机的



    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role（）；
    //Role r2 = new Role（）；
    //r1.攻击(r2);
    //方法的调用者去攻击参数
    public void attack(Role role){
        //计算造成伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;//+1 是因为随机取值的范围是左闭右开的，也就是原来是[0,20)，+1后，[1,21)

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对剩余血量做一个验证，如果为负数了，就修改为0
        remainBlood = remainBlood < 0 ? 0 : remainBlood;//三元运算符
        //修改一下挨揍的人的血量
        role.setBlood(remainBlood);
        
        //this表示方法的调用者
        System.out.println(this.getName() + "打了" + role.getName() + "一下" +
                "造成了" + hurt + "点伤害" + role.getName() + "还剩下了" + remainBlood + "点血");
    }


}
