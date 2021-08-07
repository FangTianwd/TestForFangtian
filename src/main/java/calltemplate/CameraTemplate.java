package calltemplate;

public class CameraTemplate {
    /**
     * @param camera
     * @return CommonResult<java.lang.String>
     * @author jiangshengcheng
     * @date 2021/8/2 2:19 下午
     */
    public CommonResult<String> processPhotograph(Camera camera) throws Exception {
        try {
            System.out.println("拿起相机");
            camera.check();
            System.out.println("一切正常");
            camera.photograph();
            System.out.println("放下相机");
            return new CommonResult<>("完毕");
        } catch (Exception e) {
            throw new Exception("异常{}", e);

        }
    }
}
