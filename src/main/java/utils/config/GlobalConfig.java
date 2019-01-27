package utils.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;

public class GlobalConfig {
    private AppiumConfig appiumConfig;

    public static GlobalConfig load(String path){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        GlobalConfig globalConfig = new GlobalConfig();
        try {
            globalConfig = mapper.readValue(GlobalConfig.class.getResource(path),GlobalConfig.class);
            return globalConfig;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public AppiumConfig getAppiumConfig() {
        return appiumConfig;
    }

    public void setAppiumConfig(AppiumConfig appiumConfig) {
        this.appiumConfig = appiumConfig;
    }
}
