package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.util.Map;

public class PageConfig {
    private Map<String,String> homepagelocator;
    private Map<String,String> searchpagelocator;
    private Map<String,String> stockdetaillocator;
    public static PageConfig load(String path){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        PageConfig pageConfig = new PageConfig();
        try {
            pageConfig = mapper.readValue(PageConfig.class.getResource(path),PageConfig.class);
            return pageConfig;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String, String> getHomepagelocator() {
        return homepagelocator;
    }

    public void setHomepagelocator(Map<String, String> homepagelocator) {
        this.homepagelocator = homepagelocator;
    }

    public Map<String, String> getSearchpagelocator() {
        return searchpagelocator;
    }

    public void setSearchpagelocator(Map<String, String> searchpagelocator) {
        this.searchpagelocator = searchpagelocator;
    }

    public Map<String, String> getStockdetaillocator() {
        return stockdetaillocator;
    }

    public void setStockdetaillocator(Map<String, String> stockdetaillocator) {
        this.stockdetaillocator = stockdetaillocator;
    }
}
