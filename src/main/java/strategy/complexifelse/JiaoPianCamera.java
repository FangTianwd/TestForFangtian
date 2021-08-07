package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:19 上午
 */
public class JiaoPianCamera implements Camera {
    @Override
    public void photograph() {
        System.out.println("胶片相机拍照");
    }

    @Override
    public void check() {
        System.out.println("胶片相机检查");
    }
}
