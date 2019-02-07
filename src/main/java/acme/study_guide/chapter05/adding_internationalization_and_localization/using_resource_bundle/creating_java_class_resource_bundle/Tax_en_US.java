package acme.study_guide.chapter05.adding_internationalization_and_localization.using_resource_bundle.creating_java_class_resource_bundle;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

class UsTaxCode {
}

public class Tax_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"tax", new UsTaxCode()}};
    }

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle(
                "acme.study_guide.chapter05.adding_internationalization_and_localization.using_resource_bundle.creating_java_class_resource_bundle.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));
    }
}
