package acme.enthuware.objective_wise_tests.chapter02_advanced_class_design.test10;

interface Book {
    public default String getId() {
        return "ISBN123456";
    }
}

interface Encyclopedia extends Book {
    String getId();

//    default String getId() {
//        return "AIN8888";
//    }
}
