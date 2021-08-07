package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:20 上午
 */
public class SportCamera implements Camera{
    @Override
    public void photograph() {
        System.out.println("运动相机拍照");
    }

    @Override
    public void check() {
        System.out.println("运动相机检查");
    }
}
