package javaBase.api.lang;

import org.junit.Test;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

public class Test_ManageFactory {

    @Test
    public void test()
    {
        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();
        System.out.println(classLoadingMXBean);
        int loadedCount = classLoadingMXBean.getLoadedClassCount();
        long tatalCount = classLoadingMXBean.getTotalLoadedClassCount();
        long unloadCount = classLoadingMXBean.getUnloadedClassCount();
        System.out.println(loadedCount + " "+tatalCount+" "+unloadCount);
        OperatingSystemMXBean systemMXBean = ManagementFactory.getOperatingSystemMXBean();
        System.out.println(systemMXBean.getArch()+"=>"+systemMXBean.getSystemLoadAverage()+"=>"+systemMXBean.getAvailableProcessors());
    }

    @Test
    public void test2()
    {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String classpath = runtimeMXBean.getClassPath();
        System.out.println(classpath);
    }
}
