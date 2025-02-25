package model;

public class Space {

    private Integer actual;
    private final int EXPECTED;
    private final boolean FIXED;

    public Space(int expected, boolean fixed) {
        EXPECTED = expected;
        FIXED = fixed;
        if(fixed){
            actual = expected;
        }
    }

    public Integer getActual() { return actual; }
    public void setActual(final Integer actual) {
        if(FIXED) return;
        this.actual = actual;
    }

    public int getEXPECTED() { return EXPECTED; }

    public boolean isFIXED() { return FIXED; }

    public void clearSpace(){
        setActual(null);
    }
}
