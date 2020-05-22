package javaBase.api.lang;


import org.junit.Test;

public class Test_Runtime {

    @Test
    public  void test1()
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);
        System.out.println(runtime.totalMemory() + "=" + runtime.freeMemory());
    }
}
