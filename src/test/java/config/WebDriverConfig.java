package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebDriverConfig extends Config {

        @Key("baseUrl")
        @DefaultValue("https://demoqa.com")
        String getBaseUrl();

        @Key("remoteUrl")
        String getRemote();

        @Key("browser")
        @DefaultValue("chrome")
        String getBrowser();

        @Key("browserVersion")
        @DefaultValue("100.0")
        String getBrowserVersion();

        @Key("browserSize")
        @DefaultValue("1920x1080")
        String getBrowserSize();
}
