package strategy.complexifelse;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:27 上午
 */
public class CameraTest {
    public static void main(String[] args) throws Exception {
        new CameraContext().processPhotograph(new ShuMaCamera());
        new CameraContext().processPhotograph(new SportCamera());
        new CameraContext().processPhotograph(new JiaoPianCamera());
        new CameraContext().processPhotograph(new WeiDanCamera());
        new CameraContext().processPhotograph(new DanfanCamera());
    }
}
