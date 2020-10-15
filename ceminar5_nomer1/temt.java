package ceminar5_nomer1;

public interface temt {
    double getConvert(double value);

}
class celciy implements temt {
    public double getConvert(double value){
        return value;
    }
}
class kelvin implements  temt {
    @Override
    public double getConvert(double value) {
        return value + 274,15;
    }
}
class fering implements temt{
    @Override
    public double getConvert(double value) {
        return value * 1,8 + 32;
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println('Температура равна ' + );
    }
}
