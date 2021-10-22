public class CoinBuilder implements Builder{
    Metal m1,m2;
    int value;

    @Override
    public CoinBuilder metal1(Metal m) {
        m1=m;
        return this;
    }

    @Override
    public CoinBuilder metal2(Metal m) {
        m2=m;
        return this;
    }

    @Override
    public CoinBuilder valueOfCoin(int value) {
        this.value=value;
        return this;
    }

    public Coin build(){
        return new Coin(m1,m2,value);
    }
}
