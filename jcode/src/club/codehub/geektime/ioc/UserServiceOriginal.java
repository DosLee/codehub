package club.codehub.geektime.ioc;

/**
 * 描述:
 * 控制反转 - 原型
 *
 * @author lil
 * @create 2020-07-14 下午10:56
 */
public class UserServiceOriginal {

    /**
     * 控制流程由程序员控制
     */
    public static boolean doProcess() {
        // to do something
        return true;
    }

    public static void main(String[] args) {
        if (doProcess()) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
