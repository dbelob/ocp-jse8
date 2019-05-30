package acme.enthuware.standard_tests.test1.test10;

class OuterWorld
{
    public InnerPeace i = new InnerPeace();
    private class InnerPeace
    {
        private String reason = "none";
    }
    void m(){
        System.out.println(i.reason);
    }
}
