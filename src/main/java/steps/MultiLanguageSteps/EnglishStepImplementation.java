package steps.MultiLanguageSteps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import core.Retry;
import org.testng.annotations.Test;
import steps.Interface.Steps;
import steps.moduleBasedImplementations.StepImplementation;

@Test(retryAnalyzer = Retry.class)
public class EnglishStepImplementation extends StepImplementation implements Steps {

    @Step("ENGLISH-Vowels in English language are <vowelString>.")
    public void setLanguageVowelsStep(String vowelString) {
        setLanguageVowels(vowelString);
    }

    @Step("ENGLISH-The word <word> has <expectedCount> vowels.")
    public void verifyVowelsCountInWordStep(String word, int expectedCount) {
        verifyVowelsCountInWord(word, expectedCount);
    }

    @Step("ENGLISH-Almost all words have vowels <wordsTable>")
    public void verifyVowelsCountInMultipleWordsStep(Table wordsTable) {
        verifyVowelsCountInMultipleWords(wordsTable);
    }

    @Step("ENGLISH-Execute <query> at database")
    public void executeQueryStep(String query) {
        executeQuery(query);
    }

    @Step("ENGLISH-Navigate to <amazon.com> url")
    public void navigateToUrlStep(String url) {
        navigateToUrl(url);
    }

    @Step("ENGLISH-Click to <object> object")
    public void clickStep(String key) {
        click(key);
    }

    @Step("ENGLISH-Enter <text> to <object> input object")
    public void setTextStep(String text, String key) {
        setText(text,key);
    }

    @Step("ENGLISH-Wait for <seconds> seconds")
    public void setWaitStep(Integer seconds) {
        setWait(seconds);
    }

}
