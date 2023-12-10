package oops.Interface;

public class nested {
    public interface inerr{
        boolean odd(int num);
    }
}
 class outer implements nested.inerr{

    @Override
    public boolean odd(int num) {
        return (num & 1)==1;
    }
}
