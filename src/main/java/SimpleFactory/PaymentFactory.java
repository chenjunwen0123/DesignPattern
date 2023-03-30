package SimpleFactory;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月29日 16:37
 */
public class PaymentFactory {
    public static Payment createPayment(String paymentType){
        Payment payment = null;
        switch (paymentType){
            case "WechatPay":
                payment = new WechatPayment();
                break;
            case "Alipay":
                payment = new AlipayPayment();
                break;
            default:
                throw new RuntimeException("no this specific Payment yet");
        }
        return payment;
    }
}
