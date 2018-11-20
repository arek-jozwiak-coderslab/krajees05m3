package pl.coderslab;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 *
 */
public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        String s = "a b c";
//        System.out.println(StringUtils.deleteWhitespace(s));
        logger.info("some info");
        logger.debug("aaaa");
        logger.error("some error");
    }
}
