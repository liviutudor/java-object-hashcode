package hash;

import java.util.Objects;
import java.util.StringJoiner;

public class BaseClass {
    private int intValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseClass)) return false;
        BaseClass baseClass = (BaseClass) o;
        return intValue == baseClass.intValue;
    }

    ///////// WHAT HAPPENS IF I COMMENT THIS OUT? :)
    @Override
    public int hashCode() {
        return Objects.hash(intValue);
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BaseClass.class.getSimpleName() + "[", "]")
                .add("intValue=" + intValue)
                .toString();
    }
}
