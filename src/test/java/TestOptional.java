import java.util.Optional;

/**
 * @author jiangshengcheng
 * @date 2021年07月30日 2:55 下午
 */
public class TestOptional {
    public static void main(String[] args) {
        Optional<Object> o = Optional.ofNullable(null);
        String s = (String) o.orElse("是个空");
        System.out.print(s);

        // create a Optional

//        Optional op
//
//                = Optional.of(9455);
//
//// print value
//
//        System.out.println("Optional: "
//
//                + op);
//
//// orElse value
//
//        System.out.println("Value by orElse"
//
//                + "(100) method: "
//
//                + op.orElse(100));

    }
}
