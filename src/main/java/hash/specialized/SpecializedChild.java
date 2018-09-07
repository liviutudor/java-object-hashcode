package hash.specialized;

import hash.BaseClass;

import java.util.Objects;
import java.util.StringJoiner;

public class SpecializedChild extends BaseClass {
    private String stringValue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecializedChild)) return false;
        if (!super.equals(o)) return false;
        SpecializedChild that = (SpecializedChild) o;
        return Objects.equals(stringValue, that.stringValue);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SpecializedChild.class.getSimpleName() + "[", "]")
                .add("stringValue='" + stringValue + "'")
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
