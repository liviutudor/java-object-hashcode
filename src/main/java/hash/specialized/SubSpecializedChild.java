package hash.specialized;

import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;

public class SubSpecializedChild extends SpecializedChild {
    private Locale locale;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubSpecializedChild)) return false;
        if (!super.equals(o)) return false;
        SubSpecializedChild that = (SubSpecializedChild) o;
        return Objects.equals(locale, that.locale);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SubSpecializedChild.class.getSimpleName() + "[", "]")
                .add("locale=" + locale)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), locale);
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
