package com.yona.projects.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded // 내장타입
    private Address address;

    @Enumerated(EnumType.STRING)  // ORDINAL 하면 안됨
    private DeliveryStatus status; // READY, COMP
}
