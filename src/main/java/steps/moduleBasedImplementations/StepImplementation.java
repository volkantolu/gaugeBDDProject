package steps.moduleBasedImplementations;

import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import core.Retry;
import driver.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import steps.operations.SystemInfo;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@Test(retryAnalyzer = Retry.class)
public class StepImplementation extends DataBaseStepImpl {
    SystemInfo systemInfo = new SystemInfo();

    final static Logger logger = Logger.getLogger(StepImplementation.class);

    private HashSet<Character> vowels;

    WebDriver driver = null;
    WebElement webElement = null;

    public void navigateToUrl(String url) {
        try {
            driver = Driver.webDriver;
            driver.get(url);
        } catch (Exception e) {
            logger.error("Sorry, something wrong!", e);
            logger.error(systemInfo.Info());
        }
    }

    public void click(String key) {
        String value = getElementKeyValueByProjectAndLanguage(key);
        String selector = getElementsSelectorByKeyAndProjectAndLanguage(key);

        webElement = getWebElement(value,selector);
        webElement.click();
    }

    public void setText(String text, String key) {
        String value = getElementKeyValueByProjectAndLanguage(key);
        String selector = getElementsSelectorByKeyAndProjectAndLanguage(key);

        webElement = getWebElement(value,selector);
        webElement.sendKeys(text);
    }

    public void setWait(Integer seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            logger.error("Sorry, something wrong!", e);
            logger.error(systemInfo.Info());        }
    }

    public void setLanguageVowels(String vowelString) {
        vowels = new HashSet<>();
        for (char ch : vowelString.toCharArray()) {
            vowels.add(ch);
        }
    }

    public void verifyVowelsCountInWord(String word, int expectedCount) {
        int actualCount = countVowels(word);
        assertEquals(expectedCount, actualCount);
    }

    public void verifyVowelsCountInMultipleWords(Table wordsTable) {
        for (TableRow row : wordsTable.getTableRows()) {
            String word = row.getCell("Word");
            int expectedCount = Integer.parseInt(row.getCell("Vowel Count"));
            int actualCount = countVowels(word);

            assertEquals(expectedCount, actualCount);
        }
    }

    //common functions
    private int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    public WebElement getWebElement(String value, String selector){

        By by;
        WebElement webElement = null;

        if ("id".equals(selector)) {
            webElement = driver.findElement(By.id(value));
        }
        else if ("xpath".equals(selector)){
            webElement = driver.findElement(By.xpath(value));
        }

        return webElement;
    }
}
