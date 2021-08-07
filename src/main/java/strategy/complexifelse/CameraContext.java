package strategy.complexifelse;

import calltemplate.CommonResult;

/**
 * @author jiangshengcheng
 * @date 2021年08月06日 11:21 上午
 */
public class CameraContext {
    private Camera camera;
    public CameraContext(Camera camera){
        this.camera = camera;
    }

    public CameraContext() {
    }

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

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
