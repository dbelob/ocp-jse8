package acme.study_guide.chapter09.understanding_file_attributes.discovering_basic_file_attributes.managing_ownership_with_getowner_and_setowner;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipal;

public class Example {
    public static void main(String[] args) throws IOException {
        UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService()
                .lookupPrincipalByName("jane");
        System.out.println(owner);
    }
}
