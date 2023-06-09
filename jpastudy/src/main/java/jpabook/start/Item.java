package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE")
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;
    private String name;
    private int price;

}
