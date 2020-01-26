package steps.moduleBasedImplementations;

import core.Retry;
import infrastructure.Database;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import steps.operations.SystemInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Test(retryAnalyzer= Retry.class)
public class DataBaseStepImpl extends Database {
    SystemInfo systemInfo = new SystemInfo();

    final static Logger logger = Logger.getLogger(DataBaseStepImpl.class);

    public String executeQuery(String query)  {
        Connection conn = Database.makeJDBCConnection();
        String value = "";

        Statement stmt = null;
        try {
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(query) ;

            //value = rs.getString("value");

            if(rs.next()) {
                value = rs.getString("value");
            }

        } catch (SQLException e) {
            logger.error("Sorry, something wrong!", e);
            logger.error(systemInfo.Info());
        }
    return value;
    }

    public String getElementKeyValueByProjectAndLanguage(String key)  {
        String query = "select value from elements_repo where elements_repo.project='amazon' and elements_repo.language='english' and elements_repo.alias='"+key+"'";
        String value = executeQuery(query);
        return value;
    }

    public String getElementsSelectorByKeyAndProjectAndLanguage(String key)  {
        String query = "select selector from elements_repo where elements_repo.project='amazon' and elements_repo.language='english' and elements_repo.alias='"+key+"'";
        String value = executeQuery(query);
        return value;
    }
}
