package kata6genericsTests;

public class ArmoredBody extends Body {
    @Override
    public void protect() {
        System.out.println("I have enough armor to kick back your rockets");
    }
}
