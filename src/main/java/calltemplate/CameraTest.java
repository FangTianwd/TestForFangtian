package calltemplate;

/**
 * @author jiangshengcheng
 * @date 2021年08月02日 10:57 上午
 */
public class CameraTest {
    public static void main(String[] args) throws Exception {
        CameraTemplate cameraTemplate = new CameraTemplate();
        CommonResult<String> stringCommonResult = cameraTemplate.processPhotograph(new Camera() {
            @Override
            public void photograph() {
                System.out.println("照片");
            }

            @Override
            public void check() {
                System.out.println("有电并打开镜头盖");
            }


        });
        System.out.printf("响应为%s", stringCommonResult.getResultObject());
        System.out.println("");
    }
}
