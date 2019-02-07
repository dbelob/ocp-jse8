package acme.study_guide.chapter05.adding_internationalization_and_localization.using_resource_bundle.creating_java_class_resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hello", "Hello"},
                {"open", "The zoo is open"}
        };
    }
}
