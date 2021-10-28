package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {

//    public String LongToString(Long longTest) {
//        String test = null;
//        test = Long.toString(longTest);
//    }

    public Long StringToLong(String stringTest) {
        Long test = null;
        test = Long.parseLong(stringTest);      //返回long基本数据类型
        test = Long.valueOf("");                //返回Long包装类型

        //String数组转Long
        String id = "111,222,333";
        String[] ids = id.split(",");
        List<Long> idsList =  Arrays.stream(ids)
                .map(s ->Long.parseLong(s.trim())).collect(Collectors.toList());
        return test;
    }

    static class Model {
        private String a;
        private String b;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }
    }

    public static void main(String[] args) {
//        List<Model> list = new ArrayList<>();
//        Model m = new Model();
//        m.setA("a");
//        m.setB("b");
//        list.add(m);
//
//        Model model = list.stream().filter(d -> d.getA().equals("c")).findFirst().get();
//        System.out.println(model.getB());
//        System.out.println(list.contains("a"));

        String id = "111,222,333";
        String[] ids = id.split(",");
        List<Long> idsList =  Arrays.stream(ids)
                .map(s ->Long.parseLong(s.trim())).collect(Collectors.toList());

        for (Long item: idsList) {
            System.out.println((item));
        }
    }
}
