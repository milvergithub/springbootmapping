package com.milver.io.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "itmb_brand_item")
@NoArgsConstructor
public class BrandItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "itmb_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "itmb_brand_id", referencedColumnName = "br_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "itmb_item_id", referencedColumnName = "itm_id")
    private Item item;
}
