package exception;
import com.day11.exception.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
public class MAclass {

	@Test
    public void TestAnalyzeMood() throws MoodAnalysisException {
        MoodAnalyser ma = new MoodAnalyser("I am Good");
        String mood = "Happy";
        Assert.assertThat(mood, CoreMatchers.is(ma.analyzeMood()));
    }
}


