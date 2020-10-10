package exception;

import com.day11.exception.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class Moodanalyser { 
	
	MoodAnalyser ma = new MoodAnalyser();

    @Test
    public void TestAnalyzeMood() {
        String mood = "Happy";
        Assert.assertThat(mood, CoreMatchers.is(ma.analyzeMood("I'm good")));

    }

}


