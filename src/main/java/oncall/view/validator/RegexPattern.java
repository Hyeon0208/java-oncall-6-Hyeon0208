package oncall.view.validator;

import java.util.regex.Pattern;

public enum RegexPattern {
    ONLY_NUMBER(Pattern.compile("^[0-9]*$")),
    NAME_CONDITION(Pattern.compile("^[a-zA-Z가-힣]*$"));

    private final Pattern pattern;

    RegexPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public boolean matches(String value) {
        return pattern.matcher(value).matches();
    }
}