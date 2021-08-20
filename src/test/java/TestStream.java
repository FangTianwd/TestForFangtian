

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jiangshengcheng
 * @date 2021年07月30日 11:46 上午
 */
public class TestStream {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Stream<String> stream = arrayList.stream();

        Stream<Integer> integerStream = Stream.of(3, 2, 1, 0, 7);
//        List<Integer> collect1 = integerStream.filter(a -> a > 1 && a < 3).collect(Collectors.toList());
//        boolean b1 = integerStream.allMatch(b -> b >= 3);
//        boolean b = integerStream.anyMatch(c -> c > 3);
        Optional<Integer> first = integerStream.findFirst();
        System.out.println(first);

        List<Integer> integers = Arrays.asList(1, 3, 5, 2, 9);
        List<Integer> collect = integers.stream().collect(Collectors.toList());
        System.out.println(collect);

        JSONObject jsonObject = new JSONObject();
        String a = "{\n" +
                "        \"auth\": {\n" +
                "               \"identity\": {\n" +
                "                       \"methods\": [\"password\"],\n" +
                "                       \"password\": {\n" +
                "                               \"user\": {\n" +
                "                                       \"domain\": {\n" +
                "                                      \"name\": \"mo_bss_admin\" \n" +
                "                                      },\n" +
                "                                       \"name\": \"运营管理员用户名\",\n" +
                "                                       \"password\": \"运营管理员密码nginx-1.18.0.tar.gz\"\n" +
                "                               }\n" +
                "                       }\n" +
                "               },\n" +
                "               \"scope\":\n" +
                "                  {\n" +
                "                       \"domain\": \n" +
                "                       {\n" +
                "                           \"name\": \"mo_bss_admin\"\n" +
                "                       }\n" +
                "               }\n" +
                "        }\n" +
                "}";
        JSONObject object = JSON.parseObject(a);
        System.out.println(object);
        String s = object.toJSONString();


    }
    @Test
    public void testTrace() {
        Stream.of("beijing","tianjin","shanghai","wuhan")
                .map(String::length)
                .filter(e->e>5)
                .collect(Collectors.toList());
    }
    @Test
    public void testPeek(){
        Stream<String> one = Stream.of("one", "two", "three", "four");
        one.peek(System.out::println);
    }

    @Test
    public void testJsonPeek(){
        String jsonTest = "[\n" +
                "    {\n" +
                "        \"name\":\"jsc\",\n" +
                "        \"age\":\"23\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\":\"ft\",\n" +
                "        \"age\":\"24\"\n" +
                "    }\n" +
                "]";
        JSONArray objects = JSONArray.parseArray(jsonTest);
//        System.out.println(objects);
        List<User> users = JSONObject.parseArray(jsonTest, User.class);
//        List<User> jsc = users.stream().peek(a -> a.setName("jsc")).collect(Collectors.toList());
//        List<String> collect = users.stream().map(a -> a.getName()).collect(Collectors.toList());
        List<User> fangtian = users.stream().peek(a -> {
            if (a.getName().equals("jsc")) {
                a.setName("fangtian");
            }
        }).collect(Collectors.toList());
        System.out.println(fangtian);
        System.out.println(users);
        List<String> collect = users.stream().map(a -> {
            if (a.getName().equals("fangtian")) {
                a.setName("fangtianwd");
                return a.getName();
            }
            return null;
        }).collect(Collectors.toList());
        System.out.println(collect);


    }

    @Test
    public void testPage(){
        Stream<String> stringStream = Stream.of("123", "234", "345", "456", "567", "678", "789");
    }
    static class User{
        String name;
        String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

    /**
     * 数组转集合
     * @author jiangshengcheng
     * @date 2021/8/18 11:43 上午
     */
    @Test
    public void arrayToList(){
        String [] str = {"1","2","3","4","5"};
        List<String> strings = Arrays.asList(str);
        System.out.println(strings);
    }

    @Test
    public void listToArray(){
        ArrayList<String> strings = new ArrayList<>(5);
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        String[] strings1 = strings.toArray(new String[strings.size()]);
        System.out.println(strings1);


    }

    @Test
    public void objectsEquals(){
        Objects.equals(null,null);
        new HashMap<>();
    }

    @Test
    public void maxString(){
        String a = "";
        for(int i = 0;i < Integer.MAX_VALUE; i++){
            a+="s";
        }
        System.out.println(a);
    }
}
