public ExampleClass {
    private boolean exampleBool = false;

    public boolean getExampleBool() {
        return exampleBool;
    }

    void someMethodOrOther() {
        if(somethingImportantHappensOnRuntime()) {
            exampleBool = true;
        }
    }
}   