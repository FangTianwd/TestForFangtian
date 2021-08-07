package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:17 上午
 */
public class DanfanCamera implements Camera{
    @Override
    public void photograph() {
        System.out.println("单反相机拍照");
    }

    @Override
    public void check() {
        System.out.println("单反相机检查");
    }
}
