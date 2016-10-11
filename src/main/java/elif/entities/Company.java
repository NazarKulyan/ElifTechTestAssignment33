package elif.entities;



import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nazar on 06.10.2016.
 */
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int earnings;
    @Column
    private int ParentId;
    @ElementCollection
    private List<Integer> childrensId;

    public Company() {
    }

    public Company(String name, int earnings, int parentId) {
        this.name = name;
        this.earnings = earnings;
        ParentId = parentId;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEarnings() {
        return earnings;
    }

    public void setEarnings(int earnings) {
        this.earnings = earnings;
    }
/*
    public List<Integer> getChildrensId() {
        return childrensId;
    }

    public void setChildrensId(List<Integer> childrensId) {
        this.childrensId = childrensId;
    }*/
}
