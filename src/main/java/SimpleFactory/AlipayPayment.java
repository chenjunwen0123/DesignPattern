package SimpleFactory;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月29日 16:36
 */
public class AlipayPayment implements Payment{
    @Override
    public String getName() {
        return "AlipayPayment";
    }
}
