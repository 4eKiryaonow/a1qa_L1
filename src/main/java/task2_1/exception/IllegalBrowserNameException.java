package task2_1.exception;
import task2_1.webdriver.Browser;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class IllegalBrowserNameException extends IllegalArgumentException {

    public IllegalBrowserNameException() {
        super(String.format("Unsupported browser name. Supported browsers are %s",
                Arrays.stream(Browser.values())
                        .map(browser -> browser.name().toLowerCase(Locale.ROOT))
                        .collect(Collectors.joining(", "))
        ));
    }
}