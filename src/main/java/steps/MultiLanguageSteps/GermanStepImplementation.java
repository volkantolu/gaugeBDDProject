package steps.MultiLanguageSteps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import core.Retry;
import org.testng.annotations.Test;
import steps.Interface.Steps;
import steps.moduleBasedImplementations.StepImplementation;

@Test(retryAnalyzer= Retry.class)
public class GermanStepImplementation extends StepImplementation implements Steps {

    @Step("GERMAN-Vowels in English language are <vowelString>.")
    public void setLanguageVowelsStep(String vowelString) {
        setLanguageVowels(vowelString);
    }

    @Step("GERMAN-The word <word> has <expectedCount> vowels.")
    public void verifyVowelsCountInWordStep(String word, int expectedCount) {
        verifyVowelsCountInWord(word,expectedCount);
    }

    @Step("GERMAN-Almost all words have vowels <wordsTable>")
    public void verifyVowelsCountInMultipleWordsStep(Table wordsTable) {
        verifyVowelsCountInMultipleWords(wordsTable);
    }

    @Step("GERMAN-Execute <query> at database")
    public void executeQueryStep(String query) {
        executeQuery(query);
    }

    @Step("GERMAN-Navigate to <amazon.com> url")
    public void navigateToUrlStep(String url) {
        navigateToUrl(url);
    }

    @Step("GERMAN-Click to <object> object")
    public void clickStep(String key) {
        click(key);
    }

    @Step("GERMAN-Enter <text> to <object> input object")
    public void setTextStep(String text, String key) {
        setText(text,key);
    }

    @Step("GERMAN-Wait for <seconds> seconds")
    public void setWaitStep(Integer seconds) {
        setWait(seconds);
    }
}
