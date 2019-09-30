package com.milver.io.domain;

import com.milver.io.domain.custom.ItemCustom;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import java.io.Serializable;

@SqlResultSetMappings(value = {
        @SqlResultSetMapping(
                name = "Item.findAllNative",
                entities = @EntityResult(
                        entityClass = Item.class,
                        fields = {
                                @FieldResult(name = "id",           column = "itm_id"),
                                @FieldResult(name = "name",         column = "itm_name"),
                                @FieldResult(name = "description",  column = "itm_description"),
                                @FieldResult(name = "active",       column = "itm_active"),
                        }
                )
        ),
        @SqlResultSetMapping(
                name = "Item.findAllNativeFilter",
                classes = {
                        @ConstructorResult(targetClass = ItemCustom.class,
                                columns = {
                                        @ColumnResult(name = "itm_id",          type = Integer.class),
                                        @ColumnResult(name = "itm_name",        type = String.class),
                                        @ColumnResult(name = "itm_description", type = String.class),
                                        @ColumnResult(name = "itm_active",      type = Boolean.class)
                                }
                        )
                }
        ),
        @SqlResultSetMapping(
                name = "Item.findAllNativeBy",
                classes = {
                        @ConstructorResult(targetClass = ItemCustom.class,
                                columns = {
                                        @ColumnResult(name = "itm_id",          type = Integer.class),
                                        @ColumnResult(name = "itm_name",        type = String.class),
                                        @ColumnResult(name = "itm_description", type = String.class)
                                }
                        )
                }
        ),
})
@Entity
@Getter
@Setter
@Table(name = "itm_item")
@NoArgsConstructor
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itm_id")
    private Long id;

    @Column(name = "itm_name")
    private String name;

    @Column(name = "itm_description")
    private String description;

    @Column(name = "itm_active")
    private Boolean active;
}

