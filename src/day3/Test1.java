package day3;

import java.util.HashMap;

/**
 * @author lsw-shaowu
 * @date 2021/1/6
 */
public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("name","lsw");
        String name=hashMap.get("name");
        System.out.println(name);
    }
}

