package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:18 上午
 */
public class ShuMaCamera implements Camera{
    @Override
    public void photograph() {
        System.out.println("数码相机拍照");
    }

    @Override
    public void check() {
        System.out.println("数码相机检查");
    }
}
