package cn.mr8god.ichapternine;


interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}
class ActionCharacter{
    public void fight(){}
}

class Hero extends ActionCharacter implements CanFly, CanSwim, CanFight{
    @Override
    public void swim(){}
    @Override
    public void fly(){}
}
/**
 * @author Mr8god
 * @date 2020/4/18
 * @time 11:00
 */
public class Adventure {
    public static void t(CanFight x){ x.fight();}
    public static void u(CanSwim x){ x.swim();}
    public static void v(CanFly x){ x.fly();}
    public static void w(ActionCharacter x) { x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }

}
