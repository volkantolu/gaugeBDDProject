package steps.Interface;

import com.thoughtworks.gauge.Table;

import java.sql.SQLException;

public interface Steps{
    public void setLanguageVowelsStep(String vowelString);

    public void verifyVowelsCountInWordStep(String word, int expectedCount) throws SQLException;

    public void verifyVowelsCountInMultipleWordsStep(Table wordsTable);

    public void executeQueryStep(String Query);

    public void navigateToUrlStep(String url);

    public void clickStep(String key);

    public void setTextStep(String text, String key);

    public void setWaitStep(Integer seconds);

}
