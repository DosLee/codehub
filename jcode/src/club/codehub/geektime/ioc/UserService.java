package club.codehub.geektime.ioc;

/**
 * 描述:
 * 控制反转框架
 *
 * @author lil
 * @create 2020-07-14 下午11:09
 */
public abstract class UserService {
    public void run() {
        if (doProcess()) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

    public abstract boolean doProcess();
}
