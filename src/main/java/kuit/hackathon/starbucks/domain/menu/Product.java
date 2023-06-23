package kuit.hackathon.starbucks.domain.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue(value = "P")
@PrimaryKeyJoinColumn
@Table(name = "product_menu")
public class Product extends Food {
    @Column(name = "size", length = 100)
    private String size;

    @Column(name = "temperature", length = 100)
    private String temperature;

    @Lob
    @Column(name = "exchange_refund_info")
    private String exchangeRefundInfo;

    @Lob
    @Column(name = "no_exchange_refund_info")
    private String noExchangeRefundInfo;

    @Column(name = "allergy", length = 100)
    private String allergy;

}
