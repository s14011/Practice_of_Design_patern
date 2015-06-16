package jp.ac.it_college.std.s14011.pdp.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by s14011 on 15/06/16.
 */
public class Database {
    private Database() {
    }
    public static Properties getProperties(String dbname) {

        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        }catch (IOException e) {
            System.out.println("Warning: " + filename + "is not found.");
        }
        return prop;
    }
}
