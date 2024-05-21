package s01_04.n2ejercicio1;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.equalTo;

public class StringLengthMatcher extends FeatureMatcher<String, Integer> {

        public StringLengthMatcher(Matcher<? super Integer> subMatcher) {
            super(subMatcher, "a string with length", "length");
        }

        @Override
        protected Integer featureValueOf(String actual) {
            return actual.length();
        }

        public static Matcher<String> hasLength(int length) {
            return new StringLengthMatcher(equalTo(length));
        }
    }

