package task3_1.util;

import org.apache.commons.lang.RandomStringUtils;

public class StringGenerator {

    public static String getRandomString(int length) {

        return RandomStringUtils.random(length,true,false);
    }
}
