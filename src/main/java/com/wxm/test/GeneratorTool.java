package com.wxm.test;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * 
 * @author wxm
 * 2018年2月24日
 */
public class GeneratorTool {
    public static void main(String[] args) {
        shell();
    }

    private static void shell() {
        List<String> warnings = new ArrayList<String>();
        try {
            boolean overwrite = true;
          //  File configFile = new File("E:/workspace/SpringbootStartByMyselfTomcat/src/main/resources/generatorConfig.xml");
            File configFile = new File("classpath:generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                    callback, warnings);
            ProgressCallback progressCallback = new VerboseProgressCallback();
            // myBatisGenerator.generate(null);
            myBatisGenerator.generate(progressCallback);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}