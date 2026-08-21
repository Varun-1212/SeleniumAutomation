package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();

        l.addAll(Arrays.asList("hi","bye","hii"));

        for (int i=0;i<4;i++)
        {
            System.out.println(l);
        }
    }
}
