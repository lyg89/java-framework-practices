import com.google.common.base.MoreObjects;
import lombok.Data;

/**
 * @description:
 * @author: liyaguang
 * @create: 2019-02-11 15:29
 **/
@Data
public class Car {

    private String brand;
    private String model;
    private int oil;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("brand", this.brand)
                .add("model", this.model)
                .add("oil", this.oil)
                .toString();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("audi");
        car.setModel("m3");
        car.setOil(100);
        System.out.println("------------");
        System.out.println(car);
    }
}
