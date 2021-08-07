package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:19 上午
 */
public class WeiDanCamera implements Camera{
    @Override
    public void photograph() {
        System.out.println("微单相机拍照");
    }

    @Override
    public void check() {
        System.out.println("微单相机检查");
    }
}
