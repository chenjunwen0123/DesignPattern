package Singleton.RegisterSingleton;

import lombok.AllArgsConstructor;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 8:34 PM
 * @Version v1.0
 */
@AllArgsConstructor
public enum EnumSingleton {

    SPRING("1","Spring"),
    AUTUMN("2","Autumn"),
    SUMMER("3","Summer"),
    WINTER("4","Winter")
    ;
    private final String type;
    private final String season;

}
