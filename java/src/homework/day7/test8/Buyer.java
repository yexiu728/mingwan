package homework.day7.test8;

// 采购专员
public class Buyer extends AdminStaff {

    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号为 " + getId() + " 的采购专员 " + getName() + " 在采购音响设备");
    }
}
