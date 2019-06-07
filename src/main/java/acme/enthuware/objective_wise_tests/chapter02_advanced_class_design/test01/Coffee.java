package acme.enthuware.objective_wise_tests.chapter02_advanced_class_design.test01;

public enum Coffee  //1
{
    ESPRESSO("Very Strong"), MOCHA, LATTE; //2
    public String strength; //3

    Coffee() {
    }

    Coffee(String strength) //4
    {
        this.strength = strength; //5
    }
}
