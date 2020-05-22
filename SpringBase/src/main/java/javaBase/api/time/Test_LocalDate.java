package javaBase.api.time;

import org.junit.Test;

import java.time.LocalDate;

public class Test_LocalDate {

    @Test
    public void test1()
    {
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}
