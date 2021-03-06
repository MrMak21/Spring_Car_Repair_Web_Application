package com.carshoprepair.carshop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="Repairs")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Repair_id")
    private Long id;

    @Column(name = "Date", nullable = false)
    private LocalDateTime date;

    @Column(name = "Kind", nullable = false)
    private String kind;

    @Column(name = "Cost", nullable = false)
    private Long cost;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name ="Status", nullable = false)
    private String status;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Person_id")
    private Person person;

    public Repair(LocalDateTime date, String kind, Long cost, String description, Person person,String status) {
        this.date = date;
        this.kind = kind;
        this.cost = cost;
        this.description = description;
        this.person = person;
        this.status=status;
    }

    public Repair() {
    }

    public Repair(Person person){
    this.person = person;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getKind() {
        return kind;
    }

    public Long getCost() {
        return cost;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public Person getPerson() {
        return person;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("id=").append(id);
        sb.append(", date='").append(date).append('\'');
        sb.append(", kind='").append(kind).append('\'');
        sb.append(", cost='").append(cost).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", person='").append(person.getFirstName()+" "+person.getLastName()).append('\'');
        sb.append('}');
        return sb.toString();
    }


}