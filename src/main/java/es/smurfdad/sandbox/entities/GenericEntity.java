package es.smurfdad.sandbox.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GENERICENTITY")
public class GenericEntity implements Serializable, Cloneable {

    private static final long serialVersionUID = -1659719597175337974L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String value1;

    private String value2;

    private String value3;

    private String value4;

    private String value5;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChildEntity> children;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue1() {
        return this.value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return this.value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return this.value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return this.value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getValue5() {
        return this.value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public List<ChildEntity> getChildren() {
        return this.children;
    }

    public void setChildren(List<ChildEntity> children) {
        this.children = children;
    }

}